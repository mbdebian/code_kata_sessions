package com.google.mbdebian.springboot.playground.embedapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyembedappApplication {
	private static final Logger logger = LoggerFactory.getLogger(MyembedappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyembedappApplication.class, args);
	}

	@Bean
	public String start(ApplicationContext ctxt) {
		logger.info("Application started");
		return "";
	}
}
