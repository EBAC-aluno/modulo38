package dev.pedrohflobo.telephone;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dev.pedrohflobo.telephone.domain.Item;

@Named
@ViewScoped
public class RegisterBean implements Serializable {
  private static final long serialVersionUID = 1L;

  private Item item = new Item();

  public void setItem(Item item){
    this.item = item;
  }

  public Item getItem(){
    return item;
  }

  public void submit(){
    System.out.println(item.getName() + " " + item.getTelephoneNumber() + " " + item.getTelephoneType());
  }

  public TelephoneType[] getTelephoneType(){
    return TelephoneType.values();
  }

}
