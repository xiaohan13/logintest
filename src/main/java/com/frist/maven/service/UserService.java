package com.frist.maven.service;


import com.frist.maven.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}

