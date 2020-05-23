package com.vikshen.bookshopservice.service;

import com.vikshen.bookshopservice.entity.Book;
import com.vikshen.bookshopservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Page<Book> findAll(int page) {

        PageRequest pageRequest =PageRequest.of(page,6);

        return bookRepository.findAll(pageRequest);
    }

    @Override
    public Page<Book> findByCategory(String name, int page) {

        String url = "/" + name;

        PageRequest pageRequest = PageRequest.of(page,6);

        return bookRepository.findByCategory(url, pageRequest);
    }

    @Override
    public Book findById(int id) {
        Optional<Book> result = bookRepository.findById(id);

        Book book = new Book();

        if(result.isPresent()){
            book = result.get();
        }

        return book;
    }
}
