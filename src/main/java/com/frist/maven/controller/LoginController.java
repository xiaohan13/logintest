package com.frist.maven.controller;

import com.frist.maven.DAO.UserMapper;
import com.frist.maven.bean.UserBean;
import com.frist.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String email, String password){
        UserBean userBean = userService.loginIn(email, password);
        if(userBean != null){
            return "success";
        }else {
            return "error";
        }
    }
}
