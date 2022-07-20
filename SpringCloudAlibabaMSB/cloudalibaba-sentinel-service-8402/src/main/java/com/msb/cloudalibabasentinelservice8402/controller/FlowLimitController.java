package com.msb.cloudalibabasentinelservice8402.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @RequestMapping("/getA")
    public String getA(){
        /*try {
            Thread.sleep(800); //暂停0.8秒模拟线程阈值引发快速失败机制
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "A";
    }

    @RequestMapping("/getB")
    public String getB(){
        return "B";
    }

    @RequestMapping("/getD")
    @SentinelResource(value = "hotKey",blockHandler = "handle_exception",blockHandlerClass = BlockHandle.class)
    public String getD(String hot1,String hot2,String hot3){
        return "D";
    }

    /*public String handle_exception(String hot1, String hot2, String hot3, BlockException blockException){
        return "系统繁忙稍后重试!";
    }*/
}
