package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Model
import com.ggteam.projetoecommerceggt.models.UserClient;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class ClientDAO {

  public ClientDAO() {
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
  
  public UserClient getIdentifyClient(String email, String cpf, String nkname){
    try {
      EntityManager entityManager = getEntityManager();

      UserClient usuario = (UserClient) entityManager
        .createQuery(
          "SELECT u FROM UserClient u WHERE "
          + "u.email = :email_sql OR u.cpf = :cpf_sql OR u.nickname = :nkname_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("cpf_sql", cpf)
        .setParameter("nkname_sql", nkname).getSingleResult();

      return usuario;
    } catch (Exception e) {
      System.out.println("result: " + e.getMessage());
      return null;
    }
  }
}
