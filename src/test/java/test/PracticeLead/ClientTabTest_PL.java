package test.PracticeLead;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.ClientTabPages;

public class ClientTabTest_PL extends BaseTest {
//	@Test(priority =1)
//	public void navigateToClientTab() {
//		
//	}
	@Test(priority =1)
	public void TC_022_addClient_PL() {
		ClientTabPages client = new ClientTabPages(driver);
		Boolean isSuccess = client.TC_022_addClient_PL("client client client");
        Assert.assertTrue(isSuccess, "Failed to add client.");

	}
	@Test(priority = 2)
	public void TC_023_editClientDetails_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_023_editClientDetails_PL("Updated Client", "active");
	    Assert.assertTrue(isSuccess, "Failed to edit client details.");
	}

	@Test(priority = 3)
	public void TC_024_025_deleteClient_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_024_deleteClient_PL(true, "cl1");
	    Assert.assertTrue(isSuccess, "Failed to delete client.");
	}

	@Test(priority = 4)
	public void TC_026_searchClientByName_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_026_searchClientByName_PL("29");
	    Assert.assertTrue(isSuccess, "Failed to search client by name.");
	}

	@Test(priority = 5)
	public void TC_027_refreshButton_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_027_refreshButton_PL("29");
	    Assert.assertTrue(isSuccess, "Failed to refresh client list.");
	}

	@Test(priority = 6)
	public void TC_279_280_addProjectButtonVisibility_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isVisible = client.TC_279_addProjectButtonVisibility_PL("29");
	    Assert.assertTrue(isVisible, "Add Project button is not visible.");
	}

	@Test(priority = 7)
	public void TC_285_addProjectForClient_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_285_addProjectForClient_PL("azzx", "New Project", "Description", "Notes");
	    Assert.assertTrue(isSuccess, "Failed to add project for client.");
	}

	@Test(priority = 8)
	public void TC_286_editClientProjectTest_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_286_editClientProjectTest_PL("Updated Project", "Updated Description", "Updated Notes", "29", "TCS");
	    Assert.assertTrue(isSuccess, "Failed to edit client project.");
	}

	@Test(priority = 9)
	public void TC_287_deleteProject_PL() {
	    ClientTabPages client = new ClientTabPages(driver);
	    boolean isSuccess = client.TC_287_deleteProject_PL("azzx", 'Y');
	    Assert.assertTrue(isSuccess, "Failed to delete project.");
	}

}
