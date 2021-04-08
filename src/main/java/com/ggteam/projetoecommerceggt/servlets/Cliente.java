package com.ggteam.projetoecommerceggt.servlets;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model
import com.ggteam.projetoecommerceggt.models.UsuarioCliente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Cliente", urlPatterns = {"/Cliente"})
public class Cliente extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");

    request.getRequestDispatcher("/login_client/cadastrar_client/cadastro_client.jsp").include(request, response);
  }

  private EntityManager getEntityManager() {
    //Obtém o factory a partir da unidade de persistência.
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
      "ProjetoEcommerceGGT"
    );
    //Cria um entity manager.
    EntityManager entityManager = factory.createEntityManager();

    return entityManager;
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    EntityManager entityManager = getEntityManager();

    try {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      LocalDateTime dataHoje = LocalDateTime.now();
      
      String nome = request.getParameter("nome_user");
      String snome = request.getParameter("sobrenome_user");
      String nkname = request.getParameter("nickname_user");
      String email = request.getParameter("email_user");
      String senha = request.getParameter("senha_user");
      String cpf = request.getParameter("cpf_user");
      String cidade = request.getParameter("cidade_user");
      String estado = request.getParameter("estado_user");

      UsuarioCliente usr_cliente = new UsuarioCliente();
      usr_cliente.setNome(nome);
      usr_cliente.setSobrenome(snome);
      usr_cliente.setNickname(nkname);
      usr_cliente.setEmail(email);
      usr_cliente.setSenha(senha);
      usr_cliente.setCpf(cpf);
      // usr_cliente.setCpf(Integer.parseInt(cpf));
      usr_cliente.setLocalidade(cidade + ", " + estado);
      usr_cliente.setUltimoAcesso(formato.format(dataHoje));
      
      // System.out.println("result: " + request.getContextPath());
      
      // Verificar se os campos foram preenchidos corretamente.
      if ( email == null || cpf == null ) {
        response.sendRedirect(request.getContextPath() + "/Cliente");
      } else {
        // Inicia uma transação com o banco de dados.
        entityManager.getTransaction().begin();
        entityManager.persist(usr_cliente);
        entityManager.getTransaction().commit();

        response.sendRedirect(request.getContextPath() + "/Login");
      }
    } finally {
      // Fecha conexão
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      
      entityManager.close();
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
