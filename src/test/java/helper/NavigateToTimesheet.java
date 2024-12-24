package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonLocators;

public class NavigateToTimesheet {
	WebDriver driver;
	WebDriverWait wait;
	CommonLocators locator;
    Interactions interact;
    
    public NavigateToTimesheet(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locator = new CommonLocators();
        this.interact = new Interactions(driver);
    }
    
    public void clickTeamsBtn() {
    	interact.click(locator.teams);
    }
    
    public void clickTimesheetBtn() {
    	interact.click(locator.timeSheet_QA);
    }
    
    public void clickTimesheetGeneral() {
    	interact.click(locator.timeSheetGeneral);
    }
    public void clickTimesheetLink() {
    	interact.click(locator.timeSheetTab);
    }
    
}
