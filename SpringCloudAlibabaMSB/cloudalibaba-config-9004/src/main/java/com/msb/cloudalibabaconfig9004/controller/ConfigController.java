package com.msb.cloudalibabaconfig9004.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //实时刷新
public class ConfigController {

    @Value("${config.info}")
    private String config;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return config;
    }
}
