package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;

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
  ResourcesDAO entityM = (ResourcesDAO) new ResourcesDAO();
  private final EntityManager entityManager = entityM.getEntityManager();

  public CollaboratorDAO() {
  }
  
  public void addCollaborator(UserCollaborator usr_collaborator){
    try {
      // Inicia uma transação com o banco de dados, para add novo cliente.
      entityManager.getTransaction().begin();
      entityManager.persist(usr_collaborator);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      System.out.println("Erro no cadastrado de colaborador: " + e.getMessage());
    } finally {
      // Fecha conexao
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      entityManager.close();
    }
  }
  
  public UserCollaborator getIdentifyCollaborator(String email, String cnpj, String rzsocial){
    try {
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
      return null;
    }
  }
}
