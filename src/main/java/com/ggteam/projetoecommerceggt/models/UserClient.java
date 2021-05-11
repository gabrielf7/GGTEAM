package com.ggteam.projetoecommerceggt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
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
@PrimaryKeyJoinColumn(name="idUser")
@Table(name="tab_cliente")
public class UserClient extends UserPerson {

  @Column(name="nicknameUser", nullable=false, unique=true)
  private String nickname;
  
  @Column(name="cpfUser", nullable=false, unique=true)
  private String cpf;
  
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
}
