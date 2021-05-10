package com.ggteam.projetoecommerceggt.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Models
import javax.servlet.RequestDispatcher;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class ResourcesDAO {

  public ResourcesDAO() {
  }
  
  public EntityManager getEntityManager() {
    try {
      //Obtém o factory a partir da unidade de persistência.
      EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        "ProjetoEcommerceGGT"
      );
      //Cria um entity manager.
      EntityManager entityManager = factory.createEntityManager();

      return entityManager;
    } catch(Exception e) {
      System.out.println("Erro na conexão do banco de dados: " + e.getMessage());
    }
    return null;
  }
  
  public String createPassword(String password) throws NoSuchAlgorithmException,
    UnsupportedEncodingException {

    MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
    byte messageDigest[] = algorithm.digest(password.getBytes("UTF-8"));

    StringBuilder hexString = new StringBuilder();
    for (byte b : messageDigest) {
      hexString.append(String.format("%02X", 0xFF & b));
    }
    String passwordHex = hexString.toString();

    return passwordHex;
  }
  
  public void getLoginSession(HttpServletRequest request, 
    HttpServletResponse response) throws IOException, ServletException {
    Long id_usr = (Long) request.getSession().getAttribute("IdUser");
    if (id_usr == null) {
      response.sendRedirect(request.getContextPath() + "/Login");
    }
  }
  
  public void getIdentifySessionLogin(HttpServletRequest request, 
    HttpServletResponse response) throws IOException, ServletException {
    Long id_usr = (Long) request.getSession().getAttribute("IdUser");
    if (id_usr != null) {
      response.sendRedirect(request.getContextPath() + "/Welcome");
    }
  }
  
  public RequestDispatcher getIncludeURL(String url, 
    HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    RequestDispatcher urlSession = request.getRequestDispatcher(url);
    urlSession.include(request, response);
    return urlSession;
  }
}
