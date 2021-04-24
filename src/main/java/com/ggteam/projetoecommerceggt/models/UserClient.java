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
@Table(name="tab_usuarioCLT")
public class UsuarioCliente implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="idCliente", nullable=false, unique=true)
  private Long id;
  
  @Column(name="nomeCliente", nullable=false, unique=false)
  private String nome;
  
  @Column(name="sobrenomeCliente", nullable=false, unique=false)
  private String sobrenome;
  
  @Column(name="nicknameCliente", nullable=false, unique=true)
  private String nickname;
  
  @Column(name="emailCliente", nullable=false, unique=true)
  private String email;
  
  @Column(name="senhaCliente", nullable=false, unique=false)
  private String senha;
  
  @Column(name="cpfCliente", nullable=false, unique=true)
  private String cpf;
  
  @Column(name="localidadeCliente", nullable=false, unique=false)
  private String localidade;
  
  @Column(name="ultimoAcesso", unique=true)
  private String ultimoAcesso;
  
  public UsuarioCliente() {
  }

  public UsuarioCliente(Long id, String nome, String sobrenome, 
    String nickname, String email, String senha, String cpf, 
    String localidade, String ultimoAcesso) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nickname = nickname;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
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

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
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
    if (!(object instanceof UsuarioCliente)) {
      return false;
    }
    UsuarioCliente other = (UsuarioCliente) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.model.UsuarioCliente[ id=" + id + " ]";
  }
  
}
