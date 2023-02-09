package com.mastertheboss;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class NewBean implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private DataTable d = new DataTable();
  private List<Product> list = d.getDataList();
  
  public List<Product> getList(){
    return list;
  }

}
