package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.register.login.LoginRegister;
import kz.greetgo.blog.controller.register.login.LoginResponse;
import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.AsIs;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class LoginController implements Controller{

  public BeanGetter<LoginRegister> loginRegisterBeanGetter;

  @ToJson
  @AsIs
  @Mapping("/signUp")
  public LoginResponse getText(@Par("name") String name, @Par("surname") String surname, @Par("email") String email, @Par("password") String password){
    return loginRegisterBeanGetter.get().signUp(name,surname,email,password);
  }
}
