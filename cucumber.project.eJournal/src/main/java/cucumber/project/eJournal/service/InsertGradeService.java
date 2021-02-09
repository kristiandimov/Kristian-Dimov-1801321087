package cucumber.project.eJournal.service;

import java.util.ArrayList;
import java.util.List;

import cucumber.project.eJournal.Student;

public class InsertGradeService {

	public static String insert(String name, String grade) {
		
		if(name.isEmpty()) {
			return "No student name";
		}
		if(grade.isEmpty()) {
			return "No student rating";
		}
		int gradeNum = Integer.parseInt(grade);
		if(gradeNum > 6) {
			return "Not valid grade.Need to be under or equal to 6 and bigger or equal than 2 ";
		}
		if(gradeNum < 2) {
			return "Not valid grade.Need to be under or equal to 6 and bigger or equal than 2 ";
		}
		
		List<Student> studentList = getStudent();
		boolean checkStudent = studentList.stream().anyMatch(student -> student.getName().equals(name));
		
		if(checkStudent)
			return "Success";
		
		return null;
	}
	
	public static List<Student> getStudent(){
		Student student = new Student();
		student.setName("Ivan");
		List<Student> studentList = new ArrayList<>();
		studentList.add(student);
		return studentList;
		
	}

}
