package com.liquibase.practices.model.service;

import com.liquibase.practices.model.BookDto.BookRequestDto;
import com.liquibase.practices.model.BookDto.BookResponseDto;

import java.util.List;

public interface BookService {
    List<BookResponseDto> findAllBooks();

    void addBook(BookRequestDto requestDto);
}
