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

// Models
import com.ggteam.projetoecommerceggt.models.UserClient;
import com.ggteam.projetoecommerceggt.models.UserCollaborator;

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
    
    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getIdentifySessionLogin(
      "IdUser",
      "/Welcome",
      request, response
    );
    srcDao.getIncludeURL(
      "login/login.jsp", 
      request, response
    );
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
      
      UserClient Authenticator1 = loginIdentify
        .getUserClient(email, senha);
      UserCollaborator Authenticator2 = loginIdentify
        .getUserCollaborator(email, senha);

      if ("Pessoal".equals(conta)) {
        if (Authenticator1 == null) {
          System.out.println("Error ao fazer login");
          response.sendRedirect(request.getContextPath() + "/Login?clt=false");
        } else {
          System.out.println(
            "[Login] O cLiente de ID: "
            +Authenticator1.getId()+" está logado."
          );
          request.getSession().setAttribute("IdUser", Authenticator1.getId());
          request.getSession().setAttribute("UserName", Authenticator1.getNickname());
          request.getSession().setAttribute("Profile", "Client");
          request.getSession().setAttribute("MyUrl", "MyShopping");
          request.getSession().setAttribute("MyUrlName", "Minhas Compras");
          response.sendRedirect(request.getContextPath() + "/Client");
        }
      }

      if ("Colaborador".equals(conta)) {
        if (Authenticator2 == null) {
          System.out.println("Error ao fazer login");
          response.sendRedirect(request.getContextPath() + "/Login?clt=false");
        } else {
          System.out.println(
            "[Login] O colaborador de ID: "
            +Authenticator2.getId()+" está logado."
          );
          request.getSession().setAttribute("IdUser", Authenticator2.getId());
          request.getSession().setAttribute("UserName", Authenticator2.getNome());
          request.getSession().setAttribute("Profile", "Collaborator");
          request.getSession().setAttribute("MyUrl", "MyProducts");
          request.getSession().setAttribute("MyUrlName", "Meus Produtos");
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
