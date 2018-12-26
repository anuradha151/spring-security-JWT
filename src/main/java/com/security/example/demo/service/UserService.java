package com.security.example.demo.service;

import com.security.example.demo.model.ApplicatioUser;

public interface UserService {
    ApplicatioUser loadUserByUserName(String userName);
}
