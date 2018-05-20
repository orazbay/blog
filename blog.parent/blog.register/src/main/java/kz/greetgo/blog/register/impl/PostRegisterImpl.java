package kz.greetgo.blog.stand.register_impl;


import kz.greetgo.blog.controller.register.posts.Post;
import kz.greetgo.blog.controller.register.posts.PostsRegister;
import kz.greetgo.depinject.core.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@Bean
public class PostRegisterImpl implements PostsRegister{


  @Override
  public Post getSinglePost() {
    return new Post(
            "Messi is the best",
            "https://s-cdn.sportbox.ru/images/styles/upload/fp_fotos/52/63/d3da980337fa5ed3617500b3d9e1dd365ac0a87cbd33f279342212.jpg",
            "Lionel Messi’s Net Worth\n" +
                    "\n" +
                    "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                    "\n" +
                    "How Tall Is Lionel Messi?\n" +
                    "\n" +
                    "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                    "\n" +
                    "Birthday\n" +
                    "\n" +
                    "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
    );
  }

  @Override
  public ArrayList<Post> getPosts() {
    return new ArrayList<>(Arrays.asList(
            new Post(
                    "Messi is the best",
                    "https://s-cdn.sportbox.ru/images/styles/upload/fp_fotos/52/63/d3da980337fa5ed3617500b3d9e1dd365ac0a87cbd33f279342212.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            ),
            new Post(
                    "Messi is the best",
                    "https://www.biography.com/.image/t_share/MTQ4MDU5NDU0MzgwNzEzNDk0/lionel_messi_photo_josep_lago_afp_getty_images_664928892_resizedjpg.jpg",
                    "Lionel Messi’s Net Worth\n" +
                            "\n" +
                            "As of 2017 Lionel Messi is worth an estimated $80 million, taking into account his salary plus bonuses and endorsements, according to Forbes.com. That makes Messi the second highest-paid soccer player and the third highest-paid athlete in the world, after fellow soccer great Cristiano Ronaldo and basketball star LeBron James. Almost universally regarded as the best soccer player in the game, Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies.\n" +
                            "\n" +
                            "How Tall Is Lionel Messi?\n" +
                            "\n" +
                            "Lionel Messi is 5 feet, 7 inches tall and weighs 72 kilograms (159 pounds). With his short stature, speed and relentless attacking style, Messi has drawn comparisons to another famous Argentinian footballer: Diego Maradona.\n" +
                            "\n" +
                            "Birthday\n" +
                            "\n" +
                            "Lionel Messi was born on June 24, 1987, in Rosario, Argentina."
            )
    ));
  }
}
