package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jason, Moon
 * @since 2016. 10. 20.
 */
@Controller
public class HelloController {

    @GetMapping(value = "/home")
    public String home() {

        return "site.homepage";
    }

    @GetMapping(value = "/greeting")
    public ModelAndView greeting(@RequestParam(value = "name", required = false, defaultValue = "World!") String name) {

        return new ModelAndView("site.greeting", "name", name);
    }
}