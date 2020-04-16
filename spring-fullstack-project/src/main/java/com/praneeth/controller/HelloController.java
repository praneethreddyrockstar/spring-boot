package com.praneeth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth.model.Student;
import com.praneeth.service.StudentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class HelloController {

	@Autowired
	StudentService service;
	@RequestMapping("/students")
	public List<Student> fetchAllStudents()
	{
		return  service.getStudents();
	}
	@RequestMapping("/addstudent")
	public Student addStudents(@RequestBody Student st)
	{
		System.out.println(st);
		return  service.addStudents(st);
	}
	
	
	
	
}
