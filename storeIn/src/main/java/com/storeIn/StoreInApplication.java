package com.storeIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreInApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreInApplication.class, args);
	}

}
