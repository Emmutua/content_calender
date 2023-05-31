package com.emmutua.content_calender;

import com.emmutua.content_calender.config.ContentCalenderProperties;
import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.service.ContentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentService contentService){
		return args ->{
			Content content = new Content(
					1,
					"CHAT GPT BLOG APPLICATION",
					"MyFirstBlogPost",
					"Status.IDEA",
					"Type.ARTICLE",
					LocalDateTime.now(),
					null,
					"http://localhost:8"
			);
			contentService.save(content);
		};
	}
}

/**
 * ApplicationContext = Bean that enables you to get all the classes
 */