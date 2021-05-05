package com.ggteam.projetoecommerceggt.dao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
