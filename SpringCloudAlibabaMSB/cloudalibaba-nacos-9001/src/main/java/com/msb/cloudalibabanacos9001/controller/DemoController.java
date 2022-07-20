package com.msb.cloudalibabanacos9001.controller;

import com.msb.cloudalibabacommons.entity.JsonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@RestController
public class DemoController {

    private static HashMap<Long,String> map = new HashMap<>();
    static{
        map.put(1L,"电脑");
        map.put(2L,"手机");
        map.put(3L,"耳机");
    }

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getServerPort")
    public String getServerPort(){
        return "Hello Nocos" + serverPort;
    }

    @RequestMapping("/get/{id}")
    public JsonResult getJson(@PathVariable("id") Long id){

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new JsonResult(200,serverPort + "====="+id + map.get(id));
    }
}
