package dev.pedrohflobo.telephone.dao;

import dev.pedrohflobo.telephone.dao.generics.GenericDao;
import dev.pedrohflobo.telephone.domain.Item;
import jakarta.persistence.EntityManager;

public class ItemDao extends GenericDao<Item, Long> implements IItemDao {

  public ItemDao(EntityManager entityManager) {
    super(entityManager);
  }

}
