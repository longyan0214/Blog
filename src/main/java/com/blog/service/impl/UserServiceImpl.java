package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.domain.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }
}
