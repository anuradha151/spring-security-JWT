package com.security.example.demo.service.impl;

import com.security.example.demo.model.ApplicatioUser;
import com.security.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ApplicatioUser loadUserByUserName(String userName) {
        return new ApplicatioUser("batman", "pass");
    }
}
