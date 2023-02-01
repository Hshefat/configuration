package com.seals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SealsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SealsApplication.class, args);
	}

}
