package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DashboardLocators;
import helper.Interactions;
	public class TimesheetDashboardpage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
    

    // Constructor
    public TimesheetDashboardpage(WebDriver driver) {
        this.clickingHelper = new Interactions(driver);
        this.locator = new DashboardLocators();
    }

     // Method to navigate to the Timesheet Dashboard
        public void navigateToDashboard() {
            clickingHelper.clickEle(this.locator.dashboardButton);
        }

        // Methods to interact with specific buttons on the Timesheet Dashboard
        public void clickGreenRlButton() {
            clickingHelper.clickEle(this.locator.greenrl);
        }

        public void clickPurplePlButton() {
            clickingHelper.clickEle(this.locator.purplepl);
        }

        public void clickBlackUserButton() {
            clickingHelper.clickEle(this.locator.blackuser);
        }
    
}

 

