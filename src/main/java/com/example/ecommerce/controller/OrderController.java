package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Order;
import com.example.ecommerce.entity.User;
import com.example.ecommerce.security.UserPrincipal;
import com.example.ecommerce.services.OrderService;
import com.example.ecommerce.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Tag(name="3.Order APIs" ,description = "Order Product Page")
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        Optional<User> user = userService.getUserByUsername(userPrincipal.getUsername());
        Order createdOrder = orderService.createOrder(user.orElse(null), order.getItems());
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getUserOrders(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        Optional<User> user = userService.getUserByUsername(userPrincipal.getUsername());
        List<Order> orders = orderService.getOrdersByUser(user.orElse(null));
        return ResponseEntity.ok(orders);
    }
}