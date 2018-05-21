package kz.greetgo.blog.controller.models;

import javax.annotation.Nullable;

public class User {
    public int id;

    public String name,surname,email,password;
    public boolean is_admin;

    public String token;

    public User(Integer id,String name, String surname, String email, Boolean is_admin, String password,@Nullable String token) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.is_admin = is_admin;
        this.password = password;
        this.token=token;
    }
}
