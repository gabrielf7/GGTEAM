package com.ggteam.projetoecommerceggt.adm;

import com.ggteam.projetoecommerceggt.dao.LoginAdmDAO;
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
@WebServlet(name = "LoginADM", urlPatterns = {"/dono"})
public class LoginADM extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");

    request.getRequestDispatcher("/app_adm_7w7/adm_login/adm_login.jsp").include(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    LoginAdmDAO loginIdentify = new LoginAdmDAO();
    
    String email = request.getParameter("email_login");
    String senha = request.getParameter("senha_login");
    
    if (loginIdentify.getUserAdministrator(email, senha) == null) {
      System.out.println("Error ao fazer login");
      response.sendRedirect(request.getContextPath() + "/dono?adm=false");
    } else {
      System.out.println("Logado o ADM");
      response.sendRedirect(request.getContextPath() + "/Administrador");
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
