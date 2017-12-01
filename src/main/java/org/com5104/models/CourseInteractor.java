package org.com5104.models;

import org.apache.log4j.Logger;
import org.com5104.utilities.Trace;


public class CourseInteractor {

	Logger logger = Trace.getInstance().getLogger(this);
	University versity;
	public CourseInteractor(University versity) {
		this.versity=versity;
	}
	public Course createCourse(
			String user,
			String title,
			int code,
			int capsize, 
			boolean hasAFinal, 
			int numberOfAssignments, 
			int numberOfMidTerms, 
			boolean enforcePrereqs,
			boolean isProjectCourse
			) {
		validateCode(code);
		validateGradeElems(hasAFinal, numberOfAssignments, numberOfMidTerms);
		validateGradeElems(hasAFinal, numberOfAssignments, numberOfMidTerms, isProjectCourse);
		validateCapsize(capsize);


		logger.info(String.format("Course is created with title %s and capsize %d", title, capsize));
		Course course = isProjectCourse? new ProjectCourse(title, capsize) : new Course(title, capsize);
		course.setCode(code);
		course.setHasAFinal(hasAFinal);
		course.setNumberOfAssignments(numberOfAssignments);
		course.setNumberOfMidterm(numberOfMidTerms);
		course.setPrerequisites(enforcePrereqs);

		return course;
	}
	private void validateCapsize(int capsize) {

		if (capsize <= 25)
			throw new IllegalArgumentException("capsize must be greater than 25");
		logger.info(String.format("Course is created with valid class size"));
	}
	private void validateCode(int code) {
		String codeStr = String.valueOf(code);
		if (codeStr.startsWith("0") || codeStr.length() != 6)
			throw new IllegalArgumentException("Code must be of length 6 and first digit cannot be zero");
		logger.info(String.format("Course is created with valid code"));
	}

	private void validateGradeElems(boolean hasAFinal, int numberOfAssignments, int numberOfMidTerms) {
		if (!hasAFinal && numberOfAssignments == 0 && numberOfMidTerms == 0)
			throw new IllegalArgumentException("There must be one grade element");
		else if(numberOfAssignments > 5 || numberOfMidTerms > 2)
			throw new IllegalArgumentException("Number of assignments or midterm exceeds");

		logger.info(String.format("Course is created with valid grade elements"));
	}

	private void validateGradeElems(boolean hasAFinal, int numberOfAssignments, int numberOfMidTerms, boolean isProjectCourse) {
		if (!hasAFinal && numberOfAssignments == 0 && numberOfMidTerms == 0 && !isProjectCourse)
			throw new IllegalArgumentException("There must be one grade element");
	}

}
