/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ggteam.projetoecommerceggt.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author USER
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class FailUsuario implements Serializable {

  @Id
  private Long id;
  
  private  String nome;
  private  String sobrenome;
  private  String nickname;
  private  String email;
  private  String senha;
  private  Number cpf;

  public FailUsuario(Long id, String nome, String sobrenome, String nickname, 
    String email, String senha, Number cpf) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nickname = nickname;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
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

  public Number getCpf() {
    return cpf;
  }

  public void setCpf(Number cpf) {
    this.cpf = cpf;
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
    if (!(object instanceof FailUsuario)) {
      return false;
    }
    FailUsuario other = (FailUsuario) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.ggteam.projetoecommerceggt.model.Usuario[ id=" + id + " ]";
  }
  
}
