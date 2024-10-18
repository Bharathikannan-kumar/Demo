package com.Api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Api1Application {

	public static void main(String[] args) {
		SpringApplication.run(Api1Application.class, args);
	}

	@Bean
	RestTemplate rt() {
		return new RestTemplate();
	}

}
