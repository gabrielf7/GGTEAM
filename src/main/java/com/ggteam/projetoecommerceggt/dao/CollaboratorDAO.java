package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Model
import com.ggteam.projetoecommerceggt.models.UserCollaborator;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class CollaboratorDAO {

  public CollaboratorDAO() {
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
  
  public UserCollaborator getIdentifyCollaborator(String email, String cnpj, String rzsocial){
    try {
      EntityManager entityManager = getEntityManager();

      UserCollaborator usuario = (UserCollaborator) entityManager
        .createQuery(
          "SELECT u FROM UserCollaborator u WHERE "
          + "u.email = :email_sql OR u.cnpj = :cnpj_sql OR u.razaosocial = :rzsocial_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("cnpj_sql", cnpj)
        .setParameter("rzsocial_sql", rzsocial).getSingleResult();

      return usuario;
    } catch (Exception e) {
      System.out.println("result: " + e.getMessage());
      return null;
    }
  }
}
