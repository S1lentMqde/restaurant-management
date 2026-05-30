package com.deus.restaurant_management.service;

import com.deus.restaurant_management.entity.Customer;
import com.deus.restaurant_management.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @Test
    void shouldCreateCustomer() {

        CustomerRepository repository =
                Mockito.mock(CustomerRepository.class);

        CustomerService service =
                new CustomerService(repository);

        Customer customer =
                new Customer("Deus", "deus@gmail.com");

        Mockito.when(repository.save(customer))
                .thenReturn(customer);

        Customer saved = service.createCustomer(customer);

        assertEquals("Deus", saved.getName());
        assertEquals("deus@gmail.com", saved.getEmail());
    }
}