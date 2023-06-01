package com.emmutua.content_calender;

import com.emmutua.content_calender.config.ContentCalenderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}
}

/**
 * ApplicationContext = Bean that enables you to get all the classes
 */