package dev.pedrohflobo.telephone;

import dev.pedrohflobo.telephone.dao.ItemDao;
import dev.pedrohflobo.telephone.domain.Item;
import dev.pedrohflobo.telephone.exception.CommitException;
import dev.pedrohflobo.telephone.exception.IdNotFoundException;
import dev.pedrohflobo.telephone.services.ItemService;
import dev.pedrohflobo.telephone.utils.JpaUtil;
import jakarta.persistence.EntityManager;

public class Application {

  public static void main(String[] args) throws CommitException, IdNotFoundException {
    JpaUtil.createEntityManagerFactory("default");
    EntityManager entityManager = JpaUtil.getentityManager();

    Item item = new Item("Maria", "31998887766", TelephoneType.CELLPHONE);

    ItemService itemService = new ItemService(new ItemDao(entityManager));
    itemService.register(item);

    entityManager.close();

  }

}
