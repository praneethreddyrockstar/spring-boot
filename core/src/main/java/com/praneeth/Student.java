package com.praneeth;

public class Student {
private int sid;
private String name;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(int sid, String name) {
	super();
	this.sid = sid;
	this.name = name;
}

}
