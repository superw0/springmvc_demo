package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) {
        System.out.println(name);
        if ("wws".equals(name)) {
            try {
                response.getWriter().print("true");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.getWriter().print("false");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/a2")
    public List<User> getUser(){
        List<User> users = new ArrayList<>();
        users.add(new User("wws",10,"男"));
        users.add(new User("测ve",23,"男"));
        users.add(new User("得分",56,"男"));
        return users;
    }

    @RequestMapping("/check")
    public String check(String name,String password){
        String msg = "";
        if (name!=null){
            if ("admin".equals(name)){
                msg="ok";
            }else {
                msg="用户名有误";
            }
        }
        if (password!=null){
            if ("123456".equals(password)){
                msg="ok";
            }else {
                msg="密码有误";
            }
        }
        return msg;
    }
}

