package kz.greetgo.blog.register.impl;


import kz.greetgo.blog.controller.models.Post;
import kz.greetgo.blog.controller.models.User;
import kz.greetgo.blog.controller.register.BaseResponse;
import kz.greetgo.blog.controller.register.posts.GetNotActivePostsResponse;
import kz.greetgo.blog.controller.register.posts.PostCreateResponse;
import kz.greetgo.blog.controller.register.posts.PostsRegister;
import kz.greetgo.blog.register.dao.PostsDao;
import kz.greetgo.blog.register.dao.UsersDao;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;

import java.util.ArrayList;

@Bean
public class PostRegisterImpl implements PostsRegister{
    public BeanGetter<UsersDao> usersDaoBeanGetter;
    public BeanGetter<PostsDao> postsDaoBeanGetter;


    @Override
    public Post getSinglePost() {
        return null;
    }

    @Override
    public ArrayList<Post> getAllActivePosts() {
        return postsDaoBeanGetter.get().getActivePosts();
    }

    @Override
    public GetNotActivePostsResponse getNotActivePosts(String token) {
        GetNotActivePostsResponse response=new GetNotActivePostsResponse();

        User admin=usersDaoBeanGetter.get().getUserByToken(token);

        if (admin==null){
            setUnauthResponse(response);
        }else {
            if (admin.is_admin){
                response.posts=postsDaoBeanGetter.get().getNotActivePosts();
                response.setResponseCode(BaseResponse.RESPONSE_CODE_SUCCESS);
            }else {
                response.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
                response.setResponseMessage(BaseResponse.RESPONSE_NOT_ADMIN);
            }
        }

        return response;
    }

    @Override
    public BaseResponse acceptPost(int postId,String token) {
        BaseResponse response=new BaseResponse();

        User admin=usersDaoBeanGetter.get().getUserByToken(token);

        if (admin==null){
            setUnauthResponse(response);
        }else {
            if (admin.is_admin){
                postsDaoBeanGetter.get().updateIsActive(postId);
                response.setResponseCode(BaseResponse.RESPONSE_CODE_SUCCESS);
            }else {
                response.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
                response.setResponseMessage(BaseResponse.RESPONSE_NOT_ADMIN);
            }
        }

        return response;
    }


    @Override
    public PostCreateResponse createPost(String token, String title, String image_title_url, String content) {
      PostCreateResponse response=new PostCreateResponse();
        User author=usersDaoBeanGetter.get().getUserByToken(token);
        if (author==null){
            setUnauthResponse(response);
        }else {
            postsDaoBeanGetter.get().insertPost(title,image_title_url,content,author.id);

            response.setResponseCode(BaseResponse.RESPONSE_CODE_SUCCESS);
        }
        return response;
    }

    private void setUnauthResponse(BaseResponse response){
        response.setResponseCode(BaseResponse.RESPONSE_CODE_FAIL);
        response.setResponseMessage(PostCreateResponse.RESPONSE_UNAUTHORIZED_USER);
    }
}

