package com.liquibase.practices.model.service;

import com.liquibase.practices.model.BookDto.BookRequestDto;
import com.liquibase.practices.model.BookDto.BookResponseDto;
import com.liquibase.practices.model.entity.BookEntity;
import com.liquibase.practices.model.mapper.BookMapper;
import com.liquibase.practices.model.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookResponseDto> findAllBooks() {
        return bookRepository.findAll().stream()
                .map(entity -> bookMapper.fromEntity(entity))
                .toList();
    }

    @Override
    public void addBook(BookRequestDto requestDto) {
        bookRepository.save(bookMapper.toEntity(requestDto));
    }
}
