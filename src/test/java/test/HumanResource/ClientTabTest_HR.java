package test.HumanResource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import pages.ClientTabPages;

public class ClientTabTest_HR extends BaseTest{
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_026_searchClientByName_HrRole() {
		ClientTabPages hr = new ClientTabPages(driver);
		hr.TC_026_searchClientByName_HR("29");
		
	}
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_027_refreshButton_HrRole() {
		ClientTabPages hr = new ClientTabPages(driver);
		hr.TC_027_refreshButton_HR("29");
	}
	
	@Test(priority =3,retryAnalyzer = RetryAnalyzer.class)
	public void viewClientDetails_HrRole() {
		ClientTabPages hr = new ClientTabPages(driver);
		hr.viewClientDetails_HR("29");
	}
	@Test(priority =4, retryAnalyzer = RetryAnalyzer.class)
	public void viewProjectDetails_HrRole() {
		ClientTabPages hr = new ClientTabPages(driver);
		hr.viewProjectDetails_HR("29");
	}
	
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
}
