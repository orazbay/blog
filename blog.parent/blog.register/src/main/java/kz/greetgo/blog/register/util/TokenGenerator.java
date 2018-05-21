package kz.greetgo.blog.register.util;

public class TokenGenerator {
    public static String generate(String email){
        return email.hashCode()+"|"+System.currentTimeMillis();
    }
}
