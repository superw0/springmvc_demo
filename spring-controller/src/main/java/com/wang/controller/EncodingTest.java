package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingTest {

    @RequestMapping("/e/t")
    public String encodingTest(String name, Model model){

        model.addAttribute("msg",name);
        return "test";
    }
}
