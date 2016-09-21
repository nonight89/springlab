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
}
