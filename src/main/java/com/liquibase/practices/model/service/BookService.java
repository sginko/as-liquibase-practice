package com.liquibase.practices.model.service;

import com.liquibase.practices.model.bookDto.BookRequestDto;
import com.liquibase.practices.model.bookDto.BookResponseDto;

import java.util.List;

public interface BookService {
    List<BookResponseDto> findAllBooks();

    void addBook(BookRequestDto requestDto);
}
