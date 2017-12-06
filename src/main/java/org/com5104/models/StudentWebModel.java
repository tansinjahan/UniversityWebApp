package org.com5104.models;

public class StudentWebModel {
	private String studentName;
	private Integer studentNumber;
	private String studentStatus;
	private String email;
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
