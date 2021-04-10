package com.yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //表示当前类是一个配置类
@ComponentScan(basePackages="com.yc")//将来要托管的bean类要扫描的报以及子包
public class AppConfig {
}
