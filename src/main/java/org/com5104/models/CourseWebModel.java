package org.com5104.models;

import javax.validation.constraints.NotNull;


public class CourseWebModel {
	private String title;
	@NotNull(message = "Please enter course code")
	private Integer code;
	private Integer capacity;
	private Boolean finalExam;
	private Integer assignment;
	private Integer midterm;
	private Boolean prerequisite;
	private Boolean project;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Boolean getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(Boolean finalExam) {
		this.finalExam = finalExam;
	}

	public Integer getAssignment() {
		return assignment;
	}

	public void setAssignment(Integer assignment) {
		this.assignment = assignment;
	}

	public Integer getMidterm() {
		return midterm;
	}

	public void setMidterm(Integer midterm) {
		this.midterm = midterm;
	}

	public Boolean getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(Boolean prerequisite) {
		this.prerequisite = prerequisite;
	}

	public Boolean getProject() {
		return project;
	}

	public void setProject(Boolean project) {
		this.project = project;
	}

}
