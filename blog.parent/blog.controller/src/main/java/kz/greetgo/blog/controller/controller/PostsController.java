package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.register.posts.Post;
import kz.greetgo.blog.controller.register.posts.PostsRegister;
import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.AsIs;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;

import java.util.ArrayList;

@Bean
public class PostsController implements Controller{

  public BeanGetter<PostsRegister> postRegisterBean;

  @ToJson
  @AsIs
  @Mapping("/getSinglePost")
  public Post getSinglePost(){
    return postRegisterBean.get().getSinglePost();
  }
  @ToJson
  @AsIs
  @Mapping("/getPosts")
  public ArrayList<Post> getPosts(){
    return postRegisterBean.get().getPosts();
  }
}
