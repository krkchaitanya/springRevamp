package com.springnew.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
}

