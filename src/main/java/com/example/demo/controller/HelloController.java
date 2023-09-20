package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/spring")
    public String helloSpring() {
        if (true) {
            Integer a = 0;
        } else {
            Integer b = 0;
        }
        Long bigNum = Long.valueOf(Integer.MAX_VALUE+2);
        List<String> data = null;
        if (data.size() > 0) {
            for (String value : data) {
                System.out.println(value);
            }
        }
        return "Hello Spring";
    }
}
