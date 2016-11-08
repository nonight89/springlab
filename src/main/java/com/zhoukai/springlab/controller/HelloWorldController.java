package com.zhoukai.springlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping("/print")
    public String helloworld(Model model){
        model.addAttribute("message", "hello world!");
        return "helloWorld";
    }
    
    @RequestMapping("/print1")
    public String helloworld1(Model model){
        model.addAttribute("message", "hello world!");
        return "helloWorld";
    }
    
    @RequestMapping("/print2")
    public String helloworld2(Model model){
        model.addAttribute("message", "hello world!");
        return "helloWorld";
    }
    
    //TEST
}
