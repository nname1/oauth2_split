package com.kelvin.oauth2.resourceServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(name="name",required = false) String name){
        return "hello "+name;
    }

    @RequestMapping("/api/info")
    public String order(@RequestParam(name="name",required = false) String name){
        return "order "+name;
    }
}
