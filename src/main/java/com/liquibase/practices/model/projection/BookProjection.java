package com.liquibase.practices.model.projection;

import org.springframework.beans.factory.annotation.Value;

public interface BookProjection {

    String getName();

    String getIsbn();
}
