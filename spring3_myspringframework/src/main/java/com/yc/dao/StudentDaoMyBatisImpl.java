package com.yc.dao;

import com.yc.springframework.stereotype.MyRepository;

import java.util.Random;

@MyRepository  //异常转换，从Exception转为RuntimeException
public class StudentDaoMyBatisImpl implements StudentDao {
    public int add(String name){
        System.out.println("mybatis 添加学生："+name);
        Random r=new Random();
        return r.nextInt();
    }

    public void update(String name){
        System.out.println("mybatis 更新学生："+name);
    }


}
