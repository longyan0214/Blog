package com.blog.dao;

import com.blog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface UserDao {

    List<User> findAll();

    int saveUser(User user);
}
