package com.emmutua.content_calender.controller;

import com.emmutua.content_calender.config.ContentCalenderProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

   private final ContentCalenderProperties properties;

    public HomeController(ContentCalenderProperties properties) {
        this.properties = properties;
    }
    @GetMapping("/")
    public  ContentCalenderProperties home(){
        return properties;
    }
}
