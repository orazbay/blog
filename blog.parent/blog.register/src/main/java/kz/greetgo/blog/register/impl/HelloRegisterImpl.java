package kz.greetgo.blog.register.impl;

import kz.greetgo.blog.controller.register.HelloRegister;
import kz.greetgo.blog.controller.register.TestRegister;
import kz.greetgo.blog.register.dao.HelloDao;
import kz.greetgo.blog.register.dao.TestDao;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;

@Bean
public class HelloRegisterImpl implements HelloRegister{

  public BeanGetter<HelloDao> helloDaoBeanGetter;


  @Override
  public String getHello() {
    return helloDaoBeanGetter.get().getHelloText();
  }
}
