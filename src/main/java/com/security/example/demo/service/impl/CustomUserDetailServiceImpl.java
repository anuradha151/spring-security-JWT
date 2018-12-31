package com.security.example.demo.service.impl;

import com.security.example.demo.model.ApplicatioUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ApplicatioUser applicatioUser = loadApplicationUserByUserName("batman");
        return new User(applicatioUser.getUserName(), applicatioUser.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
    }

    public ApplicatioUser loadApplicationUserByUserName(String username) {
        return new ApplicatioUser("batman", "pass");
    }
}
