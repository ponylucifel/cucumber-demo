package com.ponylucifel.spring.cucumberdemo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CucumberDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CucumberDemoApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "0"));
		        app.run(args);
		SpringApplication.run(CucumberDemoApplication.class, args);
	}

}
