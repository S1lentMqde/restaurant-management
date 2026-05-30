package com.deus.restaurant_management.service;

import com.deus.restaurant_management.entity.OrderItem;
import com.deus.restaurant_management.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private final OrderItemRepository repository;

    public OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    public OrderItem create(OrderItem item) {
        return repository.save(item);
    }

    public List<OrderItem> getAll() {
        return repository.findAll();
    }
}