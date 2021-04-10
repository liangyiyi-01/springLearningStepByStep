package com.yc.bean.sonBean;
import com.yc.springframework.stereotype.MyConfiguration;
import com.yc.springframework.stereotype.MyPostConstruct;
import com.yc.springframework.stereotype.MyPreDestroy;
@MyConfiguration
public class HelloWorld {
    @MyPostConstruct
    public void setup(){
        System.out.println("MyPostConstruct");
    }
    @MyPreDestroy
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
