package kz.greetgo.blog.controller.register;

public class BaseResponse {
    public static final int RESPONSE_CODE_SUCCESS=0;
    public static final int RESPONSE_CODE_FAIL=1;


    private int responseCode;
    private String responseMessage;

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}