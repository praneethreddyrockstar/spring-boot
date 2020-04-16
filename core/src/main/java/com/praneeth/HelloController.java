package com.praneeth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class HelloController {

	@Autowired
	ApplicationPro pro;
	@RequestMapping("/hello")
	public String msg()
	{
		System.out.println("unique value:"+pro.getUnique());
		return " value"+pro.getUnique();
		
	}
}
