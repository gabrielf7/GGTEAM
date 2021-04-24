package com.ggteam.projetoecommerceggt.bean;

import com.ggteam.projetoecommerceggt.models.Produto;
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
public class ListProdutoBN {

  private List<Produto> produtos;

  public ListProdutoBN() {
    // TODO Auto-generated constructor stub
  }

  public List<Produto> getProdutos() {
    try {
      Produto pd = new Produto();
      produtos = pd.listAll();
    } catch (SQLException e) {
    }
    return produtos;

  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

}
