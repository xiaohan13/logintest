package com.frist.maven.DAO;


import com.frist.maven.bean.UserBean;

public interface UserMapper {
    UserBean getInfo(String email, String password);
}
