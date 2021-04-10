package com.yc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.security.ec.point.ProjectivePoint;

import java.text.SimpleDateFormat;
import java.util.Date;

//切面类：要增强强的功能卸载这里
@Aspect
@Component //ioc注解，以实现ioc注解功能
@Order(value=1)
public class LogAspect {

    //切入点声明 Pointcut signature
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.add*(..))") //切入点表达式，哪些方法上加增强
    private void add(){

    }
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.update*(..))") //切入点表达式，哪些方法上加增强
    private void update(){

    }
    @Pointcut("add()||update())") //切入点表达式，哪些方法上加增强
    private void addAndUpdate(){

    }
    //@After("com.yc.aspect.LogAspect.addAndUpdate()")
    public void bye(JoinPoint jp){
        System.out.println("=======bye=====");
        //连接点中所有的信息
        Object target=jp.getTarget();
        System.out.println("目标类为："+target);
        System.out.println("方法："+jp.getSignature());
        Object[] objs=jp.getArgs();

    }

    @Around("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    @Order(value=1)
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====compute===进到了 增强了...");
        long start =System.currentTimeMillis();
        Object retVal=pjp.proceed();//目标类的目标方法
        long end=System.currentTimeMillis();
        System.out.println("=====compute===退出 增强了...");
        System.out.println("=====这个方法运行时长为:"+(end-start));
        return retVal;

    }

    @Around("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    @Order(value=10)
    public Object compute2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====compute2===进到了 增强了...");
        long start =System.currentTimeMillis();
        Object retVal=pjp.proceed();//目标类的目标方法
        long end=System.currentTimeMillis();
        System.out.println("=====compute2===退出 增强了...");
        System.out.println("=====这个方法运行时长为:"+(end-start));
        return retVal;

    }
    //切入点表达式完整的语法: ?代表出现0次或一次
    //modifiers-pattern:修饰符


    //增强的声明
    //@Before("com.yc.aspect.LogAspect.add()")
    public void log(){
        System.out.println("====前置增强的日志=======");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr=sdf.format(d);
        System.out.println("执行时间为:"+dstr);
        System.out.println("====前置增强的日志结束=======");

    }


}
