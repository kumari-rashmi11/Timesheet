package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import helper.Interactions;
import utils.ChargeActivityTypeLocators;

public class ChargeActivityTypePage {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
    Interactions interact;
    ChargeActivityTypeLocators locators;
    
    public ChargeActivityTypePage(WebDriver driver) {
    	if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locators = new ChargeActivityTypeLocators();
        this.action = new Actions(driver);
        this.interact = new Interactions(driver);
    }
    
    public void clickChargeActivityType_Viewer() {
    	interact.clickElement(locators.chargeActivityType_Viewer);
    }
    
    public void clickChargeCode() {
    	interact.clickElement(locators.chargeCode);
    }
    
    public void clickEditIcon() {
    	interact.clickElement(locators.editIcon);
    }
    
    public void clickDeleteIcon() {
    	interact.clickElement(locators.deleteIcon);
    }
    
    public void clickconfirmDelete() {
    	interact.clickElement(locators.confirmDelete);
    }
    
    public void clickeditActivityTypeMenu() {
    	interact.clickElement(locators.editActivityTypeMenu);
    }
    
    public void clickeditSelectActivityTypeMenu() {
    	interact.clickElement(locators.editSelectActivityTypeMenu);
    }
    
    public void clickeditTask() {
    	interact.clickElement(locators.editTask);
    }
    
    public void clickeditSelecTask() {
    	interact.clickElement(locators.editSelectTask);
    }
    
    public void clicksaveEditedChargeActivityType() {
    	interact.clickElement(locators.saveEditedChargeActivityType);
    }
    
    public void clickAddBtn() {
    	interact.clickElement(locators.addBtn);
    }
    
    public void clickProjectName() {
    	interact.clickElement(locators.projectName);
    }
    
    public void clickSelectProjectName() {
    	interact.clickElement(locators.selectProjectName);
    }
    
    public void clickchargeCodeMenu() {
    	interact.clickElement(locators.chargeCodeMenu);
    }
    
    public void clickselectchargeCode() {
    	interact.clickElement(locators.selectchargeCode);
    }
    
    public void clickactivityType() {
    	interact.clickElement(locators.activityType);
    }
    
    public void clickselectactivityType() {
    	interact.clickElement(locators.selectactivityType);
    }
    
    public void clicktask() {
    	interact.clickElement(locators.task);
    }
    
    public void clickselectTask() {
    	interact.clickElement(locators.selectTask);
    }
    
    public void clickaddChargeActivityTypeBtn() {
    	interact.clickElement(locators.addChargeActivityTypeBtn);
    }
    
    public void clickChargeActivityType_PL() {
    	interact.clickElement(locators.chargeActivityType_PL);
    }
    
    public void clickChargeActivityType_Editor() {
    	interact.clickElement(locators.chargeActivityType_Editor);
    }
    
    public void clickChargeActivityType_HR() {
    	interact.clickElement(locators.chargeActivityType_HR);
    }
    
    public void search_using_charge_code() {
    	interact.sendingKeys(locators.search_Box, "setuds");
    }
    
    public void search_using_project_Name() {
    	interact.sendingKeys(locators.search_Box, "data");
    }
    
    public void search_using_Activity_Type() {
    	interact.sendingKeys(locators.search_Box, "development");
    }
    
    public void refresh_icon() {
    	interact.clickElement(locators.refreshIcon);
    }
}
