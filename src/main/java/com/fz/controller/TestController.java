package com.fz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {



    @RequestMapping("test")
    public String test(){
//        跳转到index.html页面
             return "index.html";

         }
}
