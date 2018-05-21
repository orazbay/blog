package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.models.Post;
import kz.greetgo.blog.controller.register.BaseResponse;
import kz.greetgo.blog.controller.register.posts.GetNotActivePostsResponse;
import kz.greetgo.blog.controller.register.posts.PostCreateResponse;
import kz.greetgo.blog.controller.register.posts.PostsRegister;
import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.AsIs;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
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
  @Mapping("/getAllActivePosts")
  public ArrayList<Post> getAllActivePosts(){
    return postRegisterBean.get().getAllActivePosts();
  }

  @ToJson
  @AsIs
  @Mapping("/getNotActivePosts")
  public GetNotActivePostsResponse getNotActivePosts(@Par("token")String token){
    return postRegisterBean.get().getNotActivePosts(token);
  }

  @ToJson
  @AsIs
  @Mapping("/acceptPost")
  public BaseResponse acceptPost(@Par("postId") int postId,@Par("token")String token){
    return postRegisterBean.get().acceptPost(postId,token);
  }




  @ToJson
  @AsIs
  @Mapping("/createPost")
  public PostCreateResponse createPost(@Par("token") String token,@Par("title") String title ,@Par("image_title_url") String image_title_url,@Par("content") String content){
    return postRegisterBean.get().createPost(token,title,image_title_url,content);
  }
}
