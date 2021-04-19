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

// Models
import com.ggteam.projetoecommerceggt.models.Categoria;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "CadCategoria", urlPatterns = {"/CadCategoria"})
public class CadCategoria extends HttpServlet {
  
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

    request.getRequestDispatcher("/home.jsp").include(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    EntityManager entityManager = getEntityManager();

    try {   
      String nome = request.getParameter("name_categoria");

      Categoria categoria = new Categoria();
      categoria.setNome(nome);

      entityManager.getTransaction().begin();
      entityManager.persist(categoria);
      entityManager.getTransaction().commit();

      response.sendRedirect(request.getContextPath() + "/Home");

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
