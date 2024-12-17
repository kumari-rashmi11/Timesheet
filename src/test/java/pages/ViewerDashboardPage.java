package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.DashboardLocators;

public class ViewerDashboardPage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
    

    // Constructor
    public ViewerDashboardPage(WebDriver driver) {
        this.clickingHelper = new Interactions(driver);
        this.locator = new DashboardLocators();
    }
    
    // Method to navigate to the Viewer Dashboard
    public void navigateToDashboard() {
        clickingHelper.clickEle(this.locator.adminViewer);
    }

    public void clickreporteeViewer() {
        clickingHelper.clickEle(this.locator.clickreporteeViewer);
    }
    
    public void clickGreenRlButton() {
        clickingHelper.clickEle(this.locator.greenrl);
    }

    public void clickPurplePlButton() {
        clickingHelper.clickEle(this.locator.purplepl);
    }

    public void blackuserViewer() {
        clickingHelper.clickEle(this.locator.blackuserViewer);
    }
    
    public void switchoffViewer() {
        clickingHelper.clickEle(this.locator.switchoffViewer);
    }
    
    public void switchonViewer() {
        clickingHelper.clickEle(this.locator.switchonViewer);
    }

    public void clickyeardd() {
  	  clickingHelper.clickEle(this.locator.yeardropdown);
    }
    public void repddViewer() {
   	 clickingHelper.clickEle(this.locator.repddViewer);
    }

    public void repnameViewer() {
   	 clickingHelper.clickEle(this.locator.repnameViewer);
    }
    public void filterbtn() {
      	 clickingHelper.clickEle(this.locator.filterbtn);
       }
}
