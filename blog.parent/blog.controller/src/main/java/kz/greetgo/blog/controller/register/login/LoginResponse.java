package kz.greetgo.blog.controller.register.login;

import kz.greetgo.blog.controller.register.BaseResponse;

public class LoginResponse extends BaseResponse {
    public static String RESPONSE_MESSAGE_ALREADY_REGISTERED="ALREADY REGISTERED";
    public static String RESPONSE_MESSAGE_NOT_REGISTERED="NOT REGISTERED";
    public static String RESPONSE_MESSAGE_INCORRECT_PASSWORD="INCORRECT PASSWORD";
    public String token;


}
