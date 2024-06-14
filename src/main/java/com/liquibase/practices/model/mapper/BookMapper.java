package com.liquibase.practices.model.mapper;

import com.liquibase.practices.model.bookDto.BookRequestDto;
import com.liquibase.practices.model.bookDto.BookResponseDto;
import com.liquibase.practices.model.entity.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookResponseDto fromEntity(BookEntity entity){
        return new BookResponseDto(entity.getName(), entity.getIsbn());
    }

    public BookEntity toEntity(BookRequestDto requestDto){
        return new BookEntity(requestDto.getName(), requestDto.getIsbn());
    }
}
