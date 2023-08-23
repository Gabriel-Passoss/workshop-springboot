package com.kooujin.course.resources;

import com.kooujin.course.entities.Order;
import com.kooujin.course.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    private final OrderService orderService;

    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> ordersList = orderService.findAll();
        return ResponseEntity.ok().body(ordersList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        var order = orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
