package com.kooujin.course.services;

import com.kooujin.course.entities.Order;
import com.kooujin.course.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository userRepository) {
        this.orderRepository = userRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Object findById(Long id) {
        Optional<Order> order =  orderRepository.findById(id);
        return order.get();
    }
}
