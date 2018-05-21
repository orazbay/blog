package kz.greetgo.blog.controller.register.login;

public interface LoginRegister {
    public LoginResponse signUp(String name,String surname,String email,String password);
    public LoginResponse signIn(String email,String password);
}
