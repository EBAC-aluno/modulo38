package com.mastertheboss;

import java.util.List;

import java.util.ArrayList;  

public class DataTable {    

  public DataTable(){

  }

  private List<Item> list;  

  public List<Item> getDataList() {    
    list = new ArrayList<>();    
    list.add(new Item("Carlos", "41988776655", TelephoneType.PUBLIC));    
    list.add(new Item("Renata", "11911111111", TelephoneType.LANDLINE));    
    list.add(new Item("Patric", "31922222222", TelephoneType.CELLPHONE));    
    return list;  
  }    

}  
