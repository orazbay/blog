package kz.greetgo.blog.stand.register_impl;


import kz.greetgo.blog.controller.models.Post;
import kz.greetgo.blog.controller.register.BaseResponse;
import kz.greetgo.blog.controller.register.posts.GetNotActivePostsResponse;
import kz.greetgo.blog.controller.register.posts.PostCreateResponse;
import kz.greetgo.blog.controller.register.posts.PostsRegister;
import kz.greetgo.depinject.core.Bean;

import java.util.ArrayList;
import java.util.Arrays;


@Bean
public class PostRegisterImpl implements PostsRegister{


    @Override
    public Post getSinglePost() {
        return null;
    }

    @Override
    public ArrayList<Post> getAllActivePosts() {

        return new ArrayList<>(Arrays.asList(
                new Post(1,"some title","https://images.cdn.fourfourtwo.com/sites/fourfourtwo.com/files/styles/image_landscape/public/lionelmessi-cropped_1hygeoo0ycfw61mgm8rnjkg3p5.jpg?itok=W-QBHf_4&c=87b6d99828d88c1b8ffe17a08d24fc7d","Lionel Messi is the \"best player there is and there ever will be\" as head coach Ernesto Valverde heaped praise on the Barcelona star.\n" +
                        "Five-time Ballon d'Or winner Messi scored a brace in Barcelona's 5-0 rout of Real Betis in LaLiga action on Sunday.\n" +
                        "Messi took his tally to 19 league goals for the season, while Luis Suarez also netted twice after Ivan Rakitic's opener.\n" +
                        "\"You have to enjoy him,\" Valverde said of Messi. \"We have been able to live his era.\n" +
                        "\"I have suffered because of him and I know what that is like. Now I can enjoy it.\n" +
                        "\"It is an event to watch him every day. He is the best player there is and there ever will be.\"",10,true),
                new Post(1,"some title","https://images.cdn.fourfourtwo.com/sites/fourfourtwo.com/files/styles/image_landscape/public/lionelmessi-cropped_1hygeoo0ycfw61mgm8rnjkg3p5.jpg?itok=W-QBHf_4&c=87b6d99828d88c1b8ffe17a08d24fc7d","Lionel Messi is the \"best player there is and there ever will be\" as head coach Ernesto Valverde heaped praise on the Barcelona star.\n" +
                        "Five-time Ballon d'Or winner Messi scored a brace in Barcelona's 5-0 rout of Real Betis in LaLiga action on Sunday.\n" +
                        "Messi took his tally to 19 league goals for the season, while Luis Suarez also netted twice after Ivan Rakitic's opener.\n" +
                        "\"You have to enjoy him,\" Valverde said of Messi. \"We have been able to live his era.\n" +
                        "\"I have suffered because of him and I know what that is like. Now I can enjoy it.\n" +
                        "\"It is an event to watch him every day. He is the best player there is and there ever will be.\"",10,true),
                new Post(1,"some title","https://images.cdn.fourfourtwo.com/sites/fourfourtwo.com/files/styles/image_landscape/public/lionelmessi-cropped_1hygeoo0ycfw61mgm8rnjkg3p5.jpg?itok=W-QBHf_4&c=87b6d99828d88c1b8ffe17a08d24fc7d","Lionel Messi is the \"best player there is and there ever will be\" as head coach Ernesto Valverde heaped praise on the Barcelona star.\n" +
                        "Five-time Ballon d'Or winner Messi scored a brace in Barcelona's 5-0 rout of Real Betis in LaLiga action on Sunday.\n" +
                        "Messi took his tally to 19 league goals for the season, while Luis Suarez also netted twice after Ivan Rakitic's opener.\n" +
                        "\"You have to enjoy him,\" Valverde said of Messi. \"We have been able to live his era.\n" +
                        "\"I have suffered because of him and I know what that is like. Now I can enjoy it.\n" +
                        "\"It is an event to watch him every day. He is the best player there is and there ever will be.\"",10,true),
                new Post(1,"some title","https://images.cdn.fourfourtwo.com/sites/fourfourtwo.com/files/styles/image_landscape/public/lionelmessi-cropped_1hygeoo0ycfw61mgm8rnjkg3p5.jpg?itok=W-QBHf_4&c=87b6d99828d88c1b8ffe17a08d24fc7d","Lionel Messi is the \"best player there is and there ever will be\" as head coach Ernesto Valverde heaped praise on the Barcelona star.\n" +
                        "Five-time Ballon d'Or winner Messi scored a brace in Barcelona's 5-0 rout of Real Betis in LaLiga action on Sunday.\n" +
                        "Messi took his tally to 19 league goals for the season, while Luis Suarez also netted twice after Ivan Rakitic's opener.\n" +
                        "\"You have to enjoy him,\" Valverde said of Messi. \"We have been able to live his era.\n" +
                        "\"I have suffered because of him and I know what that is like. Now I can enjoy it.\n" +
                        "\"It is an event to watch him every day. He is the best player there is and there ever will be.\"",10,true)
        ));
    }

    @Override
    public GetNotActivePostsResponse getNotActivePosts(String token) {
        return null;
    }

    @Override
    public BaseResponse acceptPost(int postId, String token) {
        return null;
    }

    @Override
    public PostCreateResponse createPost(String token, String title, String image_title_url, String content) {
        return null;
    }
}
