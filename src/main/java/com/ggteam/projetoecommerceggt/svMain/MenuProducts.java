package com.ggteam.projetoecommerceggt.svMain;

import com.ggteam.projetoecommerceggt.dao.ProductDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ggteam.projetoecommerceggt.models.Produto;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Product", urlPatterns = {"/Product"})
public class MenuProducts extends HttpServlet {

  protected void list_product(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    try {
      ProductDAO produto = new ProductDAO();
      List<Produto> produtos = produto.listAll();
      request.setAttribute("produtos", produtos);
      request.getRequestDispatcher("/menu/list_product.jsp").forward(request, response);
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
