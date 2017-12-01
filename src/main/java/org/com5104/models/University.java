package org.com5104.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.com5104.tables.CourseTable;
import org.com5104.tables.StudentTable;
import org.com5104.utilities.Trace;


public class University implements TermEventListener{
		
		private List<Course> courses=new ArrayList<>();
		
		
		private static final University INSTANCE = new University();
		private Logger logger = Trace.getInstance().getLogger(this);
		
		private TermState termState = TermState.NONE;
		
		private int universityCourseCount = 25; // Default course count 25
		private int passRate = 70; // Default pass rate is 70
		
//		public Course createCourse(
//							String user, 
//							String title, 
//							int code, 
//							int capsize, 
//							boolean hasAFinal, 
//							int numberOfAssignments, 
//							int numberOfMidTerms, 
//							boolean enforcePrereqs, 
//							boolean isProjectCourse) {
//			
//				if (termState != TermState.CREATE_STUDENT_COURSE_STATE || termState == TermState.COURSE_REGISTRATION_STATE) {
//							String errMsg = "Course cannot be created because course creation period is over";
//							throw new IllegalStateException(errMsg);
//						}
//			
//				if (hasCourseExists(code)) {
//							String errMsg = String.format("Course with code %d already exists", code);
//							throw new IllegalArgumentException(errMsg);
//						}
//				CourseInteractor interactor = new CourseInteractor(this);
//				Course course = interactor.createCourse(user, title, code, capsize, hasAFinal, numberOfAssignments, numberOfMidTerms, enforcePrereqs, isProjectCourse);
//				CourseTable.getInstance().add(course);
//				logger.info(String.format("Course is created by clerk and added into course table"));
//				return course;
//		}
		
		
		public enum TermState {
			 		NONE,
			 		CREATE_STUDENT_COURSE_STATE,
			 		COURSE_REGISTRATION_STATE,
			 		TERM_PROPERLY_STARTED_STATE,
			 		TWO_WEEK_PASSED_AFTER_TERM_STARTED_STATE,
			 		TERM_END_STATE
			 	}
		
		public TermState getTermState() {
			 		return termState;
			 	}
		
		@Override
		public void onTwoWeekPassedTillTermStarted() {
				termState = TermState.TWO_WEEK_PASSED_AFTER_TERM_STARTED_STATE;
				System.out.println(termState.name());
		}
			 
		@Override
		public void onCreate() {
			 	termState = TermState.CREATE_STUDENT_COURSE_STATE;
			 	System.out.println(termState.name());
		}
			 
		@Override
		public void onRegistrationPossible() {
			 	termState = TermState.COURSE_REGISTRATION_STATE;
			 	System.out.println(termState.name());
		}
			 
		@Override
		public void onTermProperlyStarted() {
				termState = TermState.TERM_PROPERLY_STARTED_STATE;
				System.out.println(termState.name());
		}
			 
		@Override
		public void onTermEnded() {
			 	termState = TermState.TERM_END_STATE;
			 	System.out.println(termState.name());
			 	
		}
			 
		public String getName() {
			return "Carleton";
		}
		
//		public boolean hasCourseExists(int code) {
//			for (Course c : CourseTable.getInstance().courses) {
//				if(c.getCode()== code) {
//					return true;
//				}
//			}
//			return false;
//		}
		
//		public List<Course> courses() {
//					return CourseTable.getInstance().courses;
//		}
		
//		public Student createStudent(String name, int studentNumber, String status){
//			return createStudent(name, studentNumber, "", "", status);
//		}
		
//		public Student createStudent(String name, int studentNumber, String email,String password,String status) {
//			if (termState != TermState.CREATE_STUDENT_COURSE_STATE || termState == TermState.COURSE_REGISTRATION_STATE) {
//							String errMsg = "Student cannot be created because student creation period is over";
//							throw new IllegalStateException(errMsg);
//						}
//			if (studentExist(studentNumber)) {
//							String errMsg = String.format("Student with student_number %d already exists", studentNumber);
//							throw new IllegalArgumentException(errMsg);
//						}
//			Student student = new Student(name, studentNumber, status);
//			student.setEmail(email);
//			student.setPassword(password);
//			StudentTable.getInstance().add(student);
//			logger.info(String.format("Student is created by clerk and added into student table"));
//			return student;
//		}
		
//		public List<Student> students() {
//					return StudentTable.getInstance().students;
//		}
		
		public static University getInstance() {
			return INSTANCE;
		}
		
		public void registerStudentForCourse(Student student, Course course) {
			if (termState != TermState.COURSE_REGISTRATION_STATE) {
							String errMsg = "Time for course registration in this term has been passed or not yet been started";
							throw new IllegalStateException(errMsg);
						}		
			
			try {
						student.registerCourse(course);
						course.addStudent(student);
					} catch (Exception e) {
						logger.info(e.getMessage());
						throw e;
					}
		}
		
