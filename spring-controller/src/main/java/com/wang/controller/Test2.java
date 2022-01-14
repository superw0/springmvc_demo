package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test2 {
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int result=a+b;
        model.addAttribute("msg",result);
        return "test";
    }
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int result=a+b;
        model.addAttribute("msg",result);
        return "test";
    }

}
