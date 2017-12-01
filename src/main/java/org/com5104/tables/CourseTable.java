package org.com5104.tables;

import java.util.ArrayList;
import java.util.List;

import org.com5104.models.Course;
import org.com5104.models.University;

public class CourseTable {

	private static final CourseTable INSTANCE = new CourseTable();

	private List<Course> courses = new ArrayList<>();

	private CourseTable() {}

	public static CourseTable getInstance() {
		return INSTANCE;
	}

	public void add(Course course) {
		courses.add(course);
	}

	public List<Course> getCourses(List<Integer> courseIds) {
		List<Course> res = new ArrayList<>();
		for (int id : courseIds) {
			for (Course c : courses) {
				if (c.getCode() == id) {
					res.add(c);
				}
			}
		}
		return res;
	}

	public Course findCourseByCode(int code) {
		for (Course c : courses) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public void clear(){
		courses.clear();
	}

	public static void createFakeCourse() {
		University.getInstance().createCourse("clerk", "Data Science", 112233, 27, true, 2, 2, false, true);	
		University.getInstance().createCourse("clerk", "Data Structure", 343434, 27, true, 2, 2, false, true);
		University.getInstance().createCourse("clerk", "Software Engineering", 223344, 26, true, 2, 2, true, false);
		University.getInstance().createCourse("clerk", "Machine Learning", 334455, 28, false, 2, 2, true, true);
		University.getInstance().createCourse("clerk", "Digital Electronics", 445566, 30, true, 2, 2, false, false);
	}
	
	public List<Course> getCourses() {
		return courses;
	}
}