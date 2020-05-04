package org.studyeasy.spring.model;

import org.hibernate.validator.constraints.Email;


public class User {
	private int userID;
	private String name;
	@SuppressWarnings("deprecation")
	@Email
	private String email;
	private String password;
	
	

	public User() {
		super();
		
	}

	public User(int userID, String name, String email) {
		
		this.userID = userID;
		this.name = name;
		this.email = email;
	
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", email=" + email + "]";
	}
	
}
