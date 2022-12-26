package ru.kata.spring.boot_security.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @GetMapping(value = "/")
    public String startApp (ModelMap model){
        List<String> messages = new ArrayList<>();
        messages.add("START!");
        messages.add("HEY HEY");
        model.addAttribute("messages", messages);
        return "start";
    }
}
