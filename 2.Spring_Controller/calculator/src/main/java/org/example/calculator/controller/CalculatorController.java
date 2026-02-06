package org.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("firstOp") double firstOp, @RequestParam("secondOp") double secondOp, @RequestParam("operator") String operator, Model model) {
        double result = 0;
        switch (operator) {
            case "add":
                result = firstOp + secondOp;
                break;
            case "sub":
                result = firstOp - secondOp;
                break;
            case "multi":
                result = firstOp * secondOp;
                break;
            case "div":
                if (secondOp == 0) {
                    model.addAttribute("result", "ERROR: Division by zero");
                    return "index";
                }
                result = firstOp / secondOp;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
