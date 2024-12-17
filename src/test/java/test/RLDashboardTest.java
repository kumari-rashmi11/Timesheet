package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.EditorDashboardPage;
import pages.RLDashboardPage;

public class RLDashboardTest extends BaseTest{
	
	@Test (priority = 1)
    public void TC_004_toogle_switchon() {
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.clickswitchon();
    }
	
	@Test (priority = 2)
    public void TC_004_toogle_switchoff() {
		EditorDashboardPage dashboard= new EditorDashboardPage(driver);
		dashboard.clickswitchoff();
    }
	
	@Test (priority = 2)
    public void TC_295() {
		RLDashboardPage dashboard= new RLDashboardPage(driver);
        dashboard.financialdd();
    }
	
	@Test (priority = 3, dependsOnMethods = {"TC_295"})
    public void TC_296() {
		TC_295();
		RLDashboardPage dashboard= new RLDashboardPage(driver);
        dashboard.yearr();
    }
	
	@Test (priority = 4, dependsOnMethods = {"TC_296"})
    public void TC_297() {
		TC_296();
		RLDashboardPage dashboard= new RLDashboardPage(driver);
        dashboard.calculate();
    }
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
