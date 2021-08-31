package com.frist.maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
main application class
this is a spring boot app
the format is same for every project, just copy&paste
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.frist.maven.DAO")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

    }
}
