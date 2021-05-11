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
@Table(name="tab_colaborador")
public class UserCollaborator extends UserPerson {

  @Column(name="cnpjColaborador", nullable=false, unique=true)
  private String cnpj;
  
  @Column(name="razaosocialColaborador", nullable=false, unique=true)
  private String razaosocial;

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
  
}
