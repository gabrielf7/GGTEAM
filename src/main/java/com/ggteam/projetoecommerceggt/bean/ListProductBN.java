package com.ggteam.projetoecommerceggt.bean;

import com.ggteam.projetoecommerceggt.dao.ProductDAO;
import com.ggteam.projetoecommerceggt.models.Produto;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
public class ListProductBN {

  private List<Produto> produtos;

  public ListProductBN() {
  }

  public List<Produto> getProdutos() {
    try {
      ProductDAO pd = new ProductDAO();
      produtos = pd.listAll();
    } catch (SQLException e) {
      System.out.println("Erro na lista de produtos: " + e.getMessage());
    }
    return produtos;

  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

}
