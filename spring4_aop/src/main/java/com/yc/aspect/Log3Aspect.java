package com.yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.security.ec.point.ProjectivePoint;

@Aspect
@Component //ioc注解，以实现ioc注解功能
@Order(value=1)
public class Log3Aspect {
    @Around("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    public Object compute2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====compute2===进到了 增强了...");
        long start =System.currentTimeMillis();
        Object retVal=pjp.proceed();//目标类的目标方法
        long end=System.currentTimeMillis();
        System.out.println("=====compute2===退出 增强了...");
        System.out.println("=====这个方法运行时长为:"+(end-start));
        return retVal;

    }
}
