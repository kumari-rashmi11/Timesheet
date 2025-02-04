package test.HumanResource;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import helper.RoleSelection;
import pages.ClientTabPages;

public class ClientTabTest_HR extends BaseTest{
	
	public void initial_test() throws InterruptedException {
		RoleSelection roleSelectionPage = new RoleSelection(driver);
//      roleSelectionPage.switchToIframe();
      // Select the desired role 
		roleSelectionPage.timesheetNavigation(); 
		roleSelectionPage.iframeSwitch1();
		roleSelectionPage.iframeSwitch2();
		roleSelectionPage.HRRoleBtn();

		ClientTabPages ClientsPage = new ClientTabPages(driver);
      boolean isSuccess = ClientsPage.navigateToClientsTab_HR();
      Assert.assertTrue(isSuccess, "navigated to clients tab");
	}
	
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_026_searchClientByName_HR() throws InterruptedException {
		 initial_test();
		ClientTabPages ClientsPage = new ClientTabPages(driver);
      boolean isSuccess = ClientsPage.TC_026_searchClientByName_HR("Apple Company");
      Assert.assertTrue(isSuccess, "searched client");
	}
	
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_027_refreshButton_HR() throws InterruptedException {
		 initial_test();
		ClientTabPages ClientsPage = new ClientTabPages(driver);
      boolean isSuccess = ClientsPage.TC_027_refreshButton_HR("Apple Company");
      Assert.assertTrue(isSuccess, "refresh button");
	}
	
	
//	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
//	public void viewClientDetails_HR() throws InterruptedException {
//	 initial_test();
//
//		ClientTabPages ClientsPage = new ClientTabPages(driver);
//      boolean isSuccess = ClientsPage.viewClientDetails_HR("azzx");
//     Assert.assertTrue(isSuccess, "client details executed");
//     }
//	
//
//	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
//	public void viewProjectDetails_HR() throws InterruptedException {
//	 initial_test();
//
//		ClientTabPages ClientsPage = new ClientTabPages(driver);
//      boolean isSuccess = ClientsPage.viewClientDetails_HR("azzx");
//      Assert.assertTrue(isSuccess, "project details viewed");
//	}

	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	}
}
