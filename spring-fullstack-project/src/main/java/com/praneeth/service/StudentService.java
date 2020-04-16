package com.praneeth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.praneeth.model.Student;

@Service
public interface StudentService {
public List<Student> getStudents();
public Student addStudents(Student st);
}
