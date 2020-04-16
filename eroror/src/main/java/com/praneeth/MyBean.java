package com.praneeth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class MyBean  {
	@Autowired
private JdbcTemplate jt;
public MyBean(JdbcTemplate jt)
{
	this.jt=jt;
	System.out.println(jt);
}
}
