package com.springnew.demoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
//    Method to show a form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld";
    }

}

