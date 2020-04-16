package com.praneeth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int sid;
	@Column
private String name;
	@Column
private String address;
	
public Student() {
		// TODO Auto-generated constructor stub
	}
public Student(int sid, String name, String address) {
	super();
	this.sid = sid;
	this.name = name;
	this.address = address;
}
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
}

}
