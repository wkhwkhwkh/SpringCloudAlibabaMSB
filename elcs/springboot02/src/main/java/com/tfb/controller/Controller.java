package com.tfb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"Controller","Controller2"},description = "Controller描述信息")
public class Controller {

    @PostMapping("/post")
    @ApiOperation(value = "post方法的add",notes = "post方法")
    public String post(){
        return "post";
    }

    @GetMapping("/get")
    public String get(String a,String b){
        return "get";
    }

    @RequestMapping("/req")
    public String req(String req){
        return "req";
    }
}
