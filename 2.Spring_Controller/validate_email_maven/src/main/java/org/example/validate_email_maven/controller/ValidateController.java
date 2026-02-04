package org.example.validate_email_maven.controller;

import org.example.validate_email_maven.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ValidateController {
    private final ValidateService validateService;

    @Autowired
    public ValidateController(ValidateService validateService) {
        this.validateService = validateService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, ModelMap modelMap) {
        boolean isValid = validateService.validate(email);
        if (!isValid) {
            modelMap.addAttribute("message", "Email is invalid");
            return "home";
        }
        modelMap.addAttribute("email", email);
        return "success";
    }
}
