package com.ggteam.projetoecommerceggt.models;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author on github * -> @gabrielf7 (JoaoGabriel) -> @jvpererinha
 * (JoaoVictorD.) -> @gustavo3g (GustavoBarros) -> @ (TallysSilva)
 */
@Entity
@Table(name = "tab_produto")
public class Produto implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, unique = true)
  private Long id;

  @Column(name = "nome", nullable = false, unique = false)
  private String nome;

  @Column(name = "descricao", nullable = false, unique = false)
  private String descricao;

  @Column(name = "categoria", nullable = false, unique = false)
  private String categoria;

  @Column(name = "valor", nullable = false, unique = false)
  private String valor;

  @Column(name = "estoque", nullable = false, unique = false)
  private String estoque;

  public Produto() {
  }

  public Produto(Long id, String nome, String descricao, String categoria,
    String valor, String estoque) {

    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.categoria = categoria;
    this.valor = valor;
    this.estoque = estoque;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getEstoque() {
    return estoque;
  }

  public void setEstoque(String estoque) {
    this.estoque = estoque;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Produto)) {
      return false;
    }
    Produto other = (Produto) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.model.Produto[ id=" + id + " ]";
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
