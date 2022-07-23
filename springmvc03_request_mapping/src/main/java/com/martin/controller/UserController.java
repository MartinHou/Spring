package com.martin.controller;

import com.martin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("name")String username,int age){
        System.out.println(username+" "+age+" user saved");
        return "{'module':'user saved'}";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(User user){
        System.out.println(user);
        return "{'module':'user inserted'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user deleted");
        return "{'module':'user deleted'}";
    }

    @RequestMapping("/listForJson")
    @ResponseBody
    public String listForJson(@RequestBody List<String> likes){
        System.out.println(likes);
        return "list for json";
    }

    @RequestMapping("/pojoForJson")
    @ResponseBody
    public String pojoForJson(@RequestBody User user){
        System.out.println(user);
        return "pojo for json";
    }

    @RequestMapping("listPojoForJson")
    @ResponseBody
    public String listPojoForJson(@RequestBody List<User> likes){
        System.out.println(likes);
        return "list pojo for json";
    }
}
