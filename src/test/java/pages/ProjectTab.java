package pages;


import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.Approval_Locators;
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

	
	public void SelectProjectTabHr() {
		interactions.clickElement(Project_Locators.Projecttabhr);
	}
	public void SelectProjectTabEditor() {
		interactions.clickElement(Project_Locators.ProjectTabBtn_Editor);
	}

	public String dynamicProjectName() {  
		Random random = new Random();
        int randomNumber = 10 + random.nextInt(90); 
        String projectName = "projectName" + randomNumber;
        return projectName;
    }
		public void selectClientDropdown() {
			interactions.click(Project_Locators.SelectClient_Editor);

		}

	public void dynamicClientSelection(String clientName) throws InterruptedException {
		//interactions.clickElement(Project_Locators.AddProjectButton);
		//interactions.clickElement(Project_Locators.SelectClient);
	     Thread.sleep(3000);
			String clientNamePath = "//span[contains(text(),'"+clientName+"')]/ancestor::li";
			interactions.click(By.xpath(clientNamePath));
		}
	public void addprojectbtn() {
		interactions.clickElement(Project_Locators.AddProjectButton_Editor);
	}

	public void addProject(String projectName, String notes, String description) {

		interactions.sendingKeys(Project_Locators.ProjectNameInputText_Editor, projectName);
		interactions.sendingKeys(Project_Locators.NotesInputText_Editor, notes);
		interactions.sendingKeys(Project_Locators.DescriptionInputText_Editor, description);
		interactions.clickElement(Project_Locators.SaveProjectBtn_Editor);
	}

	
	public void SearchProjectByNames(String ProjectName)  {
		interactions.sendingKeys(Project_Locators.searchInputSelector_Editor_Hr, ProjectName);
		interactions.clickElement(Project_Locators.clearButtonSelector_Editor_Hr);

	}


	public void SearchProject(String ProjectName)  {

		interactions.sendingKeys(Project_Locators.searchInputSelector_Editor_Hr, ProjectName);
	
	}

	public void RefreshProject(String ProjectName) {
		interactions.sendingKeys(Project_Locators.searchInputSelector_Editor_Hr, ProjectName);
		interactions.clickElement(Project_Locators.clearButtonSelector_Editor_Hr);
	}

	public void selectProject() throws InterruptedException {
		Thread.sleep(2000);
//		String Path = "//div[contains(text(), '"+ projectName+"')]";
//		//interactions.click(Project_Locators.SelectProject1);
//		interactions.click(By.xpath(Path));
		  Thread.sleep(3000);
			interactions.clickElement(Project_Locators.SelectProject1_Editor);

	}
	public void selectEditBtn() throws InterruptedException {
		
		
			interactions.clickElement(Project_Locators.SelectPencil_Editor);

	}
	
	public void editClientunderProject() {
		interactions.clickElement(Project_Locators.editClient_Editor);

	}
	public void EditProjectDetails(String projectDescription, String projectNotes) throws InterruptedException {
		
		// interactions.enterText(EditSelectProjectName, projectName);
		interactions.sendingKeys(Project_Locators.EditProjectDescription, projectDescription);
		//dynamicClientSelection("Alpha");
		interactions.sendingKeys(Project_Locators.EditPojectNotes, projectNotes);
		interactions.clickElement(Project_Locators.SaveEditProject);
	}

	
	public void DeleteProject() throws InterruptedException {
		Thread.sleep(2000);
		interactions.clickElement(Project_Locators.SelectDeleteProjectBtn);
		//interactions.click(Project_Locators.ConfirmYesBtn);
		//ineractions.click(NoDeleteProjectBtn);
	}

	public void dynamicChargeCodeSelection(String chargecode) throws InterruptedException {
		Thread.sleep(2000);
		interactions.click(Project_Locators.SelectChargeCodeBtn);
		interactions.click(Project_Locators.SelectChargeType);

			String codetypePath = "//span[contains(text(), '"+chargecode+"')]/ancestor::li";
			interactions.click(By.xpath(codetypePath));
		}
	
	public void dynamicActivityTypeSelection(String activityType) throws InterruptedException {
		Thread.sleep(2000);
		
		interactions.click(Project_Locators.SelectActivityType);
			String codetypePath = "//span[contains(text(), '"+activityType+"')]";
			interactions.click(By.xpath(codetypePath));
		}
	
	public void dynamicTaskSelection(String task) throws InterruptedException {
		Thread.sleep(2000);
		
		interactions.click(Project_Locators.SelectTask);
			String codetypePath = "//span[contains(text(), '"+task+"')]";
			interactions.click(By.xpath(codetypePath));
		}
	
	public void AddChargeCode(String notes, String description) {
		
		interactions.sendingKeys(Project_Locators.Notes, notes);
		interactions.sendingKeys(Project_Locators.Description, description);
		//interactions.clickElement(Project_Locators.ClickSaveBtn);
	}

//	public void Activeclientvisibility() {
//		interactions.clickElement(Project_Locators.AddProjectButton_Editor);
//		interactions.clickElement(Project_Locators.SelectClient_Editor);
//		    String clientListPath = "//ul[@role='listbox']";
//		    List<WebElement> divElements = interactions.getDriver().findElements(By.xpath(clientListPath));
//		    int totalDivs = divElements.size();
//		    for (int i = 0; i < totalDivs; i++) {
//		        WebElement element = divElements.get(i);
//		        System.out.println("Div Text: " + element.getText()); 
//		    }
//
//		}
}