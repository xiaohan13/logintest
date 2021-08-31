package com.frist.maven.servicempl;

import com.frist.maven.DAO.UserMapper;
import com.frist.maven.bean.UserBean;
import com.frist.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServicempl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public com.frist.maven.bean.UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
