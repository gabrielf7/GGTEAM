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
import com.ggteam.projetoecommerceggt.models.Produto;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "CadProduto", urlPatterns = {"/CadProduto"})
public class CadProduto extends HttpServlet {
  
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

    request.getRequestDispatcher("homeCollaborator/collaborator.jsp").include(request, response);
  }
   
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    EntityManager entityManager = getEntityManager();

    try {   
      String nome = request.getParameter("name_product");
      String descricao = request.getParameter("description_product");
      String categoria = request.getParameter("category_product");
      String valor = request.getParameter("value_product");
      String estoque = request.getParameter("stock_product");

      Produto produto = new Produto();
      produto.setNome(nome);
      produto.setDescricao(descricao);
      produto.setCategoria(categoria);
      produto.setValor(valor);
      produto.setEstoque(estoque);

      entityManager.getTransaction().begin();
      entityManager.persist(produto);
      entityManager.getTransaction().commit();

      response.sendRedirect(request.getContextPath() + "/Collaborator");

    } catch (IOException e) {
      System.out.println("Erro no cadastrado de produto: " + e.getMessage());
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
