package org.com5104.models;

public class CourseWebModel {
	private String title;
	private int code;
	private int capacity;
	private Boolean finalExam;
	private int assignment;
	private int midterm;
	private Boolean prerequisite;
	private Boolean project;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Boolean getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(Boolean finalExam) {
		this.finalExam = finalExam;
	}

	public int getAssignment() {
		return assignment;
	}

	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}

	public int getMidterm() {
		return midterm;
	}

	public void setMidterm(int midterm) {
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
