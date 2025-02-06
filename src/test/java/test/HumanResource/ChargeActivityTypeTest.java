package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.EmployeeTabDataProvider;
import DataProvider.chargeActivityTabDataProvider;
import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ChargeActivityTypePage;
import pages.ProjectTab;

public class ChargeActivityTypeTest extends BaseTest {
	
	public void initialTest() throws InterruptedException {
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		Interactions interact = new Interactions(driver);
//		RoleSelection roleSelectionPage = new RoleSelection(driver);
////      roleSelectionPage.switchToIframe();
//      // Select the desired role 
//		roleSelectionPage.timesheetNavigation(); 
//		roleSelectionPage.iframeSwitch1();
//		roleSelectionPage.iframeSwitch2();
//		roleSelectionPage.HRRoleBtn();
		interact.executeWithDelay(() -> cat.clickChargeActivityType());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class, dataProvider = "searchchargecode", dataProviderClass = chargeActivityTabDataProvider.class)
	public void Search_and_refresh_HR_TC_040(String code) throws InterruptedException {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code(code));
		interact.executeWithDelay(() -> cat.refresh_icon());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
