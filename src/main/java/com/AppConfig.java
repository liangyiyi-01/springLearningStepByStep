package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration   //表示当前类是一个配置类
@ComponentScan(basePackages={"com.huwei","com.mimi"})  //要托管的bean
public class AppConfig { //JAVA容器的配置
    @Bean
    public Random r(){
        return new Random() ;
    }

}
