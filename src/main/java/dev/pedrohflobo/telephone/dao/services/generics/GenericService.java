package dev.pedrohflobo.telephone.dao.services.generics;

import java.util.List;

import dev.pedrohflobo.telephone.dao.generics.GenericDao;
import dev.pedrohflobo.telephone.exception.CommitException;
import dev.pedrohflobo.telephone.exception.IdNotFoundException;
import dev.pedrohflobo.telephone.utils.JpaUtil;

public class GenericService<T, K, D extends GenericDao<T, K>> implements IGenericService<T, K, D> {

  private GenericDao<T, K> dao;

  public GenericService(D dao) {
    JpaUtil.createEntityManagerFactory("default");
    this.dao = dao;
  }

  @Override
  public void register(T entity) throws CommitException {
    dao.save(entity);
  }

  @Override
  public List<T> getAll() {
    return dao.findAll();
  }

  @Override
  public void update(T entity) throws CommitException {
    dao.update(entity);
  }

  @Override
  public void deleteById(K id) throws IdNotFoundException, CommitException {
    dao.deleteById(id);
  }

  @Override
  public T findById(K id) throws IdNotFoundException {
    return dao.findById(id);
  }

}
