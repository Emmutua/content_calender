package com.emmutua.content_calender.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties(value = "cc")
public record ContentCalenderProperties(String welcomeMessage, String about) {

}
