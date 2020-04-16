package com.praneeth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praneeth.model.Student;

@Repository
public interface StudentDAO  extends CrudRepository <Student, Integer> {
	  
}
