package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.ChargeActivityTypePage;

public class ChargeActivityTypeTest extends BaseTest {
	
	public void initialTest() {
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> cat.clickChargeActivityType_HR());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Search_and_refresh_HR_TC_040() {
		initialTest();
		Interactions interact = new Interactions(driver);
		ChargeActivityTypePage cat = new ChargeActivityTypePage(driver);
		interact.executeWithDelay(() -> cat.search_using_charge_code());
		interact.executeWithDelay(() -> cat.refresh_icon());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
