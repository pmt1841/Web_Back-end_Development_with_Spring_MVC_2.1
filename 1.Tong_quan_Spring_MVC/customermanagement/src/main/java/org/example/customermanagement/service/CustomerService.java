package org.example.customermanagement.service;

import org.example.customermanagement.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id);
}
