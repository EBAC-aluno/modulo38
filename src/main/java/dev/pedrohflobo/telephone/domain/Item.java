package dev.pedrohflobo.telephone.domain;

import dev.pedrohflobo.telephone.TelephoneType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item")
@SequenceGenerator(name = "item", sequenceName = "sq_tb_item", allocationSize = 1)
public class Item {

  @Id
  @GeneratedValue(generator = "item", strategy = GenerationType.SEQUENCE)
  private Long id;

  @Column(length = 30, nullable = false)
  private String name;

  @Column(length = 11, nullable = false)
  private String telephoneNumber;

  @Enumerated(EnumType.STRING)
  private TelephoneType telephoneType;

  public Item() {
  }

  public Item(String name, String telephoneNumber, TelephoneType telephoneType) {
    this.name = name;
    this.telephoneNumber = telephoneNumber;
    this.telephoneType = telephoneType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public TelephoneType getTelephoneType() {
    return telephoneType;
  }

  public void setTelephoneType(TelephoneType telephoneType) {
    this.telephoneType = telephoneType;
  }

}
