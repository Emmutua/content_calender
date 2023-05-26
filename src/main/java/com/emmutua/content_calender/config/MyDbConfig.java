package com.emmutua.content_calender.config;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.repository.ContentRepository;
import com.emmutua.content_calender.repository.ContentRowMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

//creating a client for api calls

//@Component
//public class DataLoader implements CommandLineRunner {
//
//    private final ContentRepository repository;
//    private final ContentRowMapper objectMapper;
//
//    public DataLoader(ContentRepository repository, ContentRowMapper objectMapper) {
//        this.repository = repository;
//        this.objectMapper = objectMapper;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.findAllByContentType()
//    }
//
//}