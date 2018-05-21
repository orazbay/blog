package kz.greetgo.blog.register.dao;


import kz.greetgo.blog.controller.models.Post;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

public interface PostsDao {


  @Insert("insert into posts(title, image_title_url, content, author_id)" +
          " values (#{title},#{image_title_url},#{content},#{author_id})")
  void insertPost(
          @Param("title") String title,
          @Param("image_title_url") String image_title_url,
          @Param("content") String content,
          @Param("author_id") int author_id);

  @Select("select * from posts where is_active = TRUE")
  ArrayList<Post> getActivePosts();

  @Select("select * from posts where is_active = FALSE")
  ArrayList<Post> getNotActivePosts();

  @Update("update posts set is_active = TRUE where id = #{postId}")
  void updateIsActive(@Param("postId") int postId);
}
