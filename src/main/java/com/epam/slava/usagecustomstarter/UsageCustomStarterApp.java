package com.epam.slava.usagecustomstarter;

import com.epam.jgmp.customstarter.service.SlavaGreeting;
import com.epam.slava.usagecustomstarter.service.UsageGreetingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsageCustomStarterApp implements CommandLineRunner {

	@Autowired
	private SlavaGreeting slavaGreeting;

	public static void main(String[] args) {
		SpringApplication.run(UsageCustomStarterApp.class, args);
	}

	/**
	 *	Comment the bean below to see default on missing bean condition works
	 */
	@Bean
	public SlavaGreeting slavaGreeting() {
		return new UsageGreetingImpl();
	}
	@Override
	public void run(String... args) throws Exception {
		slavaGreeting.sayHello();
	}
}
