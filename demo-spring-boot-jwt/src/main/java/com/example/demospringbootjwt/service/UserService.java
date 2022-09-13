package com.example.demospringbootjwt.service;

import com.example.demospringbootjwt.authen.UserPrincipal;
import com.example.demospringbootjwt.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
