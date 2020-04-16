package com.praneeth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.praneeth.controller","com.praneeth.service","com.praneeth.model"})
public class SpringFullstackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFullstackProjectApplication.class, args);
	}

}
