package com.ordersystem.orderservice.repository;

import com.ordersystem.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for orders
 *
 * @author Grzegorz Oleksy
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
