package com.tfb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
//热部署
@Controller
@RequestMapping("")
public class UserController {

    @RequestMapping("/fun")
    @ResponseBody
    public String function(){
        return "function";
    }

}
