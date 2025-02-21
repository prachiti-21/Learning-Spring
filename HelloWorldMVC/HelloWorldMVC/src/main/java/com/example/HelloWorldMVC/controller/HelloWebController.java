package com.example.HelloWorldMVC.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/hello")
    public String message(Model model){
        model.addAttribute("message","Hello from BridgeLabz");
        return "hello";
    }
}
