package com.moua.springboothw1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin
public class HomeController {

    // @GetMapping()
    // public String hello() {
    //     return "Hello from SpringBoot! We are going to create a website today! You will create your own website via spring boot.";
    // }

    @RequestMapping("/home")
    public String home(){
        return "index.html";
    }

    @RequestMapping("/about")
    public String about(){
        return "about.html";
    }    

    @RequestMapping("/form")
    public String form(){
        return "form.html";
    }

    @RequestMapping("/other")
    public String other(){
        return "other.html";
    }
    
}