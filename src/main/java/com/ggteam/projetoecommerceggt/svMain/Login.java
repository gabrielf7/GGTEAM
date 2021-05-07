package com.ggteam.projetoecommerceggt.svMain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

// DAO 
import com.ggteam.projetoecommerceggt.dao.LoginDAO;
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;

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
    throws ServletException, IOException, UnsupportedEncodingException {
    LoginDAO loginIdentify = new LoginDAO();
    ResourcesDAO srcDao = new ResourcesDAO();
    
    try {
      String email = request.getParameter("email_login");
      String senha = request.getParameter("senha_login");
      senha = srcDao.createPassword(senha);
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
      
    } catch (NoSuchAlgorithmException ex) {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
