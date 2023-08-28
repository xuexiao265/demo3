package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController
public class Demo1 {
    @RequestMapping("/hello")
    public String helloDemo(){
        return "hello SpringBoot";
    }
}
