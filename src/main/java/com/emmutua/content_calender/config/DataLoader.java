package com.emmutua.content_calender.config;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.repository.ContentRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

//creating a client for api calls

//@Component
// class DataLoader implements CommandLineRunner {
//
//    private final ContentRepository repository;
//    private final ObjectMapper objectMapper;
//
//    public DataLoader(ContentRepository repository, ObjectMapper objectMapper1) {
//        this.repository = repository;
//        this.objectMapper = objectMapper1;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        try( InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
//           repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>(){}));
//        }
//    }
//}

@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if(repository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
                repository.saveAll(objectMapper.readValue(inputStream,new TypeReference<List<Content>>(){}));
            }
        }
    }

}


