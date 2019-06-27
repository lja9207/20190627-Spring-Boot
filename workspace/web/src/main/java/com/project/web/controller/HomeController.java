package com.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String name() {
        System.out.println("--------------컨트롤러----------------");
        return "index";
    }
}