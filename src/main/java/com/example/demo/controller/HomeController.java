package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Tells framework that this class is controller
public class HomeController {

    @GetMapping("/index")//This is the URL extension to return 'index' method
    public String index() { //Always return String when working with Spring
        return "index"; //Returns the index.html in browser window
    }

}
