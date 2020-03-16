package io.javabrains.c19tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class C19TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(C19TrackerApplication.class, args);
	}

}
