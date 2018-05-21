package kz.greetgo.blog.register.impl;

import kz.greetgo.blog.controller.models.User;
import kz.greetgo.blog.controller.register.BaseResponse;
import kz.greetgo.blog.controller.register.login.LoginRegister;
import kz.greetgo.blog.controller.register.login.LoginResponse;
import kz.greetgo.blog.register.dao.UsersDao;
import kz.greetgo.blog.register.util.TokenGenerator;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;


@Bean
public class LoginRegisterImpl implements LoginRegister{
  public BeanGetter<UsersDao> usersDaoBeanGetter;
  @Override
  public LoginResponse signUp(String name, String surname, String email, String password) {


    LoginResponse loginResponse=new LoginResponse();

    if (usersDaoBeanGetter.get().checkEmail(email)==null){
      usersDaoBeanGetter.get().insertUser(name,surname,email,password);
      loginResponse.setResponseCode(BaseResponse.RESPONSE_CODE_SUCCESS);
      loginResponse.token= TokenGenerator.generate(email);
      usersDaoBeanGetter.get().updateToken(email,loginResponse.token);
    }else {
      loginResponse.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
      loginResponse.setResponseMessage(LoginResponse.RESPONSE_MESSAGE_ALREADY_REGISTERED);
    }
    return loginResponse;
  }

  @Override
  public LoginResponse signIn(String email, String password) {
    LoginResponse loginResponse=new LoginResponse();

    User user =usersDaoBeanGetter.get().getUser(email);
    if (user==null){
      loginResponse.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
      loginResponse.setResponseMessage(LoginResponse.RESPONSE_MESSAGE_NOT_REGISTERED);
    }
    else {
      if (user.password.equals(password)){

        loginResponse.setResponseCode(BaseResponse.RESPONSE_CODE_SUCCESS);
        loginResponse.token= TokenGenerator.generate(email);
        usersDaoBeanGetter.get().updateToken(email,loginResponse.token);

      }else {
        loginResponse.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
        loginResponse.setResponseMessage(LoginResponse.RESPONSE_MESSAGE_INCORRECT_PASSWORD);
      }
    }

    return loginResponse;
  }
}
