package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.DashboardLocators;

public class RLDashboardPage {
	private Interactions clickingHelper;
	private DashboardLocators locator;
    

    // Constructor
    public RLDashboardPage(WebDriver driver) {
        this.clickingHelper = new Interactions(driver);
        this.locator = new DashboardLocators();
    }
    
    public void clickswitchon() {
        clickingHelper.clickEle(this.locator.switchonRL);
    }
    
    public void clickswitchoff() {
        clickingHelper.clickEle(this.locator.switchoffRL);
    }
    
    
    
    

    public void financialdd() {
        clickingHelper.clickEle(this.locator.finandd);
    }
    
    public void yearr() {
        clickingHelper.clickEle(this.locator.year);
    }
    
    public void calculate() {
        clickingHelper.clickEle(this.locator.calculatebtn);
    }

}
