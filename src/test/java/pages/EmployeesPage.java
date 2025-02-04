package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.EmployeesLocators;

public class EmployeesPage {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Interactions interact;
	EmployeesLocators locators;

	public EmployeesPage(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver must be set");
		}
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.locators = new EmployeesLocators();
		this.action = new Actions(driver);
		this.interact = new Interactions(driver);
	}

	public void clickEmployeesTab() {
		interact.clickElement(locators.employeesTab);
	}

	public void getLeadName() {
		String leadName = null;
		WebElement pencilIcon = null;
		for (int i = 1; i < 15; i++) {
			try {

				WebElement leadNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//div[@data-control-name='Label16']//descendant::div[@data-control-part='text'])["
								+ (i + 1) + "]")));

				leadName = leadNameElement.getText();
				interact.sendingKeys(locators.search_Box, leadName);
				interact.clickElement(locators.employeeClick);

				try {
					pencilIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.pencilIcon));
					if (pencilIcon.isDisplayed()) {
						break;
					}

				} catch (TimeoutException e) {
					interact.clickElement(locators.employeesTab_after_Search);
					interact.clickElement(locators.refreshIcon);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}

	public void clickEmployeeAndPencilIcon() {
		WebElement pencilIcon = null;
		for (int i = 0; i < 15; i++) {
			try {
				WebElement leadNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"(//div[@data-control-name='Icon10']//descendant::div[@class='powerapps-icon no-focus-outline'])["
								+ (i + 1) + "]")));
				interact.clickElement(leadNameElement);

				try {
					pencilIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.pencilIcon));
					if (pencilIcon.isDisplayed()) {
						interact.clickElement(locators.pencilIcon);
						break;
					}

				} catch (TimeoutException e) {
					interact.clickElement(locators.employeesTab_after_Search);
				}
			} catch (TimeoutException e) {
				i = i + 0;
			}
		}
	}

	public void selectEmployeeAndPencilIcon() {
		
		// change [1] below if no modify (pencil) icon is found. First verify if modifyIcon is visible for the Lead
		try {
			WebElement leadNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"(//div[@data-control-name='Icon10']//descendant::div[@class='powerapps-icon no-focus-outline'])[1]")));			
			interact.clickElement(leadNameElement);
			interact.clickElement(locators.pencilIcon);
		} catch (TimeoutException e) {
			return;
		}

	}

	public void employeeDetails() {
		interact.clickElement(locators.employeeClick);
	}

	public void clickpencilIcon() {
		interact.clickElement(locators.pencilIcon);
	}

	public void searchOperation(String name) {
		interact.sendingKeys(locators.search_Box, name);
	}
	
	public void searchOperationForLead(String s) {
		interact.sendingKeys(locators.search_Box, s);
	}

	public void clickRefreshBtn() {
		interact.clickElement(locators.refreshIcon);
	}

	public void activeEmployees() {

		for (int i = 1; i <= 1; i++) {

			String employeeLocator = String.format(
					"(//div[@data-control-name='Icon10']//descendant::div[@data-control-part='icon'])[" + i + "]");

			WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(employeeLocator)));
			interact.clickElement(elements);
			if (interact.getInnerText(locators.currentStatus_Active).equals("Active")) {
				System.out.println("Verification successful");
			}
		}
	}

	public void inactiveEmployees() {

		interact.clickElement(locators.inactiveTab);

		for (int i = 1; i <= 1; i++) {

			String employeeLocator = String.format(
					"(//div[@data-control-name='Icon10']//descendant::div[@data-control-part='icon'])[" + i + "]");

			WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(employeeLocator)));
			interact.clickElement(elements);
			if (interact.getInnerText(locators.currentStatus_Inactive).equals("Inactive")) {
				System.out.println("Verification successful");
			}
		}
	}

	public void relievedEmployees() {

		interact.clickElement(locators.relievedTab);

		for (int i = 1; i <= 1; i++) {

			String employeeLocator = String.format(
					"(//div[@data-control-name='Icon10']//descendant::div[@data-control-part='icon'])[" + i + "]");

			WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(employeeLocator)));
			interact.clickElement(elements);
			if (interact.getInnerText(locators.currentStatus_Relieved).equals("Relieved")) {
				System.out.println("Verification successful");
			}
		}
	}

	public void clickInactiveTab() {
		interact.clickElement(locators.inactiveTab);
	}

	public void clickRelievedTab() {
		interact.clickElement(locators.relievedTab);
	}

	public void clickEyeIcon() {
		interact.clickElement(locators.eyeIcon_Editor);
	}

	public String verifyLeadName() {
		return interact.getInnerText(locators.leadName);
	}

	public String verifyEffectiveFrom() {
		return interact.getInnerText(locators.effectiveFrom);
	}

	public String verifyEndDate() {
		return interact.getInnerText(locators.endDate);
	}

	public String verifyRequestedBy() {
		return interact.getInnerText(locators.requestedBy);
	}

	public String verifypastAndPresentInfo() {
		return interact.getInnerText(locators.pastAndPresentInfo);
	}

	public void clickCloseBtn() {
		interact.clickElement(locators.closeBtn);
	}

	public void clickAddBtn() {
		interact.clickElement(locators.addBtn);
	}

	public void firstName(String firstName) {
		interact.sendingKeys(locators.firstName, firstName);
	}

	public void lastName(String lastName) {
		interact.sendingKeys(locators.lastName, lastName);
	}

	public void empNo(String empNo) {
		interact.sendingKeys(locators.employeeNumber, empNo);
	}

	public void emailInput(String email) {
		interact.sendingKeys(locators.emailInput, email);
	}

	public void clickLeadMenu() {
		interact.clickElement(locators.leadMenu);
	}

	public void clickAddEmployee() {
		interact.clickElement(locators.addBtn);
	}

	public void clickPracticeLead() {
		interact.clickElement(locators.PracticeLead);
	}

	public void clickStatusDropDown() {
		interact.clickElement(locators.statusDropDown);
	}

	public void selectRelievedStatus() {
		interact.clickElement(locators.selectRelievedStatus);
	}

	public void clickSaveBtn() {
		interact.clickElement(locators.saveBtn);
	}

	public void effectiveDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		Date date = new Date();
		String formattedDate = dateFormat.format(date);

		interact.sendingKeys(locators.effectiveFromDate, formattedDate);
	}

	public void clickleadDropdown() {
		interact.clickElement(locators.selectLeadDropdown);
	}

	public void clickChooseLead() {
		WebElement leadMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.selectLeadDropdown));
		interact.sendingKeys(locators.selectLeadDropdown, "Anubhav Ganguly");
		leadMenu.clear();
		interact.sendingKeys(locators.selectLeadDropdown, "Anubhav Ganguly");
		leadMenu.sendKeys(Keys.ENTER);
	}

	public void clickSelectLead() {
		WebElement leadMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.selectLeadDropdown));
		interact.sendingKeys(locators.selectLeadDropdown, "Aditya Dubey");
		leadMenu.clear();
		interact.sendingKeys(locators.selectLeadDropdown, "Aditya Dubey");
		leadMenu.sendKeys(Keys.ENTER);
	}

	public void enterEffectiveFrom() {

		WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFromDate));

		String getEffectiveDate = getInnerText.getText();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		if (getEffectiveDate.isEmpty()) {
			getEffectiveDate = dateFormat.format(new Date());
		}

		try {
			Date parsedDate = dateFormat.parse(getEffectiveDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(parsedDate);
			calendar.add(Calendar.DAY_OF_MONTH, 0);

			Date futureDate = calendar.getTime();
			String formattedDate = dateFormat.format(futureDate);

			interact.sendingKeys(locators.effectiveFromDate, formattedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void enterFutureEffectiveFrom() {

		WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFromDate));

		String getEffectiveDate = getInnerText.getText();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		if (getEffectiveDate.isEmpty()) {
			getEffectiveDate = dateFormat.format(new Date());
		}

		try {
			Date parsedDate = dateFormat.parse(getEffectiveDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(parsedDate);
			calendar.add(Calendar.DAY_OF_MONTH, 10);

			Date futureDate = calendar.getTime();
			String formattedDate = dateFormat.format(futureDate);

			interact.sendingKeys(locators.effectiveFromDate, formattedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void enterPastEffectiveFrom() {

		WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFromDate));

		String getEffectiveDate = getInnerText.getText();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		if (getEffectiveDate.isEmpty()) {
			getEffectiveDate = dateFormat.format(new Date());
		}

		try {
			Date parsedDate = dateFormat.parse(getEffectiveDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(parsedDate);
			calendar.add(Calendar.DAY_OF_MONTH, -10);

			Date futureDate = calendar.getTime();
			String formattedDate = dateFormat.format(futureDate);

			interact.sendingKeys(locators.effectiveFromDate, formattedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void selectInActiveStatus() {
		interact.clickElement(locators.selectInActiveStatus);
	}

	public void selectActiveStatus() {
		interact.clickElement(locators.selectActiveStatus);
	}

	public void selectReasonDropdown() {
		interact.clickElement(locators.selectReasonDropdown);
	}

	public void enterReasonDropdown() {

		WebElement selectReasonDropdown_Editor = wait
				.until(ExpectedConditions.elementToBeClickable(locators.selectReasonDropdown));
		interact.sendingKeys(locators.selectReasonDropdown, "Person on sick leave");
		selectReasonDropdown_Editor.sendKeys(Keys.ENTER);
	}

}