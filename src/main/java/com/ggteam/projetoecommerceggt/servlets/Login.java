/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ggteam.projetoecommerceggt.servlets;

import com.ggteam.projetoecommerceggt.models.UsuarioCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
  
  private EntityManager getEntityManager() {
    //Obtém o factory a partir da unidade de persistência.
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoEcommerceGGT");
    //Cria um entity manager.
    EntityManager entityManager = factory.createEntityManager();

    return entityManager;
  }
  
  public UsuarioCliente getUsuario(String email, String senha){
    try {
      EntityManager entityManager = getEntityManager();

      UsuarioCliente usuario = (UsuarioCliente) entityManager
        .createQuery(
          "SELECT u FROM UsuarioCliente u WHERE u.email = :email_sql and u.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return usuario;
    } catch (Exception e) {
      System.out.println("result: " + e.getMessage());
      //System.out.println("senha: " + senha);
      return null;
    }
  }
  
  public String validar(UsuarioCliente validoUser) {
    if (validoUser == null) {
      System.out.println("No Logar" + validoUser);
      return "Error ao fazer login";
    } else {
      System.out.println("Logar");
      return "logado";
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String email = request.getParameter("email_login");
    String senha = request.getParameter("senha_login");
    
    UsuarioCliente validoUser = getUsuario(email, senha);
    String v = validar(validoUser);
    
    if ("logado".equals(v)) {
      response.setContentType("text/html");
      try (PrintWriter out = response.getWriter()) {
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
          out.println("<meta http-equiv=\"Refresh\" content=\"0;URL=home.jsp\">");
          out.println("</head>");
          out.println("<body>");
          out.println("</body>");
          out.println("</html>");
          out.close();
        }
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
