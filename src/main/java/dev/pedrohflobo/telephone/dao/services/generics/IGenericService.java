package dev.pedrohflobo.telephone.dao.services.generics;

import java.util.List;

import dev.pedrohflobo.telephone.dao.generics.GenericDao;
import dev.pedrohflobo.telephone.exception.CommitException;
import dev.pedrohflobo.telephone.exception.IdNotFoundException;

public interface IGenericService<T, K, D extends GenericDao<T, K>> {

  void register(T entity) throws CommitException;

  List<T> getAll();

  void update(T entity) throws CommitException;

  void deleteById(K id) throws IdNotFoundException, CommitException;

  T findById(K id) throws IdNotFoundException;

}
