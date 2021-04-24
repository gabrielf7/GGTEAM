package com.ggteam.projetoecommerceggt.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model
import com.ggteam.projetoecommerceggt.models.UserCollaborator;

// DAO 
import com.ggteam.projetoecommerceggt.dao.CollaboratorDAO;

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
@WebServlet(name = "CLBRegistered", urlPatterns = {"/CLBRegistered"})
public class LoginRegisteredCLB extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");

    request.getRequestDispatcher(
      "/login/register_collaborator/registered_collaborator.jsp"
    ).include(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    CollaboratorDAO collaborator = new CollaboratorDAO();
    EntityManager entityManager = collaborator.getEntityManager();

    try {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      LocalDateTime dataHoje = LocalDateTime.now();
      
      String nome = request.getParameter("nome_user");
      String snome = request.getParameter("sobrenome_user");
      String cnpj = request.getParameter("cnpj_user");
      String rzsocial = request.getParameter("razaosocial_user");
      String email = request.getParameter("email_user");
      String senha = request.getParameter("senha_user");
      
      UserCollaborator usr_collaborator = new UserCollaborator();
      usr_collaborator.setNome(nome);
      usr_collaborator.setSobrenome(snome);
      usr_collaborator.setCnpj(cnpj);
      usr_collaborator.setRazaosocial(rzsocial);
      usr_collaborator.setEmail(email);
      usr_collaborator.setSenha(senha);
      usr_collaborator.setUltimoAcesso(formato.format(dataHoje));

      // Verificar se os campos foram preenchidos corretamente.
      if ( cnpj == null || email == null ) {
        response.sendRedirect(request.getContextPath() + "/CLBRegistered?naddclb=false");
      }
      // Verificar se o cliente ja existe no DB.
      if ( collaborator.getIdentifyCollaborator(email, cnpj, rzsocial) == null ) {
        // Inicia uma transação com o banco de dados, para add novo cliente.
        entityManager.getTransaction().begin();
        entityManager.persist(usr_collaborator);
        entityManager.getTransaction().commit();

        response.sendRedirect(request.getContextPath() + "/Login");
      } else {
        response.sendRedirect(request.getContextPath() + "/CLBRegistered?addclb=true");
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
