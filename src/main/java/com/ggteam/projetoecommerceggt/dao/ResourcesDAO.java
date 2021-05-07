package com.ggteam.projetoecommerceggt.dao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


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
    //Obtém o factory a partir da unidade de persistência.
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
      "ProjetoEcommerceGGT"
    );
    //Cria um entity manager.
    EntityManager entityManager = factory.createEntityManager();

    return entityManager;
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
  
}
