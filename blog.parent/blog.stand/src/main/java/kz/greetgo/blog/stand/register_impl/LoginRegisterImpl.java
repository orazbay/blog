package kz.greetgo.blog.stand.register_impl;

import kz.greetgo.blog.controller.register.login.LoginRegister;
import kz.greetgo.blog.controller.register.login.LoginResponse;
import kz.greetgo.depinject.core.Bean;

@Bean
public class LoginRegisterImpl implements LoginRegister{

  @Override
  public LoginResponse signUp(String name, String surname, String email, String password) {
    return null;
  }

  @Override
  public LoginResponse signIn(String email, String password) {
    return null;
  }
}
