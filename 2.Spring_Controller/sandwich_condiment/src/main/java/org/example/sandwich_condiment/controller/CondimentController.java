package org.example.sandwich_condiment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {
    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/save")
    public String save(@RequestParam("condiments") String[] condiments, Model model) {
        if (condiments == null || condiments.length == 0) {
            condiments = new String[0];
        }
        model.addAttribute("condiments", condiments);
        return "result";
    }
}
