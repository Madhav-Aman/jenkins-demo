package com.example.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping()
    public String getName(){
        return "Madhav Aman Srivastava";
    }

    @GetMapping("/1")
    public String getAddress(){
        return "MADHAV_AMAN_SRIVASTAVA IS MY NAME";
    }

}
