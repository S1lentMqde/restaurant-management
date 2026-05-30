package com.deus.restaurant_management.controller;

import com.deus.restaurant_management.entity.Order;
import com.deus.restaurant_management.entity.OrderStatus;
import com.deus.restaurant_management.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @PutMapping("/{id}/status")
    public Order updateStatus(
            @PathVariable Long id,
            @RequestParam OrderStatus status) {

        return orderService.updateStatus(id, status);
    }

    @GetMapping("/{id}/total")
    public Double calculateTotal(@PathVariable Long id) {
        return orderService.calculateTotal(id);
    }
}