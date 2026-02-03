package org.example.currency_conversion.controller;

import org.example.currency_conversion.service.ConverterServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @Autowired
    ConverterServiceInterface converterService;

    @PostMapping("/convert")
    public String convert(@RequestParam(name = "usd") double usd, @RequestParam(name = "rate") double rate, Model model) {
        double vnd = converterService.convert(usd, rate);
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("vnd", vnd);
        return "index";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
