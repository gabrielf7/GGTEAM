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
@WebServlet(name = "PageErrors", urlPatterns = {"/Unknown"})
public class PageErrors extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    ResourcesDAO srcDao = new ResourcesDAO();

    Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

    request.setAttribute("errorType", throwable);
    request.setAttribute("statusCode", statusCode);
    response.setStatus(HttpServletResponse.SC_OK);
    request.setAttribute("javax.servlet.error.exception", null);
    request.setAttribute("javax.servlet.error.status_code", null);

    if(statusCode == 404) {
      request.setAttribute("messageError", 
        "Essa página não existe."
      );
    } else if(statusCode == 500){
      request.setAttribute("messageError", 
        "Erro encontrado no serivdor, tente acessar novamente mais tarde."
      );
    }

    srcDao.getIncludeURL(
      "/app_src/page-errors/page-errors.jsp", 
      request, response
    );
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
