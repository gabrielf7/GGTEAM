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

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Client", urlPatterns = {"/Client"})
public class HomeClient extends HttpServlet {
  
  private EntityManager getEntityManager() {
    //Obtem o factory a partir da unidade de persistencia.
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

    request.getRequestDispatcher("homeClient/client.jsp").include(request, response);
  }
   
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
