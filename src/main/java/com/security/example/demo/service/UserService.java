package com.security.example.demo.service;

import com.security.example.demo.model.User;

public interface UserService {
    User loadUserByUserName(String userName);
}
