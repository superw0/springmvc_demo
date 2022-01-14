package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/user1")
    public String userController(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg","前端数据为"+user);
        return "test";
    }
}
