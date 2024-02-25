package com.ir.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="IndianRailwaysManagementDetails")

public class ManagementDetails 
{
	@Id
	@Column(length = 40,name="email")
	private String email;

		@Column(length = 40,name="Fullname")
		private String fullname;

		@Column(length = 40,name="Address")
		private String address;

		@Column(length = 10,name="Gender")
		private String gender;

		@Column(length = 10,name="Mobile")
		private String mobile;

		@Column(length = 40,name="DOB")
		private LocalDate dob;
		
		@Column(length = 40, unique = true, nullable = false,name="Username")
		private String username;

		@Column(length = 40,name="Password")
		private String password;
		
		@Column(length=40,name="Division")
	  //  @Column(columnDefinition = "varchar(255) default 'defaultValue'")
		private String division;

		
		public ManagementDetails(String fullname, String address, String gender, String mobile, LocalDate dob,
				String email, String username, String password, String division) {
			this.fullname = fullname;
			this.address = address;
			this.gender = gender;
			this.mobile = mobile;
			this.dob = dob;
			this.email = email;
			this.username = username;
			this.password = password;
			this.division = division;
		}

		public ManagementDetails() {
			super();
			// TODO Auto-generated constructor stub
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

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
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

		@Override
		public String toString() {
			return "ManagementDetails [email=" + email + ", fullname=" + fullname + ", address=" + address + ", gender="
					+ gender + ", mobile=" + mobile + ", dob=" + dob + ", username=" + username + ", password="
					+ password + ", division=" + division + "]";
		}

		
}
