package kz.greetgo.blog.register.dao;


import kz.greetgo.blog.controller.models.User;
import org.apache.ibatis.annotations.*;

public interface UsersDao {


  @Insert("insert into users(name, surname, email, password) values (#{name},#{surname},#{email},#{password})")
  void insertUser(
                    @Param("name") String name,
                    @Param("surname") String surname,
                    @Param("email") String email,
                    @Param("password") String password);
  @Update("update users set token = #{token} where email = #{email}")
  void updateToken(@Param("email") String email,
                   @Param("token") String token);

  @Select("select email from users where email = #{email}")
  String checkEmail(@Param("email") String email);

  @Select("select * from users where email = #{email}")
  User getUser(@Param("email") String email);

}
