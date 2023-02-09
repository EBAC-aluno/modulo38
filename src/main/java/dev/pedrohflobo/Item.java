package dev.pedrohflobo;

public class Item {

  private String name;
  private String telephoneNumber;
  private TelephoneType telephoneType;

  public Item() {
  }

  public Item(String name, String telephoneNumber, TelephoneType telephoneType){
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
