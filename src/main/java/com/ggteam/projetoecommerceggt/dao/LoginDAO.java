package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;

// Model
import com.ggteam.projetoecommerceggt.models.UserClient;
import com.ggteam.projetoecommerceggt.models.UserCollaborator;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class LoginDAO {
  ResourcesDAO entityM = (ResourcesDAO) new ResourcesDAO();
  private final EntityManager entityManager = entityM.getEntityManager();

  public LoginDAO() {
  }
  
  public UserClient getUserClient(String email, String senha){
    try {
      UserClient usuario = (UserClient) entityManager
        .createQuery(
          "SELECT u FROM UserClient u WHERE "
          + "u.email = :email_sql AND u.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return usuario;
    } catch (Exception e) {
      return null;
    } 
  }
  
  public UserCollaborator getUserCollaborator(String email, String senha){
    try {
      UserCollaborator usuario = (UserCollaborator) entityManager
        .createQuery(
          "SELECT u FROM UserCollaborator u WHERE "
          + "u.email = :email_sql AND u.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return usuario;
    } catch (Exception e) {
      return null;
    } 
  }
}
