package com.employeemanagement.model;

public class User {
	
	private String userName;
	private String password;
	private String email;
	private String country;
	private String gender;
	
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", email=" + email + ", country=" + country + ", gender="
				+ gender + "]";
	}
	
	
	
	

}
