package com.yc.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {
    @PostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }
    @PreDestroy
    public void destory(){
        System.out.println("MyPreDestory");
    }

    public HelloWorld(){
        System.out.println("hello world构造");
    }

    public void show(){
        System.out.println("show");
    }
}
