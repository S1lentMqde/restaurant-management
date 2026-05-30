package com.deus.restaurant_management.controller;

import com.deus.restaurant_management.dto.CustomerDto;
import com.deus.restaurant_management.entity.Customer;
import com.deus.restaurant_management.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@Valid @RequestBody CustomerDto customerDto) {

        Customer customer = new Customer();

        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());

        return customerService.createCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
