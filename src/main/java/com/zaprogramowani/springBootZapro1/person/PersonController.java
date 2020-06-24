package com.zaprogramowani.springBootZapro1.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required = false, defaultValue = "Janusz") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    
}