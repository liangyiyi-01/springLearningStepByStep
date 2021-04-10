package com.yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
@Order(value=100)
public class Log2Aspect {
    //@Around("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====compute===进到了 增强了...");
        long start =System.currentTimeMillis();
        Object retVal=pjp.proceed();//目标类的目标方法
        long end=System.currentTimeMillis();
        System.out.println("=====compute===退出 增强了...");
        System.out.println("=====这个方法运行时长为:"+(end-start));
        return retVal;

    }
}
