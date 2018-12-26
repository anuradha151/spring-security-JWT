package com.security.example.demo.model;

public class ApplicatioUser {
    private String userName;
    private String password;

    public ApplicatioUser() {
    }

    public ApplicatioUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
