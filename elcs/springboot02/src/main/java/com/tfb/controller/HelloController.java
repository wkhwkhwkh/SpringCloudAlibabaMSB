package com.tfb.controller;

import com.tfb.pojo.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@RestController
//接口中文注释
@Api("Hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println(1);
        return "hello";
    }


    //只要接口中返回值存在实体类，它就会被扫描到swagger中
    @ApiOperation("user接口")
    @PostMapping("/user")
    public Person user(){
        return new Person();
    }


    //只要接口中返回值存在实体类，它就会被扫描到swagger中
    //@ApiOperation放在方法上的注释
    @ApiOperation("user2接口")
    @PostMapping("/user2")
    public Person user2(@ApiParam("年龄") @RequestParam("age") int age){
        return new Person();
    }
}
