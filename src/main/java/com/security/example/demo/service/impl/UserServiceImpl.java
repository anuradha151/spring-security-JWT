package com.security.example.demo.service.impl;

import com.security.example.demo.model.User;
import com.security.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User loadUserByUserName(String userName) {
        return new User("batman", "pass");
    }
}
