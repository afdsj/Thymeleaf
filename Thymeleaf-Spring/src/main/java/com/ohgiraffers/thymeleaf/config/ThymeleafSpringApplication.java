package com.ohgiraffers.thymeleaf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 스프링부트가 알아서 관리할게
@ComponentScan(basePackages = "com.ohgiraffers.thymeleaf") //
public class ThymeleafSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSpringApplication.class, args);
    }

}
