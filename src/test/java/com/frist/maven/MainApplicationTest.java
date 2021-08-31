package com.frist.maven;

import com.frist.maven.bean.UserBean;
import com.frist.maven.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTest {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("123@example.com", "password");
        System.out.println("user id is : ");
        System.out.println(userBean.getId());
    }
}