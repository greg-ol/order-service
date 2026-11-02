package com.ordersystem.orderservice.service;

import com.ordersystem.orderservice.model.Order;
import com.ordersystem.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for Orders.
 *
 * @author Grzegorz Oleksy
 */
@Service
public class OrderService {

@Autowired
private OrderRepository repository;

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
