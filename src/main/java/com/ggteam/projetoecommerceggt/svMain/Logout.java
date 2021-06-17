package com.ggteam.projetoecommerceggt.svMain;

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
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    // Invalida sessão e redireciona para tela principal
    request.getSession().invalidate();
    response.sendRedirect(request.getContextPath() + "/Welcome");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
