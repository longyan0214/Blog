package com.blog.test;

import com.blog.domain.User;
import com.blog.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainDemo1 {
    @Test
    public void testFindAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = ac.getBean("userServiceImpl", UserService.class);
        List<User> userList = us.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
