package com.feng.yu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * description: HelloWorld  demo
 * Create by fyu on 2020/11/15 13:02
 */
@Controller
@RequestMapping("/user")
public class MainController {
    
    @RequestMapping("/list1")
    @ResponseBody  /*加此注释，会在界面中显示list*/
    public String responseBodyTest(){
        System.out.println("**responseBodyTest**");
        return "list";
    }

    @RequestMapping("/list2")
    public String tempTest(){/*模板测试*/
        System.out.println("**tempTest**");
        return "list";
    }

    @RequestMapping("/list3")
    @ResponseBody  /*加此注释，会在界面中显示 返回的字符串*/
    public Map<String,Integer> mapTest(){
        System.out.println("**mapTest**");
        Map<String,Integer> map = new HashMap<>();
        map.put("zhangsan",123);
        map.put("lisi",456);
        //map.put("王五",789);
        return map;
    }
}
