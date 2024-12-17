package pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DashboardLocators;
import helper.Interactions;

public class PLDashboardPage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
	 	 
	 
	 // Constructor
	    public PLDashboardPage(WebDriver driver) {
	    	this.clickingHelper = new Interactions(driver);
	        this.locator = new DashboardLocators();
	    }
	    
	 // Method to navigate to the PL Dashboard
	    public void navigateToDashboard() {
	        clickingHelper.clickEle(this.locator.Leaddb);
	    }	
	    
	    public void reporteePL() {
	        clickingHelper.clickEle(this.locator.reporteePL);
	    }
	    
	    public void switchoffPL() {
	        clickingHelper.clickEle(this.locator.switchoffViewer);
	    }
	    
	    public void switchonPL() {
	        clickingHelper.clickEle(this.locator.switchonViewer);
	    }
	    public void clickyeardd() {
	    	  clickingHelper.clickEle(this.locator.yeardropdown);
	      }
	    public void rightarrowPL() {
       	 clickingHelper.clickEle(this.locator.rightarrowPL);
        }
       
        public void approvebtnPL() {
       	 clickingHelper.clickEle(this.locator.approvebtnPL);
        }
        public void repddPL() {
          	 clickingHelper.clickEle(this.locator.repddPL);
        }

//        public void repnamePL() {
//          	 clickingHelper.dropdownSelector(this.locator.repnamePL);
//        }
        public void repnamePL() {
         	 clickingHelper.clickEle(this.locator.repnamePL);
       }
        
        public void filterbtnPL() {
            clickingHelper.clickEle(this.locator.filterbtnPL);
        }
           
        public void notstartedyet() {
        	 System.out.println(clickingHelper.getText(this.locator.notstartedyet));
        }
        public void consumedhrs() {
       	 System.out.println(clickingHelper.getText(this.locator.consumedhrs));
       }
}