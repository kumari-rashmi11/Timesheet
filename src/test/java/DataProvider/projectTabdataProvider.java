package DataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import pages.ProjectTab;

public class projectTabdataProvider {
	
	 @DataProvider(name = "projectDataProvider")
	    public Object[][] provideProjectData() {
	        return new Object[][] {
	        	
	            { "Amazon",  "Project Notes 1", "Project Description 1" },
	            { "Alpha",  "Project Notes 2", "Project Description 2" },
	        };
	    }
	 @DataProvider(name = "searchProject")
	    public Object[][] searchProjectData() {
	        return new Object[][] {
	        	
	            { "projectName15",}
	        };
	    }
	   @DataProvider(name = "addChargeCodeDataProvider")
	    public Object[][] provideAddChargeCodeData() {
	        return new Object[][] {
	            { "projectName71", "SETUDS14", "Planning", "Admin", "Charge Code Notes", "Charge Code Description" }
	        };
	    }

	    @DataProvider(name = "editProjectDataProvider")
	    public Object[][] provideEditProjectData() {
	        return new Object[][] {
	            { "projectName89", "Updated project description", "Updated project notes", "Alpha" },
	    
	        };
	    }
}