package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jason, Moon
 * @since 2016. 10. 20.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("name", "Spring-Boot with JSP");

        return "hello";
    }
}