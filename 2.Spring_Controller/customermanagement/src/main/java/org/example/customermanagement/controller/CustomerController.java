package org.example.customermanagement.controller;

import org.example.customermanagement.model.Customer;
import org.example.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showDetail(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerService.findById(id);
        if (customer == null) {
            return new ModelAndView("redirect:/customers");
        }
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
}
