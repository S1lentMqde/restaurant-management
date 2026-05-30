package com.deus.restaurant_management.service;

import com.deus.restaurant_management.entity.Order;
import com.deus.restaurant_management.entity.OrderItem;
import com.deus.restaurant_management.entity.OrderStatus;
import com.deus.restaurant_management.repository.OrderItemRepository;
import com.deus.restaurant_management.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    public OrderService(OrderRepository orderRepository,
                        OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order updateStatus(Long orderId, OrderStatus status) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow();

        order.setStatus(status);

        return orderRepository.save(order);
    }

    public Double calculateTotal(Long orderId) {

        List<OrderItem> items =
                orderItemRepository.findByOrderId(orderId);

        double total = 0.0;

        for (OrderItem item : items) {
            total += item.getQuantity()
                    * item.getMenuItem().getPrice();
        }

        return total;
    }
}
