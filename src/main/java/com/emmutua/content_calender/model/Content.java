package com.emmutua.content_calender.model;

import jakarta.validation.constraints.NotBlank;


import java.time.LocalDateTime;

//h2 database is great for prototype
public record Content(
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {}
