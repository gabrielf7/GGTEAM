package com.ggteam.projetoecommerceggt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Model
import com.ggteam.projetoecommerceggt.models.Administrator;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class LoginAdmDAO {

  public LoginAdmDAO() {
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

  public void addAdm(String email, String senha){
    EntityManager entityManager = getEntityManager();
    ResourcesDAO createPW = new ResourcesDAO();

    try {
      senha = createPW.createPassword(senha);
      Administrator usr_adm = new Administrator();
      usr_adm.setEmail(email);
      usr_adm.setSenha(senha);
      
      entityManager.getTransaction().begin();
      entityManager.persist(usr_adm);
      entityManager.getTransaction().commit();
    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
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
      EntityManager entityManager = getEntityManager();

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
