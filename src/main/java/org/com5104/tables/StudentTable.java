package org.com5104.tables;

import java.util.ArrayList;
import java.util.List;

import org.com5104.models.Student;
import org.com5104.models.University;

public class StudentTable {
	
	private static final StudentTable INSTANCE = new StudentTable();
	
	private List<Student> students = new ArrayList<>();
	
	private StudentTable() {}
	
	public static StudentTable getInstance() {
		return INSTANCE;
	}
	
	public void clear() {
		students.clear();
	}

	public void add(Student student) {
		students.add(student);
	}
	
	public Student findByStudentNumber(int studentNumber) {
				for (Student student : students) {
					if (student.getStudentNumber() == studentNumber) {
						return student;
					}
				}
			return null;
	}
			
	public Student findByEmailPassword(String email, String password) {
				for (Student student : students) {
					if (student.getEmail().equals(email) && student.getPassword().equals(password)) {
						return student;
					}
				}
			return null;
	}
	
	public static void createFakeStudent() {
		 		Student student1 = University.getInstance().createStudent("Jim Gordon", 123123,"Part Time");
		 		student1.setEmail("jim@gotham");
		 		student1.setPassword("12345");
		 		
		 		Student student2 = University.getInstance().createStudent("Lee Thompkins", 231231,"Full time");
		 		student2.setEmail("lee@gotham");
		 		student2.setPassword("12345");
		 	}
	
	public List<Student> getStudents(){
		return students;
	}
}