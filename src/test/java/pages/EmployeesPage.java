package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    
    public void clickEmployeesTab_Viewer() {
    	interact.clickElement(locators.employeesTab_Viewer);
    }
    
    public void clickEmployeesTab_HR() {
    	interact.clickElement(locators.employeesTab_HR);
    }
    
    public void clickEmployeesTab_PL() {
    	interact.clickElement(locators.employeesTab_PL);
    }
    
    public void clickEmployeesTab_Editor() {
    	interact.clickElement(locators.employeesTab_Edtior);
    }
    
    public void employeeDetails() {
    	interact.clickElement(locators.employeeClick);
    }
    
    public void clickpencilIcon() {
    	interact.clickElement(locators.pencilIcon);
    }
    
    public void employeeDetails_PL() {
    	interact.clickElement(locators.employeeClick_PL);
    }
    
    public void searchOperation() {
    	interact.sendingKeys(locators.search_Box, "Aarav");
    }
    
    public void clickRefreshBtn() {
    	interact.clickElement(locators.refreshIcon);
    }
    
    public void activeEmployees() {
    	for(int i = 1; i <= 5; i++) {
    		
    		String employeeLocator = String.format("div:nth-of-type(%d) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon", i);
    		
    		WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(employeeLocator)));
    		interact.clickElement(elements);
    		if(interact.getInnerText(locators.currentStatus).equals("Active")) {
    			System.out.println("Verification successful");
    		}
    		interact.clickElement(locators.employeesTabAfterActiveEmployeeClick);
    	}
    }
    
    public void activeEmployees_PL() {
    	for(int i = 1; i <= 2; i++) {
    		
    		String employeeLocator = String.format("div:nth-of-type(%d) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon", i);
    		
    		WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(employeeLocator)));
    		interact.clickElement(elements);
    		if(interact.getInnerText(locators.currentStatus).equals("Active")) {
    			System.out.println("Verification successful");
    		}
    		interact.clickElement(locators.employeesTabAfterActiveEmployeeClick);
    	}
    }
    
    public void inactiveEmployees() {
    	
    	interact.clickElement(locators.inactiveTab);
    	
    	for(int i = 1; i <= 5; i++) {
    		
    		String employeeLocator = String.format("div:nth-of-type(%d) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon", i);
    		
    		WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(employeeLocator)));
    		interact.clickElement(elements);
    		if(interact.getInnerText(locators.currentStatus).equals("Inactive")) {
    			System.out.println("Verification successful");
    		}
    		interact.clickElement(locators.employeesTabAfterInactiveEmployeeClick);
    	}
    }
    
    public void relievedEmployees() {
    	
    	interact.clickElement(locators.relievedTab);
    	
    	for(int i = 1; i <= 5; i++) {
    		
    		String employeeLocator = String.format("div:nth-of-type(%d) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(2) .powerapps-icon", i);
    		
    		WebElement elements = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(employeeLocator)));
    		interact.clickElement(elements);
    		if(interact.getInnerText(locators.currentStatus).equals("Relieved")) {
    			System.out.println("Verification successful");
    		}
    		interact.clickElement(locators.employeesTabAfterRelievedEmployeeClick);
    	}
    }
    
    public void clickInactiveTab() {
    	interact.clickElement(locators.inactiveTab);
    }
    
    public void clickRelievedTab() {
    	interact.clickElement(locators.relievedTab);
    }
    
    public void clickEyeIcon() {
    	interact.clickElement(locators.eyeIcon);
    }
    
    public void clickEyeIconEditor() {
    	interact.clickElement(locators.eyeIcon_Editor);
    }
    
    public String verifyLeadName() {
    	return interact.getInnerText(locators.leadName);
    }
    
    public String verifyLeadName_PL() {
    	return interact.getInnerText(locators.leadName_PL);
    }
    
    public String verifyEffectiveFrom() {
    	return interact.getInnerText(locators.effectiveFrom);
    }
    
    public String verifyEffectiveFrom_PL() {
    	return interact.getInnerText(locators.effectiveFrom_PL);
    }
    
    public String verifyEndDate() {
    	return interact.getInnerText(locators.endDate);
    }
    
    public String verifyEndDate_PL() {
    	return interact.getInnerText(locators.endDate_PL);
    }
    
    public String verifyRequestedBy() {
    	return interact.getInnerText(locators.requestedBy);
    }
    
    public String verifyRequestedBy_PL() {
    	return interact.getInnerText(locators.requestedBy_PL);
    }
    
    public String verifypastAndPresentInfo() {
    	return interact.getInnerText(locators.pastAndPresentInfo);
    }
    
    public String verifypastAndPresentInfo_PL() {
    	return interact.getInnerText(locators.pastAndPresentInfo_PL);
    }
    
    public void clickCloseBtn() {
    	interact.clickElement(locators.closeBtn);
    }
    
    public void clickAddBtn() {
    	interact.clickElement(locators.addBtn);
    }
    
    public void firstName() {
    	interact.sendingKeys(locators.firstName, "Dummy");
    }
    
    public void lastName() {
    	interact.sendingKeys(locators.lastName, "User");
    }
    
    public void empNo() {
    	interact.sendingKeys(locators.employeeNumber, "1590");
    }
    
    public void emailInput() {
    	interact.sendingKeys(locators.emailInput, "dummyUser@pursuitsoftware.biz");
    }
    
    public void clickLeadMenu() {
    	interact.clickElement(locators.leadMenu);
    }
    
    public void clickChooseLead() {
    	WebElement leadMenu = wait.until(ExpectedConditions.elementToBeClickable(locators.leadMenu));
    	leadMenu.sendKeys("test user");
    	leadMenu.sendKeys(Keys.ENTER);
    }
    
    public void clickAddEmployee() {
    	interact.clickElement(locators.addEmployeeBtn);
    }
    
    public void clickmodifyIcon() {
    	interact.clickElement(locators.modifyIcon_activeEmployee);
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
    	
    	interact.sendingKeys(locators.effectiveFrom_Editor, formattedDate);
    	interact.sendingKeys(locators.effectiveDate, formattedDate);
    }
    
    public void clickleadDropdown_Editor() {
    	interact.clickElement(locators.leadDropdown);
    }
    
    public void clickChooseLead_Editor() {
    	WebElement leadMenu = wait.until(ExpectedConditions.elementToBeClickable(locators.leadDropdown));
    	leadMenu.sendKeys("a test kim");
    	leadMenu.sendKeys(Keys.ENTER);
    }
    
    public void enterEffectiveFrom() {
    	
    	WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFrom_Editor));
    	
    	String getEffectiveDate = getInnerText.getText();
    	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
    	
    	if(getEffectiveDate.isEmpty()) {
    		getEffectiveDate = dateFormat.format(new Date());
    	}
    	
    	try {
    		Date parsedDate = dateFormat.parse(getEffectiveDate);
    		Calendar calendar = Calendar.getInstance();
        	calendar.setTime(parsedDate);
        	calendar.add(Calendar.DAY_OF_MONTH, 0);

        	Date futureDate = calendar.getTime();
        	String formattedDate = dateFormat.format(futureDate);
        	
        	interact.sendingKeys(locators.effectiveFrom_Editor, formattedDate);
    	} catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void enterFutureEffectiveFrom() {
    	
    	WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFrom_Editor));
    	
    	String getEffectiveDate = getInnerText.getText();
    	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
    	
    	if(getEffectiveDate.isEmpty()) {
    		getEffectiveDate = dateFormat.format(new Date());
    	}
    	
    	try {
    		Date parsedDate = dateFormat.parse(getEffectiveDate);
    		Calendar calendar = Calendar.getInstance();
        	calendar.setTime(parsedDate);
        	calendar.add(Calendar.DAY_OF_MONTH, 10);

        	Date futureDate = calendar.getTime();
        	String formattedDate = dateFormat.format(futureDate);
        	
        	interact.sendingKeys(locators.effectiveFrom_Editor, formattedDate);
    	} catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
public void enterPastEffectiveFrom() {
    	
	WebElement getInnerText = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.effectiveFrom_Editor));
	
	String getEffectiveDate = getInnerText.getText();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	if(getEffectiveDate.isEmpty()) {
		getEffectiveDate = dateFormat.format(new Date());
	}
	
	try {
		Date parsedDate = dateFormat.parse(getEffectiveDate);
		Calendar calendar = Calendar.getInstance();
    	calendar.setTime(parsedDate);
    	calendar.add(Calendar.DAY_OF_MONTH, -10);

    	Date futureDate = calendar.getTime();
    	String formattedDate = dateFormat.format(futureDate);
    	
    	interact.sendingKeys(locators.effectiveFrom_Editor, formattedDate);
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
    
    public void selectReasonDropdown_Editor() {
    	interact.clickElement(locators.selectReasonDropdown_Editor);
    }
    
    public void enterReasonDropdown_Editor() {
    	interact.sendingKeys(locators.selectReasonDropdown_Editor, "Person on sick leave");
    }
    
}
