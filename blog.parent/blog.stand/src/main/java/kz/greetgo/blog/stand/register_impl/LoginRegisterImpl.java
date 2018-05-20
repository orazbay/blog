package kz.greetgo.blog.stand.register_impl;

import kz.greetgo.blog.controller.register.login.LoginRegister;
import kz.greetgo.blog.controller.register.login.LoginResponse;
import kz.greetgo.depinject.core.Bean;

@Bean
public class LoginRegisterImpl implements LoginRegister{
  @Override
  public LoginResponse signUp(String name, String surname, String email, String password) {
    LoginResponse loginResponse=new LoginResponse();
    loginResponse.setResponseCode(0);
    loginResponse.token="some token";
    return loginResponse;
  }
}
