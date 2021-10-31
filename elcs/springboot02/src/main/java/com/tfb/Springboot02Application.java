package com.tfb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2  //开启swagger2 是springfox提供的注解,代表swagger相关技术的开启,会扫描当前类的所在包及其子包下的所有类型的注解,作为swagger的定值
//@MapperScan("com.tfb.mapper")扫描mapper下的所有接口和@mapper注解类似
public class Springboot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);
    }

}
