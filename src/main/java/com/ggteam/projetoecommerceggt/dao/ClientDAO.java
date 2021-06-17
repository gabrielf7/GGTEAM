package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;

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
  ResourcesDAO entityM = (ResourcesDAO) new ResourcesDAO();
  private final EntityManager entityManager = entityM.getEntityManager();

  public ClientDAO() {
  }
  
  public void addClient(UserClient usr_client){
    try {
      // Inicia uma transação com o banco de dados, para add novo cliente.
      entityManager.getTransaction().begin();
      entityManager.persist(usr_client);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      System.out.println("Erro no cadastrado de Cliente: " + e.getMessage());
    } finally {
      // Fecha conexao
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      entityManager.close();
    }
  }
  
  public UserClient getIdentifyClient(String email, String cpf, String nkname){
    try {
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
      return null;
    }
  }
}
