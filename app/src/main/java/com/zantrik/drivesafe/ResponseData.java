package com.zantrik.drivesafe;

public class ResponseData {
    private String Success;
    private String AuthToken;

    public String getSuccess() {
        return Success;
    }

    public String getAuthToken() {
        return AuthToken;
    }

    public void setSuccess(String success) {
        Success = success;
    }

    public void setAuthToken(String authToken) {
        AuthToken = authToken;
    }
}