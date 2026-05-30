package com.deus.restaurant_management.repository;

import com.deus.restaurant_management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import com.deus.restaurant_management.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}