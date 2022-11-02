package com.example.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHome()
    {
        System.out.println("teste aqui");
        return "index";
    }
}
