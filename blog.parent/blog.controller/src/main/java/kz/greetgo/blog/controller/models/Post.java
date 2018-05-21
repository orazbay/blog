package kz.greetgo.blog.controller.models;

public class Post {
    public int id;
    public String title, image_title_url,content;
    public int author_id;
    public boolean is_active;

    public Post(Integer id,String title, String image_title_url, String content,Integer author_id,Boolean is_active){
        this.id=id;
        this.title=title;
        this.image_title_url =image_title_url;
        this.content=content;
        this.author_id=author_id;
        this.is_active=is_active;
    }
}
