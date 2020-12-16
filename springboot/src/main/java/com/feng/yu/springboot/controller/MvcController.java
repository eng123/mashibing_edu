package com.feng.yu.springboot.controller;

import com.feng.yu.springboot.domain.User;
import com.feng.yu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

/**
 * description:
 * Create by fyu on 2020/11/15 19:12
 */
@Controller
public class MvcController {
    
    @Autowired
    UserService service;
    
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> mvcTest(){
        return service.findAll();
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public Object selectById(){
        return service.selectById(2);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        service.add();
        return "ok";
    }

    @RequestMapping("/delet")
    @ResponseBody
    public String delet(){
        int random = new Random().nextInt(50);
        service.delet(random);
        return "ok";
    }

    @RequestMapping("/deletAll")
    @ResponseBody
    public String deletAll(){
        service.deletAll();
        return "ok";
    }
}
