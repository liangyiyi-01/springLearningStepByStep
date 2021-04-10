package com.yc.biz;

import com.yc.dao.StudentDao;
import com.yc.springframework.stereotype.MyAutowired;
import com.yc.springframework.stereotype.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@MyService
public class StudentBizImpl {
    private StudentDao studentDao;

    //@Autowired   //org.springframework
   // @Qualifier("studentDaoImpl")  //如果有多个对象
    @MyAutowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }


    public StudentBizImpl(){}

    public int add(String name){
        System.out.println("----------业务层-----------");
        System.out.println("用户是否重名");
        int result=studentDao.add(name);
        System.out.println("----------业务操作结束-----------");
        return result;
    }
    public void update(String name){
        System.out.println("----------业务层-----------");
        System.out.println("用户是否重名");
        int result=studentDao.add(name);
        System.out.println("----------业务操作结束-----------");
    }

}
