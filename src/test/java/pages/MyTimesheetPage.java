package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import helper.Interactions;
import utils.MyTimesheetLocators;

public class MyTimesheetPage {

	private Interactions interaction;
	private MyTimesheetLocators MTlocators;
	Actions actions;

	public MyTimesheetPage(WebDriver driver) {
		this.interaction = new Interactions(driver);
		this.MTlocators = new MyTimesheetLocators();
		this.actions = new Actions(driver);

	}

	public void clickMyTimesheetTab() {
		this.interaction.clickElement(MTlocators.myTimesheetTab);
	}
	
	public void clickMyTimesheetTabRL() {
		this.interaction.clickElement(MTlocators.myTimesheetTabRL);
	}
	
	public void clickMyTimesheetTabPL() {
		this.interaction.clickElement(MTlocators.myTimesheetTabPL);
	}

	public void clickaddButton() {
		this.interaction.clickElement(MTlocators.addTimesheetButton);
	}

	// FY dropdown
	public void clickFYdropdown() {
		this.interaction.clickElement(MTlocators.FYdropdown);
	}

	public void clickFY2223() {
		this.interaction.clickElement(MTlocators.FY22_23);
	}

	public void selectFY() {
		clickFYdropdown();
		clickFY2223();
	}

	// searchbox
	public void searchText(String searchTerm) {
		this.interaction.sendingKeys(MTlocators.searchBox, searchTerm);
	}

	// refresh button
	public void refreshbutton() {
		this.interaction.clickElement(MTlocators.refreshButton);
	}

	// draft selection
	public void selectingTimesheet() {
		this.interaction.clickElement(MTlocators.selectingSheet);
	}

	public void noteBox(String note) {
		this.interaction.sendingKeys(MTlocators.noteBoxcss, note);
	}

	public void timeBox(int note) {
		this.interaction.sendKeysInt(MTlocators.timeBox, note);
	}

	public void updateNoteBox(String Updatenote) {
		this.interaction.sendingKeys(MTlocators.updateNoteBox, Updatenote);

	}

	public void saveButton() {
		this.interaction.clickElement(MTlocators.saveButton);
	}

	public void newTMsaveBtn() {
		this.interaction.clickElement(MTlocators.newTMsaveBtn);
	}

	public void newTMsubmitBtn() {
		this.interaction.clickElement(MTlocators.newTMsaveBtn);
	}

	public void submitButton() {
		this.interaction.clickElement(MTlocators.submitButton);
	}

	public void submitButtonRjt() {
		this.interaction.clickElement(MTlocators.RejectedsubmitButton);
	}

	public void finalSubmitBtn() {
		this.interaction.clickElement(MTlocators.finalSubmitBtn);
	}

	public void finalsubmit() {
		this.interaction.clickElement(MTlocators.submitButton);
		this.interaction.clickElement(MTlocators.finalSubmitBtn);
	}
	
	public void finalsubmitRL() {
		this.interaction.clickElement(MTlocators.submitButton);
		this.interaction.clickElement(MTlocators.finalSubmitBtnRL);
	}


	public void partialsubmitEmp() {
		this.interaction.clickElement(MTlocators.newTMsubmitBtn);
		this.interaction.clickElement(MTlocators.partialSubmitEmp);
	}
	public void partialsubmit() {
//		this.interaction.clickElement(MTlocators.newTMsubmitBtn);
		this.interaction.clickElement(MTlocators.submitButton);
		this.interaction.clickElement(MTlocators.partialSubmitRL);
	}
	
	public void partialsubmitPL() {
		this.interaction.clickElement(MTlocators.newTMsubmitBtn);
		this.interaction.clickElement(MTlocators.partialsubmitPL);
	}

	public void finalSubmitBtnRjt() {
		this.interaction.clickElement(MTlocators.RejectedFinalSubmitBtn);
	}

	public void FinalSubmitRjt() {

		this.interaction.clickElement(MTlocators.RejectedsubmitButton);
		this.interaction.clickElement(MTlocators.RejectedFinalSubmitBtn);
	}

	public void exportAsPDF() {
		this.interaction.clickElement(MTlocators.exportAsPDF);
		this.interaction.clickElement(MTlocators.exportButton);
	}

	public void nextweekBtn() {
		this.interaction.clickElement(MTlocators.nextWeekBtn);

	}
	public void nextweekBtn2() {
		this.interaction.clickElement(MTlocators.nextWeekBtn2);

	}

	public void sendAttachment() throws AWTException {
		Robot rb = new Robot();
//		String location = "C:\\Users\\MonalishaRabha\\Desktop\\attachment.png";

		this.interaction.clickElement(MTlocators.sendAttachment);

		rb.delay(1000);
		StringSelection strLoc = new StringSelection("attachment.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strLoc, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

//	hover element
	public void holidayMarking() {
		try {
			// Locate the holiday marking element with visibility wait
			WebElement holidayMarkingElement = interaction.visibilityEle(MTlocators.holidayMarking);

			// Perform hover action
			actions.moveToElement(holidayMarkingElement).perform();
			System.out.println("Hover action performed on holiday marking");

		} catch (Exception e) {
			System.out.println("Error during hover action: " + e.getMessage());
		}
	}

}
