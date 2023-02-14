package com.surya.domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@NotEmpty()
private String uname;
	@NotEmpty(message="uid is required")
private String uid;
	
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date udob;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public Date getUdob() {
	return udob;
}
public void setUdob(Date udob) {
	this.udob = udob;
}

}
