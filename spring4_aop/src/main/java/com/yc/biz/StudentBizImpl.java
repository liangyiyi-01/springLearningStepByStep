package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service//给spring类的托管
public class StudentBizImpl implements StudentBiz{
    private StudentDao studentDao;

    //@Autowired   //只按类型注入，多个则失败
   // @Qualifier("studentDaoImpl")  //如果有多个对象
    @Autowired
    @Qualifier("studentDaoJpaImpl")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
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
        studentDao.update(name);
        System.out.println("----------业务操作结束-----------");
    }
    public void find(String name){
        System.out.println("======业务层======");
        System.out.println("业务层查找用户名"+name);
        studentDao.find(name);

        System.out.println("======业务层======");

    }

}
