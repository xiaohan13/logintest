package com.frist.maven.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//@ResponseBody show the response on the page
//@Controller
@Controller
public class HelloController {

//    Request mapping: path of the url
    @RequestMapping("/hello")
    public String handle01(){
        return "hello, Spring boot!!";
    }

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

//    @RequestMapping("/hello")
//    public ModelAndView hello(HttpServletResponse response) throws IOException{
//    ModelAndView modelAndView = new ModelAndView();
//    modelAndView.setViewName("hello");
//    modelAndView.addObject("username", "xiaohan");
//    return modelAndView;
//    }
//
//    @RequestMapping("/profile")
//    public String profile(String email, String password){
//        String sql = "select email, password from user";
//        Map<String, Object> param = new HashMap<>();
//        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, param);
//        while (result.next()){
//            System.out.println(result.getString("email"));
//        }
//        return "index";
//    }
}