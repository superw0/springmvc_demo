package com.wang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController2 {
    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User(1,"王文胜",20);
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便

        return str;
    }

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String s = mapper.writeValueAsString(sdf.format(date));
        return s;
    }

    @RequestMapping("/json3")
    public String json3(){
        List<User> list=new ArrayList<>();
        User user1=new User(1,"wws",20);
        User user2=new User(2,"gty",45);
        User user3=new User(3,"erf",37);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        String s = JSON.toJSONString(list);
        return s;
    }
}
