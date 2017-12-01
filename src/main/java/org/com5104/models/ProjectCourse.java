package org.com5104.models;

import java.util.HashMap;
import java.util.Map;

public class ProjectCourse extends Course {
	
	private int projectWeight;
	Map<Integer, Integer> studentIdVsProjectMark = new HashMap<>();
	
	public ProjectCourse(String title, int capsize){
		super(title,capsize);
	} 
	
	public int weightOfProject() {
				return projectWeight;
	}
		
	public boolean hasProject() {
				return true;
	}
	
	public void submitProjectMarkForStudent(Student student) {
		studentIdVsProjectMark.put(student.getStudentNumber(), randomBetween(5, projectWeight));
	}
	
	@Override
	protected boolean eligibleForFinal(Student student) {
		boolean result = super.eligibleForFinal(student);
		if (!studentIdVsProjectMark.containsKey(student.getStudentNumber())) {
			result = false;
		}
		return result;
	}
	
	@Override
	protected boolean canObtainMarks(Student student) {
		boolean result = super.canObtainMarks(student) && studentIdVsFinalMark.containsKey(student.getStudentNumber());
		return result;
	}
	
	@Override
	public int obtainMark(Student student) {
		int total = super.obtainMark(student);
		total += studentIdVsProjectMark.get(student.getStudentNumber()) != null ? studentIdVsProjectMark.get(student.getStudentNumber()) : 0;
		return total;
	}
	
	@Override
		protected void generateWeight() {
			int remainWeightToAssign = 100;
			if (numberOfAssignments > 0) {
				int gradeElems = numberOfAssignments + numberOfMidterms + (hasAFinal ? 1 : 0) + 1;
				remainWeightToAssign = assignWeight(assignmentWeights, numberOfAssignments, gradeElems, remainWeightToAssign);
			}
			
			if (numberOfMidterms > 0) {
				int gradeElems = numberOfMidterms + (hasAFinal ? 1 : 0) + 1;
				remainWeightToAssign = assignWeight(midTermWeights, numberOfMidterms, gradeElems, remainWeightToAssign);
			}
			
			if (hasAFinal) {
				int gradeElems = (hasAFinal ? 1 : 0) + 1;
				int[] finalArr = new int[1];
				remainWeightToAssign = assignWeight(finalArr, 1, gradeElems, remainWeightToAssign);
				finalWeight = finalArr[0];
			}
			
			projectWeight = remainWeightToAssign;
		}

}
