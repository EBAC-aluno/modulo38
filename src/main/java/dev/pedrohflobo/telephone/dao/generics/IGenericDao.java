package dev.pedrohflobo.telephone.dao.generics;

import java.util.List;

import dev.pedrohflobo.telephone.exception.CommitException;
import dev.pedrohflobo.telephone.exception.IdNotFoundException;

public interface IGenericDao<T, K> {
  void save(T entity) throws CommitException;

  void update(T entity) throws CommitException;

  T findById(K id) throws IdNotFoundException;

  List<T> findAll();

  void deleteById(K id) throws IdNotFoundException, CommitException;

}
