package com.msb.cloudalibabasentinelservice8402.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class BlockHandle {
    //处理异常的方法必须是static修饰
    public static String handle_exception(String hot1, String hot2, String hot3, BlockException blockException){
        return "系统繁忙稍后重试!";
    }
}
