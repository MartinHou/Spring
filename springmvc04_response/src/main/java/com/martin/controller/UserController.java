package com.martin.controller;

import com.martin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    //响应页面
    @RequestMapping("/toPage")
    public String toPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    //响应文本
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("响应文本");
        return "response text";
    }

    //响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("响应json格式的POJO对象");
        return new User("Martin",22);
    }

    //响应POJO List
    @RequestMapping("toPojoList")
    @ResponseBody
    public List<User> toPojoList(){
        System.out.println("响应POJO List");
        User martin = new User("Martin", 22);
        User john = new User("John", 18);
        ArrayList<User> users = new ArrayList<>();
        users.add(martin);
        users.add(john);
        return users;
    }
}
