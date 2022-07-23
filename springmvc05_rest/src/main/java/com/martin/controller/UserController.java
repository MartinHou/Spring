package com.martin.controller;

import com.martin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    //新增/保存
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("user saved");
        return "{'module':'user saved'}";
    }

    //修改/更新
//    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id){
        System.out.println(id + " user updated");
        return "{'module':'user inserted'}";
    }

    //删除
//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println(id+" user deleted");
        return "{'module':'user deleted'}";
    }

    //查单个
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(id+" user found");
        return "{'module':'user found'}";
    }

    //查所有
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getById(){
        System.out.println("all user found");
        return "{'module':'all user found'}";
    }
}
