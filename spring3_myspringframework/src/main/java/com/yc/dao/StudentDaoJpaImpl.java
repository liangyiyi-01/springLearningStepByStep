package com.yc.dao;


import com.yc.springframework.stereotype.MyRepository;

import java.util.Random;

@MyRepository
public class StudentDaoJpaImpl implements StudentDao{
    @Override
    public int add(String name){
        System.out.println("jpa 添加学生："+name);
        Random r=new Random();
        return r.nextInt();
    }

    public void update(String name){
        System.out.println("jpa 更新学生："+name);
    }

}
