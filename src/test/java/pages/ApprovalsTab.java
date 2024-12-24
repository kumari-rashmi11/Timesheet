package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.Approval_Locators;

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

	public void searchprojectbydate() {
		// interactions.click(Approval_Locators.SelectApprovalsButtonRl);
		interactions.clickElement(Approval_Locators.SelectStatus);
		interactions.clickElement(Approval_Locators.Allstatus);
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseWeeks);

	}

	public void selectapprovaltab_viewer() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);

	}

	public void selectapprovaltab_Rl() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonRl);

	}

	public void selectapprovaltab_PL() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonPl);

	}

	public void selectapprovaltab_Editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);

	}

	public void selectapprovaltab_Hr() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButtonHr);

	}

	public void searchprojectbystatus() {
		interactions.clickElement(Approval_Locators.SelectStatus);
		interactions.clickElement(Approval_Locators.Allstatus);

	}

	public void searchprojectreportee() {
		interactions.clickElement(Approval_Locators.SelectReportees);
		interactions.clickElement(Approval_Locators.ChooseReportees);
	}

	public void searchprojectreportee_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);
		interactions.clickElement(Approval_Locators.SelectPL);
		interactions.clickElement(Approval_Locators.ChoosePL);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Vivek Rajput(1508)");
		interactions.clickElement(Approval_Locators.SelectReportees);
	}

	public void reset() {
		interactions.clickElement(Approval_Locators.SelectReportees);
		interactions.clickElement(Approval_Locators.ChooseReportees);
		interactions.clickElement(Approval_Locators.SelectRefreshBtn);

	}

	public void reset_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);
		interactions.clickElement(Approval_Locators.SelectReportees);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRefreshBtn);

	}

	public void approve_timesheet() {

		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
	}

	public void approve_timesheet_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
	}

	public void reject_timesheet() {

		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.RejectBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "need to improvement");
	}

	public void reject_timesheet_hr_editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.RejectBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "need to improvement");
	}

	public void holiday_marking() {
		interactions.clickElement(Approval_Locators.SelectStatus);
		interactions.clickElement(Approval_Locators.Allstatus);
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.Holidayweek);
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		WebElement holidayDateElement = driver.findElement(Approval_Locators.selctholidaydate);
		Actions actions = new Actions(driver);
		actions.moveToElement(holidayDateElement).perform();
	}

	public void approved_partially() {
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseWeeks);
		interactions.clickElement(Approval_Locators.SelectStatus);
		interactions.clickElement(Approval_Locators.ChooseStatus);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
	}

	public void fy_filter() {
		interactions.clickElement(Approval_Locators.SelectFyFilterBtn);
		interactions.clickElement(Approval_Locators.FyFilterBtn);

	}

	public void visibility_reportees() {
		interactions.clickElement(Approval_Locators.SelectReportees);

	}

	public void visibility_reportees_editor() {
		interactions.clickElement(Approval_Locators.SelectApprovalsButton);
		interactions.clickElement(Approval_Locators.SelectPL);
		interactions.clickElement(Approval_Locators.ChoosePL);
		interactions.clickElement(Approval_Locators.SelectReportees);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Vivek Rajput(1508)");

	}

	public void approve_timesheet_with_reportee() {

		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.SelectApproveBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "Good Job");
	}

	public void reject_timesheet_with_reportee() {

		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);
		interactions.clickElement(Approval_Locators.RejectBtn);
		interactions.sendingKeys(Approval_Locators.SelectTextBox, "need to improvement");
	}

	public void bulk_approval() {
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.clickElement(Approval_Locators.Selectallbtn);
		interactions.clickElement(Approval_Locators.Bulkapprovedbtn);

	}

	public void not_resetted() {
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
		interactions.clickElement(Approval_Locators.SelectRigthArrow);

	}

	public void attachement_visibility() {
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.clickElement(Approval_Locators.SelectAttachement);
	}

	public void data_visibility() {
		interactions.clickElement(Approval_Locators.SelectWeeks);
		interactions.clickElement(Approval_Locators.ChooseBulkWeeks);
		interactions.sendingKeys(Approval_Locators.SelectReportees, "Kaushik Barman(1511)");
	}
}
