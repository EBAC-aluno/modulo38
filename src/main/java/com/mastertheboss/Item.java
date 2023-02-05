package com.mastertheboss;

public class Item {

  private String name;
  private String telephone;
  private TelephoneType telephoneType;

  public Item() {
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTelephone() {
    return telephone;
  }
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  public TelephoneType getTelephoneType() {
    return telephoneType;
  }
  public void setTelephoneType(TelephoneType telephoneType) {
    this.telephoneType = telephoneType;
  }

}
