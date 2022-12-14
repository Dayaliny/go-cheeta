package com.dto.response;

public class CommonResponse {
    private boolean res;
    private int statusCode;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean getRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public static CommonResponse generateResponse(boolean res,int statusCode,String message) {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setRes(res);
        commonResponse.setStatusCode(statusCode);
        commonResponse.setMessage(message);
        return commonResponse;

    }
}
