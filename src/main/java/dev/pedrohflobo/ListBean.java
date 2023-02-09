package dev.pedrohflobo;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ListBean implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private DataTable d = new DataTable();
  private List<Item> list = d.getDataList();
  
  public List<Item> getList(){
    return list;
  }

}
