package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;

// Model
import com.ggteam.projetoecommerceggt.models.Administrator;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class LoginAdmDAO {
  ResourcesDAO entityM = (ResourcesDAO) new ResourcesDAO();
  private final EntityManager entityManager = entityM.getEntityManager();

  public LoginAdmDAO() {
  }

  public void addAdm(String email, String senha){
    try {
      Administrator usr_adm = new Administrator();
      usr_adm.setEmail(email);
      usr_adm.setSenha(senha);
      
      entityManager.getTransaction().begin();
      entityManager.persist(usr_adm);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      System.out.println("Erro no cadastrado de Administrador: " + e.getMessage());
    } finally {
      // Fecha conexao
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      entityManager.close();
    }
  }
  
  public Administrator getUserAdministrator(String email, String senha){
    try {
      Administrator adm = (Administrator) entityManager
        .createQuery(
          "SELECT a FROM Administrator a WHERE "
          + "a.email = :email_sql AND a.senha = :senha_sql"
        )
        .setParameter("email_sql", email)
        .setParameter("senha_sql", senha).getSingleResult();

      return adm;
    } catch (Exception e) {
      System.out.println("Erro na verificação do cliente no login: " + e.getMessage());
      return null;
    } 
  }
}
