package com.blog.service;

import com.blog.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public int saveUser(User user);
}
