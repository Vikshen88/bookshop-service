package com.vikshen.bookshopservice.service;


import com.vikshen.bookshopservice.entity.Order;
import com.vikshen.bookshopservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Page<Order> findAll(int page) {
        PageRequest pageRequest = PageRequest.of(page,5);

        return orderRepository.findAll(pageRequest);
    }

    @Override
    public Order findById(int id) {
        Optional<Order> result = orderRepository.findById(id);

        Order order = new Order();

        if(result.isPresent()){
            order = result.get();
        }

        return order;
    }
}
