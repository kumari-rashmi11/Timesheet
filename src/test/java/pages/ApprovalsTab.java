package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import helper.Interactions;
import utils.Approval_Locators;
import utils.DashboardLocators;

public class ApprovalsTab {
	private WebDriver driver;
	public WebDriverWait wait;
	public Interactions interactions;
	public Actions action;

	public ApprovalsTab(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.interactions = new Interactions(driver);
		this.action = new Actions(driver);
	}

	

	public void selectapprovaltab_viewer() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonRl);

	}

	public void selectapprovaltab_Rl() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonRl);

	}

	public void selectapprovaltab_PL() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonPl);

	}

	public void selectapprovaltab_Editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonEditor);

	}

	public void selectapprovaltab_Hr() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonHr);

	}

	public void searchprojectbystatus() {
		interactions.clickElement(Approval_Locators.SelectStatus);

	}

	public void dynamicStatusSelection(String status,String year) throws InterruptedException {
		Thread.sleep(2000);
		dynamicYearSelection(year);
		interactions.click(Approval_Locators.SelectWeeks);
		if(status != "Submitted") {
			interactions.click(Approval_Locators.SelectStatus);
			String statusPath = "//button[.//span[text()= '"+status+"']]";
			interactions.click(By.xpath(statusPath));
		}
	}
	public void dynamicStatusSelection(String status) throws InterruptedException {
		Thread.sleep(2000);
		interactions.click(Approval_Locators.SelectWeeks);
		if(status != "Submitted") {
			interactions.click(Approval_Locators.SelectStatus);
			String statusPath = "//button[.//span[text()= '"+status+"']]";
			interactions.click(By.xpath(statusPath));
		}
	}
	public void dynamicWeekSelection(String date, String year) throws InterruptedException {
		Thread.sleep(6000);
		dynamicYearSelection(year);
		interactions.click(Approval_Locators.SelectWeeks);
		String datePath = "//div[contains(text(), '"+date+"')]";
		interactions.scroll(By.xpath(datePath));
		interactions.click(By.xpath(datePath));
	}
	public void dynamicPlSelection(String plName) throws InterruptedException {
		Thread.sleep(3000);
		//dynamicYearSelection(year);
		interactions.click(Approval_Locators.SelectPL);
		String plPath = "//div[@class='drop-content']//div[contains(text(), '"+plName+"')]";
		interactions.scroll(By.xpath(plPath));
		interactions.click(By.xpath(plPath));
	}
	public void dynamicReporteesSelection(String reporteeName) throws InterruptedException {
		Thread.sleep(3000);
		interactions.sendingKeys(Approval_Locators.SelectReportees, reporteeName);
	//	interactions.sendingKeys(Approval_Locators.Keys.ENTER);

		//interactions.click(Approval_Locators.ConfirmReportee);
	}
	
