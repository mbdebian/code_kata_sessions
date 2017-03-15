package uk.ac.ebi.code.kata.session.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private SimpleSubApplication simpleSubApplication;
	@Autowired
	private AnotherApplication anotherApplication;

	public DemoApplication() {
		System.out.println("GOTCHYA!!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner oneguy(ApplicationContext ctxt) {
		return args -> {
			System.out.println("[oneguy] IS RUNNING");
			Thread.currentThread().sleep(1000);
			System.out.println("[oneguy] IS DONE");
		};
	}

	@Bean
	public CommandLineRunner secondguy(ApplicationContext ctxt) {
		return args -> {
			System.out.println("[secondguy] IS RUNNING");
			Thread.currentThread().sleep(1000);
			System.out.println("[secondguy] IS DONE");
		};
	}

	@Bean
	public String thirdguy(ApplicationContext ctxt) {
		System.out.println("[thirdguy] THIS IS WEIRD");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[thirdguy] IS DONE");
		return "";
	}

	@Bean
	public String mySubApplications(ApplicationContext ctxt) {
		logger.info("BEFORE RUNNING THE SIMPLE SUB-APPLICATION");
		List<CommandLineRunner> runners = new ArrayList<>();
		runners.add(simpleSubApplication);
		runners.add(anotherApplication);
		runners.parallelStream().forEach(runItem());
		return "";
	}

	private Consumer<CommandLineRunner> runItem() {
		return item -> {
			try {
				item.run("");
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}
