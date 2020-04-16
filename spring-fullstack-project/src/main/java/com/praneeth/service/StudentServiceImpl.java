package com.praneeth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praneeth.dao.StudentDAO;
import com.praneeth.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	@Override
	public List<Student> getStudents() {
		return (List<Student>) dao.findAll();
	}
	@Override
	public Student addStudents(Student st) {
		return dao.save(st);
	}

}
