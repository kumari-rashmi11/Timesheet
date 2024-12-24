package test.PracticeLead;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.MyTimesheetPage;

public class MyTimesheetTestPL extends BaseTest {

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public void initiaTest() {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.selectRole("PL");
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC52_PL_clickOnMTtab() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC57_PL_selectFY() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.selectFY();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC58_PL_search() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("draft");
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC60_PL_refresh() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.refreshbutton();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)

	public void TC302_PL_selectTM() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("approved");
		myTimesheetPage.selectingTimesheet();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)

	public void TC303_PL_exportasPDf() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("approved");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.exportAsPDF();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC64_PL_holidayMarking() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTabPL());
		interactions.executeWithDelay(() -> myTimesheetPage.searchText("10 Nov - 16 Nov, 2024"));
		interactions.executeWithDelay(() -> myTimesheetPage.selectingTimesheet());
		interactions.executeWithDelay(() -> myTimesheetPage.holidayMarking());

	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC65_PL_NotesLimit() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("Approved");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.noteBox(
				"Creativity fuels innovation, blending imagination with practicality to shape new ideas. From art to technology, every field benefits as unique visions turn into transformative solutions and impact lives.");
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC54_PL_saveButton() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.updateNoteBox("Updating Note test");
		myTimesheetPage.saveButton();
	}

//	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
//	public void TC53_PL_createNewTimesheet() throws InterruptedException {
//		initiaTest();
//		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
//		Interactions interactions = new Interactions(driver);
//
//		interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTabPL());
//		interactions.executeWithDelay(() -> myTimesheetPage.clickaddButton());
//		Thread.sleep(2000);
//		interactions.executeWithDelay(() -> myTimesheetPage.nextweekBtn());
//		interactions.executeWithDelay(() -> myTimesheetPage.timeBox(1));
//		interactions.executeWithDelay(() -> myTimesheetPage.noteBox("drafting a timesheet"));
//		interactions.executeWithDelay(() -> {
//			try {
//				myTimesheetPage.sendAttachment();
//			} catch (AWTException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
//		interactions.executeWithDelay(() -> myTimesheetPage.newTMsaveBtn());
//
//	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC138_TC53_PL_createNewTimesheet_partiallySubmit() throws InterruptedException {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		interactions.executeWithDelay(() -> myTimesheetPage.clickMyTimesheetTabPL());
		interactions.executeWithDelay(() -> myTimesheetPage.clickaddButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> myTimesheetPage.nextweekBtn());
		interactions.executeWithDelay(() -> myTimesheetPage.nextweekBtn2());
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
		interactions.executeWithDelay(() -> myTimesheetPage.partialsubmitPL());

	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC55_PL_finalsubmit() {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);
		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("draft");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.updateNoteBox("Updating Note test");
		myTimesheetPage.saveButton();
		interactions.executeWithDelay(() -> myTimesheetPage.finalsubmitRL());

	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC56_PL_finalSubmitForRejected() throws InterruptedException {
		initiaTest();
		MyTimesheetPage myTimesheetPage = new MyTimesheetPage(driver);
		Interactions interactions = new Interactions(driver);

		myTimesheetPage.clickMyTimesheetTabPL();
		myTimesheetPage.searchText("rejected");
		myTimesheetPage.selectingTimesheet();
		myTimesheetPage.updateNoteBox("Updating Note test");
		interactions.executeWithDelay(() -> myTimesheetPage.saveButton());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> myTimesheetPage.FinalSubmitRjt());

	}

}
