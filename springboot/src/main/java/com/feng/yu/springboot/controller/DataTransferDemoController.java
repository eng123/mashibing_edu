package com.feng.yu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;

/**
 * description:
 * Create by fyu on 2020/11/15 17:07
 */
@Controller
public class DataTransferDemoController {
    
    @RequestMapping("/map")
    public String mapDataTest(ModelMap map){
        map.put("name","fyu");//可以传递给前端
        map.addAttribute("age",32);
        
        return "map";
    }

    @RequestMapping("/param")
    public String paramDataTest(ServletRequest request){
        String name = request.getParameter("name");//可以从前段获取数据
        String age = request.getParameter("age");
        System.out.println("RequestMapping＊＊," + "name = " + name +" age = " + age);

        return "param";
    }

    //实测：如果存在GetMapping或PostMapping,将不会走RequestMapping
    @GetMapping("/param")
    public String getTest(ServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("GetMapping," + "name = " + name +" age = " + age);

        return "param";
    }
    @PostMapping("/param")
    public String postTest(ServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("PostMapping," + "name = " + name +" age = " + age);

        return "param";
    }
}
