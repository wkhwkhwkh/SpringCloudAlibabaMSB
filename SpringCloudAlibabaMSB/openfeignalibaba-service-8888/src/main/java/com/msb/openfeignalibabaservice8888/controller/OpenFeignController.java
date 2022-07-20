package com.msb.openfeignalibabaservice8888.controller;

import com.msb.cloudalibabacommons.entity.JsonResult;
import com.msb.openfeignalibabaservice8888.feign.OpenFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class OpenFeignController {

    @Autowired
    private OpenFeignClient openFeignClient;


    @RequestMapping("/get/{id}")
    public JsonResult get(@PathVariable("id") Long id){
        return openFeignClient.getJson(id);
    }
}
