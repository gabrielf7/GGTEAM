package com.ggteam.projetoecommerceggt.svMain;

import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;
import java.io.IOException;
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
@WebServlet(name = "Shop", urlPatterns = {"/Shop"})
public class MenuShops extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getIncludeURL(
      "/menu/list_shop.jsp", 
      request, response
    );
    
    String destroy_fone = request.getParameter("remove_fone");
    String destroy_celular = request.getParameter("remove_celular");
    
    if(request.getParameter("remove_fone") != null){
        
        request.getSession().removeAttribute(destroy_fone);
        response.sendRedirect("Shop");
    }
    
    if(destroy_celular != null){
        
        request.getSession().removeAttribute(destroy_celular);
        response.sendRedirect("Shop");
    }
  }
  
  
  
    /**
     *
     * @param request
     * @param response
     * @throws java.io.IOException
     */
    @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
      
      String carrinho_fone = request.getParameter("carrinho_fone");
      String carrinho_celular = request.getParameter("carrinho_celular");
      request.getSession().setAttribute("carrinho_fone", carrinho_fone);

      request.getSession().setAttribute("carrinho_celular", carrinho_celular);
      
      response.sendRedirect("Shop");
      
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
