package com.ggteam.projetoecommerceggt.svServices;

import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "ShoppingCart", urlPatterns = {"/Cart"})
public class ShoppingCart extends HttpServlet {
    
    List<String> carrinho = new ArrayList<>();
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
    
    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getIncludeURL(
      "/menu/list_my-cart.jsp", 
      request, response
    );
    
//    Adiciona produtos ao carrinho e seta na sessão
    if(request.getParameter("add_car") != null){
        
        carrinho.add(request.getParameter("add_car"));
        request.getSession().setAttribute("carrinho",carrinho);
        
        response.sendRedirect("Cart");
    }
    
        if(request.getParameter("remove_car") != null && request.getParameter("remove_car").equals("all")){
        
        request.getSession().removeAttribute("carrinho");
        carrinho.removeAll(carrinho);
        response.sendRedirect("Cart");
        }
//        if(request.getParameter("remove_car") != null && request.getParameter("remove_car") "all") {
//            carrinho.remove( Integer.parseInt(request.getParameter("remove_car")));
////             response.sendRedirect("Cart");
//        }
//    
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
