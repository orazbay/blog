package kz.greetgo.blog.register.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HelloDao {

  @Select("select text from hellotable limit 1")
  String getHelloText();

}
