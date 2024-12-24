package test.ReportingLead;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.EvalSettingPage;

public class evaluationSettingTestRL extends BaseTest {
	
	private EvalSettingPage evaluationTab;

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public void initiaTest() {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.selectRLRole();
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC275_RL_percentagenotvissible() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectstatusdropdown();
		EvalSettingPage.allStatus();
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC271_providing_feedback_pct_0() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.proposedBonusIntRL_23Q4(0);
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC284_RL_Click_on_Reportee() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectstatusdropdown();
		EvalSettingPage.allStatus();
		interactions.executeWithDelay(() -> EvalSettingPage.selectEmployee());
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC279_TC286_RL_providingFeedback_more_than_pct_999() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.proposedBonusIntRL_23Q4(1000);
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC272_TC285_RL_providingFeedback_pct_0_999() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.proposedBonusIntRL_23Q4(989);
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC277_RL_q1filter() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		interactions.executeWithDelay(() -> EvalSettingPage.q3review());
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC278_RL_scrolldown() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		interactions.executeWithDelay(() -> EvalSettingPage.scrolldown());

	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC280_RL_contributionSummary() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);

		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.contributionSummaryRL("this is test summary");
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC281_RL_saveButtonReview() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q4();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.proposedBonusIntRL_23Q4(900);
		EvalSettingPage.contributionSummaryRL("this is test summary and save");
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC266_TC283_RL_rejectionProcess() throws InterruptedException {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectQuaterFilter23Q2();
		interactions.executeWithDelay(() -> EvalSettingPage.startReviewRL());
		EvalSettingPage.proposedBonusIntRL_23Q2(800);
		EvalSettingPage.contributionSummaryRL("this is test summary for rejection 123");
		interactions.executeWithDelay(() -> EvalSettingPage.saveButtonReview());
		Thread.sleep(2000);
		interactions.executeWithDelay(() -> EvalSettingPage.rejectButton());
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC273_TC274_RL_percentageEvaluated() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		Interactions interactions = new Interactions(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectstatusdropdown();
		EvalSettingPage.allStatus();
		interactions.executeWithDelay(() -> EvalSettingPage.toggleButton());
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC276_RL_YEARfilter() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectstatusdropdown();
		EvalSettingPage.allStatus();
		EvalSettingPage.selectEmployee();
		EvalSettingPage.yearReviewDD();
		EvalSettingPage.select2023year();
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC290_RL_Reject_to_RL_status() {
		initiaTest();
		EvalSettingPage EvalSettingPage = new EvalSettingPage(driver);
		EvalSettingPage.clickevaluationtab();
		EvalSettingPage.selectstatusdropdown();
		EvalSettingPage.rejecttoRLStatus();
	}

	// Vivek

	@Test(priority = 2)
	public void TC_177_Rl() throws InterruptedException {
		initiaTest();
		evaluationTab.feedbackbyRL();
	}

	@Test(priority = 3)
	public void TC_179_Rl() throws InterruptedException {
		initiaTest();

		evaluationTab.feedbackbyRL();
	}

	@Test(priority = 4)
	public void TC_180_Rl() throws InterruptedException {
		initiaTest();
		evaluationTab.feedbackbyRL();
	}

}
