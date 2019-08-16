package com.phlab;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDrools {

	private static final Logger LOGGER = LogManager.getLogger(SpringBootDrools.class);
	
	public static void main(String[] args) {
		LOGGER.debug("Starting Application");
		SpringApplication.run(SpringBootDrools.class, args);
		LOGGER.debug("Application started");
	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

}
