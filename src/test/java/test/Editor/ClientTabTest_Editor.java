package test.Editor;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClientTabPages;
import helper.BaseTest;

public class ClientTabTest_Editor extends BaseTest {

    @Test(priority = 1)
    public void TC_022_addClient() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_022_addClient_Editor("Test Client 1");
        Assert.assertTrue(isSuccess, "Failed to add client.");
    }
    @Test(priority = 2)
    public void TC_023_editClientDetails() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_023_editClientDetails_Editor("Updated Client", "active");
        Assert.assertTrue(isSuccess, "Failed to edit client details.");
    }

    @Test(priority = 3)
    public void TC_024_025_deleteClient() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_024_deleteClient_Editor(true, "cl1");
        Assert.assertTrue(isSuccess, "Failed to delete client.");
    }

    @Test(priority = 4)
    public void TC_026_searchClientByName() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_026_searchClientByName_Editor("29");
        Assert.assertTrue(isSuccess, "Failed to search client by name.");
    }

    @Test(priority = 5)
    public void TC_027_refreshButton() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_027_refreshButton_Editor("29");
        Assert.assertTrue(isSuccess, "Failed to refresh client list.");
    }
    
    @Test(priority = 6)
    public void TC_279_280_addProjectButtonVisibility() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isVisible = clientTabPages.TC_279_addProjectButtonVisibility_Editor("29");
        Assert.assertTrue(isVisible, "Add Project button is not visible.");
    }

    @Test(priority = 7)
    public void TC_285_addProjectForClient() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_285_addProjectForClient("azzx","New Project", "Description", "Notes");
        Assert.assertTrue(isSuccess, "Failed to add project for client.");
    }

    @Test(priority = 8)
    public void TC_286_editClientProjectTest() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_286_editClientProjectTest_Editor("Updated Project", "Updated Description", "Updated Notes", "29", "TCS");
        Assert.assertTrue(isSuccess, "Failed to edit client project.");
    }

    @Test(priority = 9)
    public void TC_287_deleteProject() {
        ClientTabPages clientTabPages = new ClientTabPages(driver);
        boolean isSuccess = clientTabPages.TC_287_deleteProject_Editor("azzx",'Y');
        Assert.assertTrue(isSuccess, "Failed to delete project.");
    }
}
