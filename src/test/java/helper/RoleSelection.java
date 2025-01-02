package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonLocators;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class RoleSelection {
		WebDriver driver;
	    WebDriverWait wait;
	    CommonLocators locator;
	    Interactions interact;
	    
	    public RoleSelection(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        this.locator = new CommonLocators();
	        this.interact = new Interactions(driver);
	    }
	    
	    private boolean elementIsPresent(By locator) {
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
	    }
	    
	    public void timesheetNavigation() throws InterruptedException {
	        this.interact.click(this.locator.teams);

	        if (elementIsPresent(this.locator.timeSheetGeneral)) {
	        	this.interact.click(this.locator.timeSheetGeneral);
	        } else {
	        	this.interact.click(this.locator.timeSheet_QA);
	        	this.interact.click(this.locator.timeSheetGeneral);
	        }
	        this.interact.click(this.locator.timeSheetTab);
	        
	    }
	       
	    public void iframeSwitch1() {
	    	WebElement iframe1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cacheable-iframe:a6b63365-31a4-4f43-92ec-710b71557af9")));
	         driver.switchTo().frame(iframe1);
	    }
	    
	    public void iframeSwitch2() {
	    	WebElement iframe2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fullscreen-app-host")));
	         driver.switchTo().frame(iframe2);
	    }
	    
	    public void ViewerRoleBtn() {
	    	interact.clickElement(locator.ViewerRoleBtn);
	    }
	    
	    public void PLRoleBtn() {
	    	interact.clickElement(locator.PLRoleBtn);
	    }
	    
	    public void selectRLRole() {
	    	interact.clickElement(locator.RLroleBtn);
	    }
	    
	    public void EditorRoleBtn() {
	    	interact.clickElement(locator.EditorRoleBtn);
	    }
	    
	    public void HRRoleBtn() {
	    	interact.clickElement(locator.HRRoleBtn);
	    }
	    
	    public void selectRole(String role) {
	    	if(role == "RL") {
	    		interact.clickElement(locator.RLroleBtn);
	    	}
	    	else if(role == "Editor") {
	    		interact.clickElement(locator.EditorRoleBtn);
	    	} else if(role == "PL") {
	    		interact.clickElement(locator.PLRoleBtn);
	    	} else if(role == "Viewer") {
	    		interact.clickElement(locator.ViewerRoleBtn);
	    	} else if(role == "HR") {
	    		interact.clickElement(locator.HRRoleBtn);
	    	} else if(role == "Employee") {
	    		interact.clickElement(locator.EmployeeRoleBtn);
	    	}
	    	else {
	            System.out.println("Invalid role: " + role);
	        }
	    }
	    
	}
