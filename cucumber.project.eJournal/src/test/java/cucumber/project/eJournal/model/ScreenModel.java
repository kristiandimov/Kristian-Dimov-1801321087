package cucumber.project.eJournal.model;

import cucumber.project.eJournal.service.InsertGradeService;

public class ScreenModel {
	
	

	private String name;
	private String grade;
	private String message;

	public void openScreen() {
		System.out.println("Отваря се екран за въвеждане на оценка");
	}

	public void insertSubject() {
		System.out.println("Преподавателя въвежда предмет");
		
	}

	public void insertStudentName(String name) {
		this.name = name;
		
	}

	public void insertGrade(String grade) {
		this.grade = grade;
		
	}

	public void clickAddButton() {
		
		message = InsertGradeService.insert(name, grade);
	}

	public String getMessage() {
		return message;
	}

}
