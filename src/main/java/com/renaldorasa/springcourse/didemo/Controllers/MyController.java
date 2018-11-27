package com.renaldorasa.springcourse.didemo.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");

        return "whatever";
    }
}
