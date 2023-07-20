package com.currency.exchanger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class ExchangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangerApplication.class, args);
	}



}
