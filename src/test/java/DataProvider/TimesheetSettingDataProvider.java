package DataProvider;

import org.testng.annotations.DataProvider;

public class TimesheetSettingDataProvider {

	@DataProvider(name = "AddTimesheetSetting")
	public Object[][] AddTimesheetSetting() {
		return new Object[][] { { "Kaushik", "Amazon", "Shillong", "note", "10-Jan-2025", "31-Jan-2025" } };
	}

	@DataProvider(name = "AddTimesheetSettingPL")
	public Object[][] AddTimesheetSettingPL() {
		return new Object[][] { { "Kaushik", "Amazon", "Shillong", "note", "10-Jan-2025", "31-Jan-2025" } };
	}

	@DataProvider(name = "AddTimesheetSettingEditor")
	public Object[][] AddTimesheetSettingEditor() {
		return new Object[][] { { "Kaushik", "Amazon", "Shillong", "note", "10-Jan-2025", "31-Jan-2025" } };
	}

	@DataProvider(name = "searchEmp")
	public Object[][] searchEmp() {
		return new Object[][] { { "Kaushik" } };
	}

	@DataProvider(name = "searchClient")
	public Object[][] searchClient() {
		return new Object[][] { { "Bullets" } };
	}
	
	@DataProvider(name = "sendLocation")
	public Object[][] sendlocation() {
		return new Object[][] { { "Shillong" } };
	}

}