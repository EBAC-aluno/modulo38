package dev.pedrohflobo.telephone.services;

import dev.pedrohflobo.telephone.dao.ItemDao;
import dev.pedrohflobo.telephone.domain.Item;
import dev.pedrohflobo.telephone.services.generics.GenericService;

public class ItemService extends GenericService<Item, Long, ItemDao> implements IItemService {

  ItemDao itemDao;
  public ItemService(ItemDao dao) {
    super(dao);
    itemDao = dao;
  }
 
}
