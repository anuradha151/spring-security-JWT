package com.security.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicatioUser {
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;

    public ApplicatioUser() {
    }

    public ApplicatioUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ApplicatioUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