		public void universityCourseCount(int count) {
					if (count < 1 || count > 25) {
						String errMsg = "University course count must be between 1 and 25";
						throw new IllegalArgumentException(errMsg);
					}
					this.universityCourseCount = count;
		}
			
		public int getUniversityCourseCount() {
					return universityCourseCount;
		}
			
		public void passRate(int passRate) {
					if (passRate < 0 || passRate > 100) {
						String errMsg = "Pass rate must be between 0 and 100";
						throw new IllegalArgumentException(errMsg);
					}
					this.passRate = passRate;
		}
				
		public int getPassRate() {
					return passRate;
		}
		
//		public boolean studentExist(int studentNumber) {
//					for (Student s : StudentTable.getInstance().students) {
//						if (s.getStudentNumber() == studentNumber) {
//							return true;
//						}
//					}
//					return false;
//		}
		
		public void selectCourseForStudent(Student student, Course course) {
					student.selectCourse(course);
		}
		
//		public void cancelCourse(Course course) {
//			if(termState == TermState.CREATE_STUDENT_COURSE_STATE) {	
//				List<Student> students = students();
//			 
//				for (Student s : students) {
//					s.currentCourses().remove(course);
//					s.selectedCourses().remove(course);
//				}
//				course.students().clear();
//				logger.info(String.format("Course has been canceled by clerk and removed from the course table"));
//			}
//			else {
//				throw new IllegalStateException();
//			}
//		}
		
//		public void destroyCourse(Course course) {
//			List<Student> students = course.students();
//			 
//			for (Student s : students) {
//				s.currentCourses().remove(course);
//				s.selectedCourses().remove(course);
//			}
//			course.students().clear();
//					CourseTable.getInstance().courses.remove(course);
//		}
		
		public boolean deregisterCourse(Course course, Student student) {
					if (termState == TermState.TERM_PROPERLY_STARTED_STATE) {
						return student.deRegisterCourse(course);
					} else {
						String errMsg = "Course can be deregistered upto two weeks after term has started properly";
						throw new IllegalStateException(errMsg);
					}
		}
		
//		public void deleteStudent(Student student) {
//			if(termState == TermState.CREATE_STUDENT_COURSE_STATE) {	
//				StudentTable.getInstance().students.remove(student);
//					
//					List<Course> courses = new ArrayList<>();
//					courses.addAll(student.currentCourses());
//					courses.addAll(student.selectedCourses());
//					
//					for (Course c : courses) {
//						c.students().remove(student);
//					}
//					logger.info(String.format("Student has been deleted by clerk and removed from the student list"));
//			}
//			else {
//				throw new IllegalStateException("Too late to delete student");
//			}
//		}
		
		public void submitAssignMark(Course course, Student student) {
			if (course == null || student == null) {
				throw new IllegalArgumentException("Course or student is not found");
			}
			try {
				course.submitAssignmentMarkForStudent(student);
			} catch (Exception ex) {
				throw new IllegalStateException(ex.getMessage());
			}
		}
		
		public void submitMidMark(Course course, Student student) {
			if (course == null || student == null) {
				throw new IllegalArgumentException("Course or student is not found");
			}
			try {
				course.submitMidtermMarkForStudent(student);
			} catch (Exception ex) {
				throw new IllegalStateException(ex.getMessage());
			}
		}
		
		public void submitProjectMark(Course course, Student student) {
			if (course == null || student == null) {
				throw new IllegalArgumentException("Course or student is not found");
			}
			try {
				((ProjectCourse) course).submitProjectMarkForStudent(student);
			} catch (Exception ex) {
				throw new IllegalStateException(ex.getMessage());
			}
		}
		
		public void submitFinalMark(Course course, Student student) {
			if (course == null || student == null) {
				throw new IllegalArgumentException("Course or student is not found");
			}
			try {
				course.submitFinalMarkForStudent(student);
			} catch (Exception ex) {
				throw new IllegalStateException(ex.getMessage());
			}
		}
		
		public void obtainMark(Course course, Student student) {
			if (course == null || student == null) {
				throw new IllegalArgumentException("Course or student is not found");
			}
			try {
				course.markForStudent(student);
			} catch (Exception ex) {
				throw new IllegalStateException(ex.getMessage());
			}
		}
		
		public boolean dropCourse(Student student, Course course) {
					if (termState != TermState.TWO_WEEK_PASSED_AFTER_TERM_STARTED_STATE) {
						String errMsg = "Cannot drop a course before two weeks has been passed since term started properly";
						throw new IllegalStateException(errMsg);
					}
					return student.dropCourse(course);
		}
}
