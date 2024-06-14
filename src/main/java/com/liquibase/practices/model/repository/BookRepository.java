package com.liquibase.practices.model.repository;

import com.liquibase.practices.model.entity.BookEntity;
import com.liquibase.practices.model.projection.BookProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookProjection> findAllBy();
}
