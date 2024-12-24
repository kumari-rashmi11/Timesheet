package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.Project_Locators;

public class ProjectTab {

	public WebDriver driver;
	public WebDriverWait wait;
	public Interactions interactions;
	public Actions action;

	public ProjectTab(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.interactions = new Interactions(driver);
		this.action = new Actions(driver);
	}

	// selectprojecttab hr
	// search project
	public void SelectProjectTabHr() {
		interactions.clickElement(Project_Locators.Projecttabhr);
	}

	// Add project
	public void addProject(String projectName, String notes, String description) throws InterruptedException {
		// interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTabPL());
		// Define the action (click the Add Project Button)
		// Runnable clickAction = () ->
		// interactions.click(Project_Locators.AddProjectButton);

		// Execute the action with an explicit wait (waiting for the element to be ready
		// first)
		// interactions.executeWithDelay(clickAction,
		// Project_Locators.AddProjectButton);
		// interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTabPL());
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);
		interactions.clickElement(Project_Locators.AddProjectButton);
		interactions.sendingKeys(Project_Locators.ProjectNameInputText, projectName);
		interactions.selectFromDropdown(Project_Locators.SelectClient, Project_Locators.clientcategory);
		interactions.sendingKeys(Project_Locators.NotesInputText, notes);
		interactions.sendingKeys(Project_Locators.DescriptionInputText, description);
		interactions.clickElement(Project_Locators.SaveProjectBtn);
	}

	// search project
	public void SearchProjectByNames(String ProjectName) throws InterruptedException {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);

		interactions.sendingKeys(Project_Locators.searchInputSelector, ProjectName);
		interactions.clickElement(Project_Locators.clearButtonSelector);

	}

	// search project hr role
	public void SearchProject(String ProjectName) throws InterruptedException {

		// interactions.click(Project_Locators.ProjectTabBtn_Editor);
		interactions.sendingKeys(Project_Locators.searchInputSelector, ProjectName);
		// interactions.click(Project_Locators.clearButtonSelector);
		System.out.print("Done");
	}

	public void RefreshProject(String ProjectName) throws InterruptedException {
		// interactions.click(Project_Locators.ProjectTabBtn_Editor);
		interactions.sendingKeys(Project_Locators.searchInputSelector, ProjectName);
		interactions.clickElement(Project_Locators.clearButtonSelector);
		System.out.print("Done");
	}

	// edit project
	public void EditProjectDetails(String projectDescription, String projectNotes) {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);

		interactions.clickElement(Project_Locators.SelectProject);
		interactions.clickElement(Project_Locators.SelectPencil);
		// interactions.enterText(EditSelectProjectName, projectName);
		interactions.sendingKeys(Project_Locators.EditProjectDescription, projectDescription);
		interactions.sendingKeys(Project_Locators.EditPojectNotes, projectNotes);
		interactions.clickElement(Project_Locators.SaveEditProject);
	}

	// Delete project

	public void DeleteProject() throws InterruptedException {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);

		interactions.clickElement(Project_Locators.SelectDeleteProject);
		interactions.clickElement(Project_Locators.SelectDeleteProjectBtn);
		// interactions.click(YesDeleteProjectBtn);
		// ineractions.click(NoDeleteProjectBtn);
	}

	// add charge code
	public void AddChargeCode(String notes, String description) {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);

		interactions.clickElement(Project_Locators.SelectchargeProject);
		interactions.clickElement(Project_Locators.SelectChargeCodeBtn);
		interactions.clickElement(Project_Locators.SelectChargeType);
		interactions.clickElement(Project_Locators.ChooseChargeType);
		interactions.clickElement(Project_Locators.SelectActivityType);
		interactions.clickElement(Project_Locators.ChooseActivityType);
		interactions.clickElement(Project_Locators.SelectTask);
		interactions.clickElement(Project_Locators.ChooseTask);
		interactions.sendingKeys(Project_Locators.Notes, notes);
		interactions.sendingKeys(Project_Locators.Description, description);
		interactions.clickElement(Project_Locators.ClickSaveBtn);
	}

	// edit charge code

//public void EditChargeProjectDetails(String projectDescription, String projectNotes) throws InterruptedException {
//    interactions.click(Project_Locators.SelecteditchargeProject);
//    interactions.click(Project_Locators.SelectChargeCode);
//    interactions.click(Project_Locators.SelectPencil);
//    interactions.click(Project_Locators.SelectActivity);
//    interactions.click(Project_Locators.ChooseActivityType);
//    interactions.click(Project_Locators.SelectTask);
//    interactions.click(Project_Locators.ChooseTaskType);
//    interactions.enterText(Project_Locators.SelectDescription,projectDescription);
//    interactions.enterText(Project_Locators.SelectNotes,projectNotes);
//    interactions.click(Project_Locators.SelectSaveBtn);
//    //wait.until(ExpectedConditions.elementToBeClickable(SelectCancelBtn)).click();
//}	
////Delete charge code
//public void DeleteChargeCode() throws InterruptedException {
//    interactions.click(Project_Locators.SelectDeleteChargeProject);  	
//	interactions.click(Project_Locators.SelectDeleteChargeCodeBtn);
//	//interactions.click(Project_Locators.ConfirmYesBtn);
//	// interactions.click(Project.Locators.ConfirmNoBtn);
//}
	public void Activeclientvisibility() throws InterruptedException {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);

		interactions.clickElement(Project_Locators.AddProjectButton);
		interactions.clickElement(Project_Locators.SelectClient);
		// interactions.click(Project_Locators.ConfirmYesBtn);
		// interactions.click(Project.Locators.ConfirmNoBtn);
	}

}
