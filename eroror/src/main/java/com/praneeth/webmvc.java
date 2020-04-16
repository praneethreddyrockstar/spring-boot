package com.praneeth;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class webmvc  implements WebMvcConfigurer{

	
	public void addCorsMappings( CorsRegistry r)
	{
		r.addMapping("/api/**");
	}
}
