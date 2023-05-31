package com.emmutua.content_calender.model;

import jakarta.validation.constraints.NotBlank;


import java.time.LocalDateTime;

//h2 database is great for prototype
public record Content(
        Integer id,
        @NotBlank
        String title,
        String descr,
        String status,
        String content__Type,
        LocalDateTime date__Created,
        LocalDateTime date__Updated,
        String url
) {}
