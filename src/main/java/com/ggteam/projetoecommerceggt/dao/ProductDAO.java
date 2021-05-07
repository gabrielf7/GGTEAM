package com.ggteam.projetoecommerceggt.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

// Models 
import com.ggteam.projetoecommerceggt.models.Produto;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class ProductDAO {
  ResourcesDAO entityM = (ResourcesDAO) new ResourcesDAO();
  private final EntityManager entityManager = entityM.getEntityManager();

  public ProductDAO() {
  }
  
  public List<Produto> listAll() throws SQLException {
    Produto produto;
    List<Produto> listarProduto;
    List<Produto> listarStringProduto = new ArrayList<>();
    try {
      TypedQuery query = entityManager
        .createQuery("SELECT p FROM Produto p ORDER BY p.nome ASC", Produto.class);
      
      listarProduto = (List<Produto>) query.getResultList();
      
      for (Produto produtos: listarProduto) {
        produto = new Produto();
        produto.setNome(produtos.getNome());
        produto.setDescricao(produtos.getDescricao());
        produto.setCategoria(produtos.getCategoria());
        produto.setValor(produtos.getValor());
        produto.setEstoque(produtos.getEstoque());
        listarStringProduto.add(produto);
      }
    } catch (Exception e) {
      System.out.println("Erro ao listar produtos: " + e.getMessage());
    }
    return listarStringProduto;
  }
}
