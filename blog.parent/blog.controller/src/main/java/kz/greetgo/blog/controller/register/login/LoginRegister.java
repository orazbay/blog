package kz.greetgo.blog.controller.register.login;

public interface LoginRegister {
    public LoginResponse signUp(String name,String surname,String email,String password);
}
