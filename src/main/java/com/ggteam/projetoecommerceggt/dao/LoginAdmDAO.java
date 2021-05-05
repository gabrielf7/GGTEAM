package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

  public LoginDAO() {
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
  
  public UserClient getUserClient(String email, String senha){
    try {
      EntityManager entityManager = getEntityManager();

      UserClient usuario = (UserClient) entityManager
        .createQuery(
          "SELECT u FROM UserClient u WHERE "
          + "u.email = :email_sql AND u.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return usuario;
    } catch (Exception e) {
      System.out.println("Erro na verificação do cliente no login: " + e.getMessage());
      return null;
    } 
  }
  
  public UserCollaborator getUserCollaborator(String email, String senha){
    try {
      EntityManager entityManager = getEntityManager();

      UserCollaborator usuario = (UserCollaborator) entityManager
        .createQuery(
          "SELECT u FROM UserCollaborator u WHERE "
          + "u.email = :email_sql AND u.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return usuario;
    } catch (Exception e) {
      System.out.println("Erro na verificação do colaborador no login: " + e.getMessage());
      return null;
    } 
  }
}
