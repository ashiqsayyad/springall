package com.ashiq.springlearn.springall.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Document(collection = "myusers")
public class User {
	//password validation - https://memorynotfound.com/custom-password-constraint-validator-annotation/
	@Id
	private String id;
	@Indexed(unique = true)
	@NotEmpty
	@Size(min=10, max=10) 
	private String mobilenumber;
	public User(String mobilenumber, String password, String firstName, String lasName) {
		super();
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.firstName = firstName;
		this.lasName = lasName;
	}
	@JsonIgnore
	private String password;
	
    private String  firstName;
    private String lasName;
    
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

}
