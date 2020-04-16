package com.praneeth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentCon {

	@Bean
	public Student getInstance()
	{
		return new Student(1, "praneeth");
	}
}
