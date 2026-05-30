package com.deus.restaurant_management.controller;

import com.deus.restaurant_management.entity.OrderItem;
import com.deus.restaurant_management.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    private final OrderItemService service;

    public OrderItemController(OrderItemService service) {
        this.service = service;
    }

    @PostMapping
    public OrderItem create(@RequestBody OrderItem item) {
        System.out.println("ORDER = " + item.getOrder());
        System.out.println("MENU = " + item.getMenuItem());
        return service.create(item);
    }

    @GetMapping
    public List<OrderItem> getAll() {
        return service.getAll();
    }
}
