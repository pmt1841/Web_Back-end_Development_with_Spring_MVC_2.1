package org.example.customermanagementthymeleaf.controller;

import org.example.customermanagementthymeleaf.model.Customer;
import org.example.customermanagementthymeleaf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Customer has been saved successfully");
        return "redirect:/customers";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Updated customer successfully!");
        return "redirect:/customers";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "delete";

    }

    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customers";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }
}
