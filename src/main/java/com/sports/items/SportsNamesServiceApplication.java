package com.sports.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SportsNamesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsNamesServiceApplication.class, args);
	}

}
