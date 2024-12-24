package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.ApprovalsTab;

public class ApprovalsTabTest_HR extends BaseTest {
	private ApprovalsTab approvalTab;
	public Interactions interactions;

	@BeforeMethod
	public void setUp() {
		approvalTab = new ApprovalsTab(driver);
		interactions = new Interactions(driver);
	}

//	@Test(priority = 1)
//
//	public void initiaTest() {
////		RoleSelection roleSelection = new RoleSelection(driver);
////		roleSelection.iframeSwitch1();
////		roleSelection.iframeSwitch2();
////		roleSelection.selectRole("HR");
//		approvalTab.selectapprovaltab_Hr();
//	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_066_searchtimesheetbyDate_HR() throws InterruptedException {
		approvalTab.selectapprovaltab_Hr();
		approvalTab.searchprojectbydate();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_067_searchtimesheetbyStatus_HR() throws InterruptedException {
		approvalTab.searchprojectbystatus();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
