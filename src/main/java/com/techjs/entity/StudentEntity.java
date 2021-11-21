package com.techjs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class StudentEntity
{
	@Id
	private int id;
	private String firstName;
	private String secondName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	

}
