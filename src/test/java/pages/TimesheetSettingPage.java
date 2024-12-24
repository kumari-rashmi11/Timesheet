package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.TimesheetSettingLocators;

public class TimesheetSettingPage {

	WebDriver driver;
	WebDriverWait wait;
	TimesheetSettingLocators locators;
	Interactions interact;
    
 // Constructor to initialize WebDriverWait
    public TimesheetSettingPage(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.interact = new Interactions(driver);
        this.locators = new TimesheetSettingLocators();
    }
    
 // Method to click on the Timesheet Setting tab
    public void clickTimesheetSetting_RL() {
    	interact.clickElement(locators.timesheetSettingTab_RL); 	
    }
    
    public void clickTimesheetSetting_Editor() {
    	interact.clickElement(locators.timesheetSettingTab_Editor); 	
    }
    
    public void clickTimesheetSetting_PL() {
    	interact.clickElement(locators.timesheetSettingTab_PL); 	
    }
    
    public void clickTimesheetSetting_Viewer() {
    	interact.clickElement(locators.timesheetSettingTab_Viewer); 	
    }
    
    public void clickTimesheetSetting_HR() {
    	interact.clickElement(locators.timesheetSettingTab_HR); 	
    }

    public String isTimesheetSettingPage() {
    	return interact.getInnerText(locators.TimesheetSettingPageTitle);
    }
    
    public String isAddEmployeePage() {
    	return interact.getInnerText(locators.isAddEmployeePage);
    }
    
 // Method to view an employee
    public void selectEmployee() {
    	interact.clickElement(locators.employeeSelect);
    }
    
 // Method to re-click the Timesheet Setting tab
    public void ReclickTimesheetSetting() {
    	interact.clickElement(locators.ReclicktimesheetSettingTab);   	
}
    
 // Method to add an employee
    public void addEmployees() {
    	interact.clickElement(locators.addEmployee);
    }
    
 // Method to enter and select an employee name
    public void employeeName() {
    	interact.clickElement(locators.enterName); // Clicks to enter employee name
    	interact.clickElement(locators.selectName); // Selects the employee name from the list
    }
    
 // Method to select the client type
    public void selectClientType() {
    	interact.clickElement(locators.clientType); // Clicks to select client type
    	interact.clickElement(locators.clientcategory); // Selects the client category
    }
    
    public void addNotes() {    	
    	interact.sendingKeys(locators.giveNotes, "Testing...");
    }
    
    
 // Method to select location
    public void location() {
    	interact.clickElement(locators.Selectlocation);; // Clicks to select location div 
    	interact.clickElement(locators.chooseLocation);; // Chooses the location
    }
    
    public void CancelOp() {
    	interact.clickElement(locators.cancelButton);// Clicks the save button
    } 
    
 // Method to save the information
    public void SaveInfo() {
    	interact.clickElement(locators.saveBtn); // Clicks the save button
    }    
    
    
    public void newEmployee() {
    	interact.clickElement(locators.selectNewEmployee);
    }
    
    public void editNewEmployeeBtn() {
    	interact.clickElement(locators.editNewEmployeeBtn);
    }
    
    public void editNewEmployeeLocation() {
    	interact.clickElement(locators.selectNewEmployeeLocation);// Clicks to select location div 
    }
    
    public void selectEditedLocation() {
    	interact.clickElement(locators.chooseEditedLocation);
    }
    
    public void deleteNewEmployee() {
    	interact.clickElement(locators.deleteEmployee);
//    	interact.clickElement(locators.confirmEmploye);
    }
    
    public void searchEmployee() {
    	interact.sendingKeys(locators.searchBox, "Kaushik");
    }
    
    public void searchClient() {
    	interact.sendingKeys(locators.searchBox, "Bullet");
    }
    
    public void refreshEmployeelist() {
    	interact.clickElement(locators.refreshBtn);
    }
     
}
