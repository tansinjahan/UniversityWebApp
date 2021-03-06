package org.com5104.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentWebModel {
	private String studentName;
	private int studentNumber;
	private String studentStatus;
	@NotEmpty(message = "Please enter your email.")
    @Email(message = "Not a valid email")
	private String email;
	@NotEmpty(message = "Please enter your password.")
	private String password;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getstudentStatus() {
		return studentStatus;
	}

	public void setstudentStatus(String status) {
		this.studentStatus = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
