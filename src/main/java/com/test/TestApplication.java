package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	int x= 100;
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
