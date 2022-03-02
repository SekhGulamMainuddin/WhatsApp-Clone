package com.sekhgmainuddin.calculator.whatsappclone.models;

public class CallList {
    private String userId;
    private String userName;
    private String urlProfile;
    private String callType;
    private String date;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CallList(String userId, String userName, String urlProfile, String callType, String date) {
        this.userId = userId;
        this.userName = userName;
        this.urlProfile = urlProfile;
        this.callType = callType;
        this.date = date;
    }
}
