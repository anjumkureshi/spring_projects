package com.ir.dto;

import java.sql.Date;

public class ManagementRequest 
{
	private String fullname;

	private String address;

	private String gender;

	private String mobile;

	private String dob;
	
	private String email;

	private String username;

	private String password;
	
  //  @Column(columnDefinition = "varchar(255) default 'defaultValue'")
	private String division;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public ManagementRequest(String fullname, String address, String gender, String mobile, String dob, String email,
			String username, String password, String division) {
		super();
		this.fullname = fullname;
		this.address = address;
		this.gender = gender;
		this.mobile = mobile;
		this.dob = dob;
		this.email = email;
		this.username = username;
		this.password = password;
		this.division=division;
	}

	public ManagementRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


}
