package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {

    @RequestMapping("/m1/t1")
    public String test(){

        return "redirect:/index.jsp";
    }
}
