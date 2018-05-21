package kz.greetgo.blog.controller.register.posts;

import kz.greetgo.blog.controller.models.Post;
import kz.greetgo.blog.controller.register.BaseResponse;

import java.util.ArrayList;

public interface PostsRegister {
    Post getSinglePost();

    ArrayList<Post> getAllActivePosts();
    GetNotActivePostsResponse getNotActivePosts(String token);

    public BaseResponse acceptPost(int postId,String token);

    PostCreateResponse createPost(String token,String title,String image_title_url,String content);

}
