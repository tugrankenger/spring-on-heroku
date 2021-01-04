package com.tugrankenger.spring_on_heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringOnHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnHerokuApplication.class, args);
	}

}

@RestController
	class HelloController{
		@GetMapping("/")
		String hello(){
			return "Hello Spring";
		}
	}
