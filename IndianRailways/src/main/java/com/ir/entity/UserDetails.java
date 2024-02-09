package com.ir.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IndianRailways_IR")
public class UserDetails {
	@Column(length = 40)
	private String fullname;

	@Column(length = 40)
	private String address;

	@Column(length = 10)
	private String gender;

	@Column(length = 10)
	private String mobile;

	@Column(length = 10)
	private String dob;

	@Id
	@Column(length = 40)
	private String email;

	@Column(length = 20, unique = true, nullable = false)
	private String username;

	@Column(length = 20)
	private String password;
	

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String fullname, String address, String gender, String mobile, String dob, String email,
			String username, String password) {
		super();
		this.fullname = fullname;
		this.address = address;
		this.gender = gender;
		this.mobile = mobile;
		this.dob = dob;
		this.email = email;
		this.username = username;
		this.password = password;
	}

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
    
	

	
}
