package com.ggteam.projetoecommerceggt.svMain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

// Models
import com.ggteam.projetoecommerceggt.models.Produto;

// DAO 
import com.ggteam.projetoecommerceggt.dao.ProductDAO;
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Category", urlPatterns = {"/Category"})
public class MenuCategories extends HttpServlet {
  
  protected void list_product(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    try {
      ProductDAO produto = new ProductDAO();
      ResourcesDAO srcDao = new ResourcesDAO();
      
      List<Produto> produtos = produto.listAll();
      request.setAttribute("produtos", produtos);
      srcDao.getIncludeURL(
        "/menu/list_category.jsp", 
        request, response
      );
    } catch (SQLException e) {
      System.out.println("Erro na rota da lista de produtos: " + e.getMessage());
    }
  }
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    list_product(request, response);
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
