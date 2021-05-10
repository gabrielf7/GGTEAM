package com.ggteam.projetoecommerceggt.svMain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// DAO
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;

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

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");

    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getLoginSession(request, response);
    srcDao.getIncludeURL(
      "/homeClient/client.jsp", 
      request, response
    );
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
