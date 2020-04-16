package com.praneeth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	 static RestTemplate rest=new RestTemplate();
	@RequestMapping("/")
	public String getOb()
	{
		System.out.println(rest.getForObject("http://localhost:9090/students", String.class));
		return rest.getForObject("http://localhost:9090/students", String.class);
	}
	
}
