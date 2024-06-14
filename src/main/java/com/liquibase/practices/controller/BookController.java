package com.liquibase.practices.controller;

import com.liquibase.practices.model.bookDto.BookRequestDto;
import com.liquibase.practices.model.bookDto.BookResponseDto;
import com.liquibase.practices.model.projection.BookProjection;
import com.liquibase.practices.model.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
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
    public List<BookResponseDto> findAllBooks(){
        return bookService.findAllBooks();
    }

}
