package test.Employee;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.MyTimesheetPage;

public class MyTimesheetTestEmployee extends BaseTest {

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public void initiaTest() {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.selectRole("Employee");
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC55_Employee_finalsubmit() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.selectingTimesheet();
		interactions.executeWithDelay(() -> myTimesheetPage.updateNoteBox("updating draft and final submit"));
		myTimesheetPage.saveButton();
		interactions.executeWithDelay(() -> myTimesheetPage.finalsubmit());

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC138_TC53_Employee_createNewTimesheet_partiallySubmit() throws InterruptedException {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTab());
		interactions.executeWithDelay(() -> myTimesheetPage.clickaddButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> myTimesheetPage.nextweekBtn());
		interactions.executeWithDelay(() -> myTimesheetPage.timeBox(1));
		interactions.executeWithDelay(() -> myTimesheetPage.noteBox("drafting a timesheet"));
		interactions.executeWithDelay(() -> {
			try {
				myTimesheetPage.sendAttachment();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		interactions.executeWithDelay(() -> myTimesheetPage.newTMsaveBtn());
		Thread.sleep(3000);
		interactions.executeWithDelay(() -> myTimesheetPage.partialsubmitEmp());
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC52_Employee_clickOnMTtab() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC57_Employee_selectFY() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.selectFY();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC58_Employee_search() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("draft");
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC60_Employee_refresh() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.refreshbutton();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)

	public void TC302_Employee_selectTM() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("approved");
		myTimesheetPage.selectingTimesheet();
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)

	public void TC303_Employee_exportasPDf() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("approved");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.exportAsPDF();
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC64_Employee_holidayMarking() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTab());
		interactions.executeWithDelay(() -> myTimesheetPage.searchText("10 Nov - 16 Nov, 2024"));
		interactions.executeWithDelay(() -> myTimesheetPage.selectingTimesheet());
		interactions.executeWithDelay(() -> myTimesheetPage.holidayMarking());

	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC65_Employee_NotesLimit() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("Approved");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.noteBox(
				"Creativity fuels innovation, blending imagination with practicality to shape new ideas. From art to technology, every field benefits as unique visions turn into transformative solutions and impact lives.");
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC54_Employee_saveButton() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);
		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.selectingTimesheet();
		interactions.executeWithDelay(() -> myTimesheetPage.updateNoteBox("updating draft and save"));
		myTimesheetPage.saveButton();
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC56_Employee_finalSubmitForRejected() throws InterruptedException {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		myTimesheetPage.clickMyTimesheetTab();
		myTimesheetPage.searchText("rejected");
		myTimesheetPage.selectingTimesheet();
		interactions.executeWithDelay(() -> myTimesheetPage.updateNoteBox("updating draft and save and final submit"));
		interactions.executeWithDelay(() -> myTimesheetPage.saveButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> myTimesheetPage.FinalSubmitRjt());

	}

}
