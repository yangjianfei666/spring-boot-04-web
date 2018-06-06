package com.yang.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 *   写具体的逻辑控制代码
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }


    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(Map<String,Object> map) {
        //classpath: /templates/success.html
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }
}
