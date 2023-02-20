package dev.lobophf.controller;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import dev.lobophf.dao.UserDAO;
import dev.lobophf.domain.TelephoneType;
import dev.lobophf.domain.User;

@Named
@ViewScoped
public class RegisterBean implements Serializable {
  private static final long serialVersionUID = 1L;

  private User user;
  private UserDAO dao;
  FacesMessage message = null;

  @PostConstruct
  public void init() throws Exception {
    dao = new UserDAO();
    user = new User();
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public TelephoneType[] getTelephoneType() {
    return TelephoneType.values();
  }

  public void submit() throws Exception {
    user = new User(user.getName(), user.getTelephone(), user.getTelephoneType());

    Optional<User> optionalUser = dao.search(user.getTelephone());
    if (optionalUser.isEmpty()) {
      dao.register(user);
    } else {
      System.out.println("error!!!!!!!!!!!!!!!!!");

    }

  }

}