//	public void dynamicYearSelection(String year) throws InterruptedException {
//		Thread.sleep(1000);
//		interactions.click(Approval_Locators.FyFilterBtn);
//	    String xpath = "//div[contains(@class, 'appmagic-dropdownListItem') and text()='" + year + "']";
//	    interactions.click(By.xpath(xpath));
//	}
 
	public void reset_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectRefreshBtn);

	}

	public void approve_timesheet_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
		
	}

	public void reject_timesheet_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.RejectBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "need to improvement");
	}

	public void holiday_marking() throws InterruptedException {
		Thread.sleep(7000);
		interactions.clickElement(Approval_Locators.SelectWeeks);
		Thread.sleep(1000);


		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		WebElement holidayDateElement = driver.findElement(Approval_Locators.selctholidaydate);
		Actions actions = new Actions(driver);
		actions.moveToElement(holidayDateElement).perform();
	}
	
	public void approved_partially() {
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
	}

	public void fy_filter() {
		interactions.clickElement(Approval_Locators.FyFilterBtn);
		interactions.clickElement(Approval_Locators.SelectFyFilterBtn);

	}

	public void visibility_reportees() {
		interactions.clickElement(Approval_Locators.SelectReportees);

	}

	public void visibility_reportees_editor() {
		    String timesheetPath = "//div[@data-control-id='2730']//div[@aria-posinset]";

		    List<WebElement> divElements = interactions.getDriver().findElements(By.xpath(timesheetPath));

		    int totalDivs = divElements.size();

		    System.out.println("Total No of Timesheets: " + totalDivs);

		    for (int i = 0; i < totalDivs; i++) {
		        WebElement element = divElements.get(i);
		      //  System.out.println("Div Text: " + element.getText()); 
		    }
		}
	
	public void timesheet_count_visibility() {
		String filterCountText = interactions.getText(Approval_Locators.FilterCount);
	    System.out.println(filterCountText);
	    //Assert.assertTrue(filterCountText != null && !filterCountText.isEmpty(), "Filter count text is not visible!");

	}
	public void visibility_timesheet_Approval_Request(String r) {
			interactions.click(new DashboardLocators().Leaddb);
			String reporteePath="//div[contains(text(), '" + r + "')]";
			interactions.click(By.xpath(reporteePath));

	}

	public void dynamicWeekSelection(String date) throws InterruptedException {
		Thread.sleep(2000);
		interactions.click(Approval_Locators.SelectWeeks);
//		interactions.click(Approval_Locators.SelectWeeks);
		String datePath = "//div[contains(text(), '"+date+"')]";
		interactions.scroll(By.xpath(datePath));
		interactions.click(By.xpath(datePath));
	}
	
	public void dynamicYearSelection(String year) {
		interactions.click(Approval_Locators.FyFilterBtn);
	    String xpath = "//div[contains(@class, 'appmagic-dropdownListItem') and text()='" + year + "']";
	    interactions.click(By.xpath(xpath));
	}
	public void bulk_approval() {
		interactions.clickElement(Approval_Locators.Selectallbtn);
		//interactions.clickElement(Approval_Locators.Bulkapprovedbtn);

	}

	public void not_resetted() {
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectbackBtn);
	}

	public void attachement_visibility() {
		interactions.clickElement(Approval_Locators.SelectAttachement);
	}
	//Sahil code
	

	
	
	public void searchprojectbydate(String status, String date, String year) throws InterruptedException {
		 interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		 dynamicStatusSelection(status);
		 dynamicWeekSelection(date);
	}
	
	
	public void searchprojectreportee(String name) {
		interactions.enterText(Approval_Locators.reporteeInput, name);
        WebElement button = driver.findElement(Approval_Locators.reporteeInput);
        button.sendKeys(Keys.ENTER);

	}
	public void searchprojectreportee_hr_editor() {
		interactions.click(Approval_Locators.SelectApprovalsButtonHr);
		interactions.click(Approval_Locators.SelectPL);
		interactions.click(Approval_Locators.ChoosePL);
		interactions.enterText(Approval_Locators.SelectReportees, "Vivek Rajput(1508)");
		interactions.click(Approval_Locators.SelectReportees);
	}
	public void reset() {
		interactions.click(Approval_Locators.SelectRefreshBtn);
	}
	
	public void approve_timesheet(String date, String year) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
		interactions.click(Approval_Locators.SelectRigthArrow);
		interactions.click(Approval_Locators.SelectApproveBtn);
		interactions.enterText(Approval_Locators.SelectTextBox, "Good Job");
	}
	
	public void reject_timesheet(String date, String year) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
		interactions.click(Approval_Locators.SelectRigthArrow);
		interactions.click(Approval_Locators.RejectBtn);
		interactions.enterText(Approval_Locators.SelectTextBox, "need to improvement");
	}
	
	
	public void approved_partially(String status,String date, String year,String reportee) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
		searchprojectreportee(reportee);
		dynamicStatusSelection(status);
		interactions.click(Approval_Locators.SelectRigthArrow);

	}
	public void fy_filter(String year) {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
	}
	
	
	public void approve_timesheet_with_reportee(String date, String year,String name) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
		searchprojectreportee(name);
		interactions.click(Approval_Locators.SelectRigthArrow);
		interactions.click(Approval_Locators.SelectApproveBtn);
		interactions.enterText(Approval_Locators.SelectTextBox, "Good Job");
//		interactions.click(this.Approval_Locators.Selectcontinuebtn);
	}
	public void reject_timesheet_with_reportee(String date, String year,String name) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
		searchprojectreportee(name);
		//dynamicStatusSelection(status);
		interactions.click(Approval_Locators.SelectRigthArrow);
		interactions.click(Approval_Locators.RejectBtn);
		interactions.enterText(Approval_Locators.SelectTextBox, "need to improvement");
//		interactions.click(this.Approval_Locators.Selectcontinuebtn);
	}
	
	public void not_resetted(String date, String year,String name,String status) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		Thread.sleep(2000);
		dynamicWeekSelection(date);
		Thread.sleep(2000);
		searchprojectreportee(name);
		Thread.sleep(2000);
		dynamicStatusSelection(status);
		interactions.click(Approval_Locators.SelectRigthArrow);
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
	}
	
	public void data_visibility(String date, String year) throws InterruptedException {
		interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		dynamicYearSelection(year);
		dynamicWeekSelection(date);
	}
}