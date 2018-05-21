package kz.greetgo.blog.controller.register.posts;

import kz.greetgo.blog.controller.models.Post;
import kz.greetgo.blog.controller.register.BaseResponse;

import java.util.ArrayList;

public class GetNotActivePostsResponse extends BaseResponse {
    public ArrayList<Post> posts;

}
