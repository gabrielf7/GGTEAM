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
@Table(name="tab_colaborador")
public class UserCollaborator implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="idColaborador", nullable=false, unique=true)
  private Long id;
  
  @Column(name="nomeColaborador", nullable=false, unique=false)
  private String nome;
  
  @Column(name="sobrenomeColaborador", nullable=false, unique=false)
  private String sobrenome;
  
  @Column(name="cnpjColaborador", nullable=false, unique=true)
  private String cnpj;
  
  @Column(name="razaosocialColaborador", nullable=false, unique=true)
  private String razaosocial;
  
  @Column(name="emailColaborador", nullable=false, unique=true)
  private String email;
  
  @Column(name="senhaColaborador", nullable=false, unique=false)
  private String senha;
  
  @Column(name="ultimoAcesso", unique=true)
  private String ultimoAcesso;
  
  public UserCollaborator() {
  }

  public UserCollaborator(Long id, String nome, String sobrenome, 
    String cnpj, String razaosocial, String email, String senha, 
    String ultimoAcesso) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cnpj = cnpj;
    this.razaosocial = razaosocial;
    this.email = email;
    this.senha = senha;
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

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazaosocial() {
    return razaosocial;
  }

  public void setRazaosocial(String razaosocial) {
    this.razaosocial = razaosocial;
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

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof UserCollaborator)) {
      return false;
    }
    UserCollaborator other = (UserCollaborator) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.models.UserCollaborator[ id=" + id + " ]";
  }
  
}
