package com.yc.biz;

import org.springframework.stereotype.Component;

@Component //只要加了这个注解，这个类就可以被spring容器托管
public class HelloWorld {//创建个类的对象
    public  HelloWorld(){
        System.out.println("无参构造方法");
    }
    public void hello(){
        System.out.println("hello world");
    }
}
