package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.TimesheetSettingLocators;

public class TimesheetSettingPage {

	WebDriver driver;
	WebDriverWait wait;
	TimesheetSettingLocators locators;
	Interactions interact;
	WebDriverWait shortwait;

	// Constructor to initialize WebDriverWait
	public TimesheetSettingPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.interact = new Interactions(driver);
		this.locators = new TimesheetSettingLocators();
		this.shortwait = new WebDriverWait(driver, Duration.ofSeconds(2));
	}

	// Method to click on the Timesheet Setting tab
	public void clickTimesheetSetting() {
		interact.clickElement(locators.timesheetSettingTab);
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

	public void sendPeriodStart() {
		interact.sendingKeys(locators.periodStart, "10-Jan-2025");
	}

	public void sendPeriodEnd() {
		interact.sendingKeys(locators.periodEnd, "10-Dec-2025");
	}

	// Method to select location
	public void location() {
		interact.clickElement(locators.Selectlocation);
		
		interact.clickElement(locators.chooseLocation);
}

	public void CancelOp() {
		interact.clickElement(locators.cancelButton);// Clicks the save button
	}

	// Method to save the information
	public void SaveInfo() {
		interact.clickElement(locators.saveBtn); // Clicks the save button
	}

	public void clickNewEmployeeAndEditIcon() {
		WebElement editIcon = null;
		for (int i = 1; i <= 10; i++) {
			try {
				WebElement newEmployee = shortwait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//div[@data-control-name='TSEmployeNavIcon'])['" + i + "']")));
				interact.clickElement(newEmployee);
				try {
					editIcon = shortwait
							.until(ExpectedConditions.visibilityOfElementLocated(locators.editNewEmployeeBtn));
					if (editIcon.isDisplayed()) {
						interact.clickElement(editIcon);
						break;
					}
				} catch (TimeoutException e) {
					interact.clickElement(locators.ReclicktimesheetSettingTab);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}
	
	public void clickNewEmployeeAndDeleteIcon() {
		WebElement editIcon = null;
		for (int i = 1; i <= 10; i++) {
			try {
				WebElement newEmployee = shortwait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//div[@data-control-name='TSEmployeNavIcon'])['" + i + "']")));
				interact.clickElement(newEmployee);
				try {
					editIcon = shortwait
							.until(ExpectedConditions.visibilityOfElementLocated(locators.deleteEmployee));
					if (editIcon.isDisplayed()) {
						interact.clickElement(editIcon);
						interact.clickElement(locators.confirmEmploye);
						break;
					}
				} catch (TimeoutException e) {
					interact.clickElement(locators.ReclicktimesheetSettingTab);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}

	public void newEmployee() {
		interact.clickElement(locators.selectNewEmployee);
	}

	public void editNewEmployeeBtn() {
		interact.clickElement(locators.editNewEmployeeBtn);
	}


	public void deleteNewEmployee() {
		interact.clickElement(locators.deleteEmployee);
	}

	public void searchEmployee() {
		interact.sendingKeys(locators.searchBox, "Rashmi Kumari");
	}

	public void searchClient() {
		interact.sendingKeys(locators.searchBox, "Amazon");
	}

	public void refreshEmployeelist() {
		interact.clickElement(locators.refreshBtn);
	}

}