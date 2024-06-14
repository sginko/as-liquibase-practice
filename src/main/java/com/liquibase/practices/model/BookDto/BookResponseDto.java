package com.liquibase.practices.model.BookDto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookResponseDto {

    private String name;
    private String isbn;

    public BookResponseDto(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }
}
