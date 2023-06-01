package com.emmutua.content_calender.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;


import java.time.LocalDateTime;

//h2 database is great for prototype
public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,

        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {}
