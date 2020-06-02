package com.ashiq.springlearn.springall.hellocontrollers;

import javax.validation.constraints.Size;

public class HelloBean {

	//getter methods are required for fields in beans else it will throw exception
	@Size(min = 2, message="message sud be minimum 2 characters")
	public String message ;
	//public String messageAnother = "another message";




	public HelloBean() {

	}

	// Spring by default constructor with arguments and convert that to JSON

	public HelloBean(String msg){ message = msg; }


	// name of the method can be anything but it must return just return field
	// if we return message+"" then spring will throw error

	public String getMessage() { return message; }

	public void setMessage(String message) {
		this.message = message;

	}

	
	/*
	 * public String getMessageAnother() { return messageAnother; }
	 * 
	 * 
	 * public void setMessageAnother(String messageAnother) { this.messageAnother =
	 * messageAnother; }
	 */
}
