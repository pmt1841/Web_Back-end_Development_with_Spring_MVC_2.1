package org.example.customermanagement.controller;

import org.example.customermanagement.model.Customer;
import org.example.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/detail")
    public ModelAndView findById(@RequestParam("id") int customerId) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customer = customerService.findById(customerId);
        System.out.println(customer);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
