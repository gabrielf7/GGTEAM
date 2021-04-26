package com.ggteam.projetoecommerceggt.dao;

import com.ggteam.projetoecommerceggt.models.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class ProductDAO {

  public ProductDAO() {
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
  
  public List<Produto> listAll() throws SQLException {
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    List<Produto> listarProduto = new ArrayList<>();
    try {
      EntityManager entityManager = getEntityManager();
      statement = (PreparedStatement) entityManager
        .createQuery("SELECT p FROM Produto p ORDER BY p.id ASC");
      
      resultSet = statement.executeQuery();
      
      while (resultSet.next()) {
        Produto produto = new Produto();
        produto.setId(resultSet.getLong("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setCategoria(resultSet.getString("categoria"));
        produto.setValor(resultSet.getString("valor"));
        produto.setEstoque(resultSet.getString("estoque"));
        listarProduto.add(produto);
      }
    } catch (SQLException e) {
      System.out.println("Erro ao listar produtos: " + e.getMessage());
    } finally {
      if (statement != null) {
        statement.close();
      }
      if (resultSet != null) {
        resultSet.close();
      }
    }
    return listarProduto;
  }
}
