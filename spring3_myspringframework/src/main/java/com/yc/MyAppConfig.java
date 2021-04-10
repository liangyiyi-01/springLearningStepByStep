package com.yc;

import com.yc.bean.sonBean.HelloWorld;
import com.yc.springframework.stereotype.MyBean;
import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

@MyConfiguration
@MyComponentScan(basePackages={"com.yc.dao","com.yc.biz"})
public class MyAppConfig {//ioc配置 针对第三方包bean
//    @MyBean
//    public HelloWorld hw(){
//        return new HelloWorld();
//    }
//    @MyBean
//    public HelloWorld hw2(){
//        return new HelloWorld();
//    }
}
