package com.liquibase.practices.controller;

import com.liquibase.practices.model.BookDto.BookRequestDto;
import com.liquibase.practices.model.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody BookRequestDto requestDto){
        bookService.addBook(requestDto);
    }

    @GetMapping
    public void getAllBooks(){
        bookService.findAllBooks();
    }
}
