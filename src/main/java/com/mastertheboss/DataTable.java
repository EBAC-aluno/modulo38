package com.mastertheboss;

import java.util.List;

import java.util.ArrayList;  

public class DataTable {    

  public DataTable(){

  }

  private List<Product> productsList;  

  public List<Product> getDataList() {    
    productsList = new ArrayList<>();    
    productsList.add(new Product(1, "Car", 1299));    
    productsList.add(new Product(2, "Soap", 299));    
    productsList.add(new Product(3, "Mirror", 10));    
    return productsList;  
  }    

}  
