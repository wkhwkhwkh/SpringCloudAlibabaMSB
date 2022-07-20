package com.msb.cloudalibabaconsumernacos9003.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.msb.cloudalibabacommons.entity.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("/consumer/get")
    public String getDiscovery(){
        return restTemplate.getForObject(  serverUrl + "/getServerPort",String.class);
    }

    @RequestMapping("/get")
    public String get(){
        return "111";
    }

    @RequestMapping("/consumer/get/{id}")
    //fallback属性,处理业务异常
    @SentinelResource(value = "fallback",fallback = "fallbackHandlee",blockHandler = "blockhandler")
    public JsonResult get(@PathVariable("id") Long id){
        if(id <= 3){
            return restTemplate.getForObject(serverUrl+"/get/"+id,JsonResult.class);
        }else{
            throw new NullPointerException("找不到对应的记录!");
        }
    }

    /**
     * 处理业务异常
     * @param id
     * @param e
     * @return
     */
    public JsonResult fallbackHandlee(Long id,Throwable e){
        return new JsonResult(200,"没有找到记录!");
    }

    /**
     * 服务限流
     * @param id
     * @param e
     * @return
     */
    public JsonResult blockhandler(Long id, BlockException e){
        return new JsonResult(200,"服务熔断限流!");
    }
}
