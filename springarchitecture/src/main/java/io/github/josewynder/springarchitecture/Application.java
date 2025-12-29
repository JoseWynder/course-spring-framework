package io.github.josewynder.springarchitecture;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(Application.class);

		builder.profiles("production", "approval");
		builder.lazyInitialization(true);

		builder.run(args);

		// Application context already started.
		ConfigurableApplicationContext applicationContext = builder.context();
//		var productRepository = applicationContext.getBean("productRepository");


		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("Application Name: " + applicationName);

		ValueExample value = applicationContext.getBean(ValueExample.class);
		value.printVariable();
	}

}
