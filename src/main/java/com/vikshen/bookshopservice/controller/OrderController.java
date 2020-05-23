package com.vikshen.bookshopservice.controller;

import com.vikshen.bookshopservice.entity.Order;
import com.vikshen.bookshopservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public Page<Order> getAllOrders(@RequestParam("page") int page){
        return orderService.findAll(page);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.findById(id);
    }

}
