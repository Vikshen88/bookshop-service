package com.vikshen.bookshopservice.service;

import com.vikshen.bookshopservice.entity.Order;
import org.springframework.data.domain.Page;

public interface OrderService {

    Page<Order> findAll(int page);

    Order findById(int id);

}
