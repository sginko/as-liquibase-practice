package com.liquibase.practices.model.BookDto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class BookRequestDto {
    private String name;
    private String isbn;

    public BookRequestDto(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }
}
