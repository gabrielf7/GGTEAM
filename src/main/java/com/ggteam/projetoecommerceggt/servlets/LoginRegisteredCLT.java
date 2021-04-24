package com.ggteam.projetoecommerceggt.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model
import com.ggteam.projetoecommerceggt.models.UserClient;

// DAO 
import com.ggteam.projetoecommerceggt.dao.ClientDAO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.EntityManager;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Registered", urlPatterns = {"/Registered"})
public class LoginRegisteredCLT extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    if ("Collaborator".equals(request.getParameter("add"))) {
      request.getRequestDispatcher(
        "/login/register_collaborator/registered_collaborator.jsp"
      ).include(request, response);
    } else {
      request.getRequestDispatcher(
        "/login/register_client/registered_client.jsp"
      ).include(request, response);
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    ClientDAO client = new ClientDAO();
    EntityManager entityManager = client.getEntityManager();

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

      UserClient usr_cliente = new UserClient();
      usr_cliente.setNome(nome);
      usr_cliente.setSobrenome(snome);
      usr_cliente.setNickname(nkname);
      usr_cliente.setEmail(email);
      usr_cliente.setSenha(senha);
      usr_cliente.setCpf(cpf);
      usr_cliente.setLocalidade(cidade + ", " + estado);
      usr_cliente.setUltimoAcesso(formato.format(dataHoje));

      // Verificar se os campos foram preenchidos corretamente.
      if ( cpf == null || email == null ) {
        response.sendRedirect(request.getContextPath() + "/Registered?naddclt=false");
      }
      // Verificar se o cliente ja existe no DB.
      if ( client.getIdentifyClient(email, cpf, nkname) == null ) {
        // Inicia uma transação com o banco de dados, para add novo cliente.
        entityManager.getTransaction().begin();
        entityManager.persist(usr_cliente);
        entityManager.getTransaction().commit();

        response.sendRedirect(request.getContextPath() + "/Login");
      } else {
        response.sendRedirect(request.getContextPath() + "/Registered?addclt=true");
      }

    } finally {
      // Fecha conexao
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
