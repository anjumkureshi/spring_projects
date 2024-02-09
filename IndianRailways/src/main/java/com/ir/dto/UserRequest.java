package com.ir.dto;


public class UserRequest
{
		private String fullname;

		private String address;

		private String gender;

		private String mobile;

		private String dob;

		private String email;

		private String username;

		private String password;

		

		public UserRequest(String fullname, String address, String gender, String mobile, String dob, String email,
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
		
		public UserRequest() {
			super();
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

		@Override
		public String toString() {
			return "UserRequest [fullname=" + fullname + ", address=" + address + ", gender=" + gender + ", mobile="
					+ mobile + ", dob=" + dob + ", email=" + email + ", username=" + username + ", password=" + password
					+ "]";
		}

//		@Override
//		public String toString() {
//			return "fullname" + fullname;
//		}

	

}
