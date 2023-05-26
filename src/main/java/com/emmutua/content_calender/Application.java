package com.emmutua.content_calender;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.model.Status;
import com.emmutua.content_calender.model.Type;
import com.emmutua.content_calender.repository.ContentRepository;
import com.emmutua.content_calender.repository.ContentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

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
					"MyFirstBlogPOst",
					"MyFirstBlogPost",
					Status.IDEA,
					Type.ARTICLE,
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