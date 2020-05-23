package com.vikshen.bookshopservice.service;

import com.vikshen.bookshopservice.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {

    Page<Book> findAll(int page);

    Page<Book> findByCategory(String name, int page);

    Book findById(int id);

}
