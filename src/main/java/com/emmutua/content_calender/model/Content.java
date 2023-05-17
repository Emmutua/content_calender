package com.emmutua.content_calender.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;


import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dataCreated,
        LocalDateTime dataUpdated,
        String url
) {}