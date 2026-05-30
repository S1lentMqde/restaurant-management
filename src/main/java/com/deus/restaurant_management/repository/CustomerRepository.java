package com.deus.restaurant_management.repository;

import com.deus.restaurant_management.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}