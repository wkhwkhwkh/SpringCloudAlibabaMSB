package com.tfb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Controller
@RequestMapping("/first")
public class MyController {

    @RequestMapping("/hello")
    public String function(){
        return "redirect:/first/some";
    }

    @RequestMapping("/some")
    public String function2(){
        return "login";
    }

    @RequestMapping("/show5/{id}/{name}")
    public String function3(@PathVariable("id") String id,@PathVariable("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "fun3";
    }
}
