package org.com5104.models;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentWebModel {
	private String studentName;
	@NotNull(message = "Please enter student number")
	private Integer studentNumber;
	private String studentStatus;
	@NotEmpty(message = "Please enter student email.")
	@Email(message = "Not a valid email")
	private String email;
	@NotEmpty(message = "Please enter student password.")
	private String password;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
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
