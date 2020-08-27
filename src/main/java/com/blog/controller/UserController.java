package com.blog.controller;

import com.blog.dao.UserDao;
import com.blog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/select")
    public String select(User user) {
        List<User> userDaoAll = userDao.findAll();
        return "userList";
    }
}
