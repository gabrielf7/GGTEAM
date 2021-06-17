package com.ggteam.projetoecommerceggt.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@Entity
@Table(name="tab_adm")
public class Administrator implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="idADM", nullable=false, unique=true)
  private Long id;
  
  @Column(name="emailADM", nullable=false, unique=true)
  private String email;
  
  @Column(name="senhaADM", nullable=false, unique=false)
  private String senha;
  
  @Column(name="ultimoAcesso", unique=true)
  private String ultimoAcesso;

  public Administrator() {
  }

  public Administrator(Long id, String email, String senha, String ultimoAcesso) {
    this.id = id;
    this.email = email;
    this.senha = senha;
    this.ultimoAcesso = ultimoAcesso;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  public String getUltimoAcesso() {
    return ultimoAcesso;
  }

  public void setUltimoAcesso(String ultimoAcesso) {
    this.ultimoAcesso = ultimoAcesso;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
    if (!(object instanceof Administrator)) {
      return false;
    }
    Administrator other = (Administrator) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.models.Administrator[ id=" + id + " ]";
  }
  
}
