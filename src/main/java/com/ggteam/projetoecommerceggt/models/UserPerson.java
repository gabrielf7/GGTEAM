package com.ggteam.projetoecommerceggt.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tab_usuario")
public class UserPerson implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="idUser", nullable=false, unique=true)
  private Long id;
  
  @Column(name="nomeUser", nullable=false, unique=false)
  private String nome;
  
  @Column(name="sobrenomeUser", nullable=false, unique=false)
  private String sobrenome;
  
  @Column(name="emailUser", nullable=false, unique=true)
  private String email;
  
  @Column(name="senhaUser", nullable=false, unique=false)
  private String senha;
  
  @Column(name="localidadeUser", nullable=false, unique=false)
  private String localidade;
  
  @Column(name="ultimoAcesso", unique=true)
  private String ultimoAcesso;

  public UserPerson() {
  }

  public UserPerson(Long id, String nome, String sobrenome, String email, String senha, String localidade, String ultimoAcesso) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.email = email;
    this.senha = senha;
    this.localidade = localidade;
    this.ultimoAcesso = ultimoAcesso;
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

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
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

  public String getLocalidade() {
    return localidade;
  }

  public void setLocalidade(String localidade) {
    this.localidade = localidade;
  }

  public String getUltimoAcesso() {
    return ultimoAcesso;
  }

  public void setUltimoAcesso(String ultimoAcesso) {
    this.ultimoAcesso = ultimoAcesso;
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
    if (!(object instanceof UserPerson)) {
      return false;
    }
    UserPerson other = (UserPerson) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.models.UserPerson[ id=" + id + " ]";
  }
  
}
