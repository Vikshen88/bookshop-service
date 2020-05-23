package com.vikshen.bookshopservice.controller;

import com.vikshen.bookshopservice.entity.Book;
import com.vikshen.bookshopservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public Page<Book> getAllBooks(@RequestParam("page") int page){
        return bookService.findAll(page);
    }

    @GetMapping("/{category}")
    public Page<Book> getBooksByCategory(@PathVariable String category, @RequestParam("page") int page){
        return bookService.findByCategory(category, page);
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.findById(id);
    }

}
