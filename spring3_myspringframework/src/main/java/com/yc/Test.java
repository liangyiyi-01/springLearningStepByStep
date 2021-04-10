package com.yc;

import com.yc.bean.sonBean.HelloWorld;
import com.yc.biz.StudentBizImpl;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        MyApplicationContext ac=new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        StudentBizImpl hw= (StudentBizImpl) ac.getBean("studentBizImpl");
        hw.add("abc");
    }
}
