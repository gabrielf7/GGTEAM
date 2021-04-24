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
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    request.getRequestDispatcher("/login_client/cadastrar_client/cadastro_client.jsp").include(request, response);
  }
  
  public UsuarioCliente getIdentificarCliente(String email, String cpf){
    try {
      EntityManager entityManager = getEntityManager();

      UsuarioCliente usuario = (UsuarioCliente) entityManager
        .createQuery(
          "SELECT u FROM UsuarioCliente u WHERE "
          + "u.email = :email_sql OR u.cpf = :cpf_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("cpf_sql", cpf).getSingleResult();

      return usuario;
    } catch (Exception e) {
      // System.out.println("result: " + e.getMessage());
      return null;
    }
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
      usr_cliente.setLocalidade(cidade + ", " + estado);
      usr_cliente.setUltimoAcesso(formato.format(dataHoje));

      UsuarioCliente identificarCliente = getIdentificarCliente(email, cpf);

      // Verificar se os campos foram preenchidos corretamente.
      if ( cpf == null || email == null ) {
        response.sendRedirect(request.getContextPath() + "/Cliente?naddclt=false");
      }
      // Verificar se o cliente já existe no DB.
      if ( identificarCliente == null ) {
        // Inicia uma transação com o banco de dados, para add novo cliente.
        entityManager.getTransaction().begin();
        entityManager.persist(usr_cliente);
        entityManager.getTransaction().commit();

        response.sendRedirect(request.getContextPath() + "/Login");
      } else {
        response.sendRedirect(request.getContextPath() + "/Cliente?addclt=true");
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
