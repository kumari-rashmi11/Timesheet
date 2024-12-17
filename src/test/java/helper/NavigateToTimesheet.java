package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AllLocators;

public class NavigateToTimesheet {
	WebDriver driver;
	WebDriverWait wait;
	AllLocators locator;
    Interactions interact;
    
    public NavigateToTimesheet(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locator = new AllLocators();
        this.interact = new Interactions(driver);
    }
    
    public void clickTeams() {
    	interact.clickEle(locator.teams);
    }
    public void clickTimsheetQA() {
    	interact.clickEle(locator.timeSheet_QA);
    }
    
    public void clickTimesheetGeneral() {
    	interact.clickEle(locator.timeSheetGeneral);
    }
    
    public void clickTimesheetTab() {
    	interact.clickEle(locator.timeSheetTab);
    }
    
}
