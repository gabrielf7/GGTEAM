package com.ggteam.projetoecommerceggt.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// DAO 
import com.ggteam.projetoecommerceggt.dao.LoginDAO;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    request.getRequestDispatcher("login/login.jsp").include(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    LoginDAO loginIdentify = new LoginDAO();
    
    String email = request.getParameter("email_login");
    String senha = request.getParameter("senha_login");
    String conta = request.getParameter("conta_login");

    if ("Pessoal".equals(conta)) {
      if (loginIdentify.getUserClient(email, senha) == null) {
        System.out.println("Error ao fazer login");
        response.sendRedirect(request.getContextPath() + "/Login?clt=false");
      } else {
        System.out.println("Logado o CLiente");
        response.sendRedirect(request.getContextPath() + "/Client");
      }
    }
    
    if ("Colaborador".equals(conta)) {
      if (loginIdentify.getUserCollaborator(email, senha) == null) {
        System.out.println("Error ao fazer login");
        response.sendRedirect(request.getContextPath() + "/Login?clt=false");
      } else {
        System.out.println("Logado o Colaborador");
        response.sendRedirect(request.getContextPath() + "/Collaborator");
      }
    }
  }
  
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
