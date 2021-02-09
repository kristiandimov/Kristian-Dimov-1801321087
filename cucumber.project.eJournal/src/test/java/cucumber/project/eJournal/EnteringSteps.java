package cucumber.project.eJournal;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.project.eJournal.model.ScreenModel;

public class EnteringSteps {

	ScreenModel screenModel = new ScreenModel();
	
	@Given("^Преподавателят стартира началния екран$")
	public void teacherHomeDisplay() throws Throwable {
		screenModel.openScreen();
	}

	@When("^Преподавателя въвежда предмета си$")
	public void teacherSubjectEntering() throws Throwable {
		screenModel.insertSubject();
	}

	@When("^Въвежда име на ученик \"([^\"]*)\"$")
	public void enteringStudentName(String name) throws Throwable {
		screenModel.insertStudentName(name);
	}

	@When("^Въвежда оценка на съответния ученик \"([^\"]*)\"$")
	public void enteringRating(String grade) throws Throwable {
		screenModel.insertGrade(grade);
	}

	@When("^Натиска бутона за добавяне$")
	public void buttonAdd() throws Throwable {
		screenModel.clickAddButton();
	}

	@Then("^Виждаме съобщение \"([^\"]*)\"$")
	public void getMessage(String message) throws Throwable {
		String returnMessage = screenModel.getMessage();
	
		assertEquals(message, returnMessage);
	}

	
}
