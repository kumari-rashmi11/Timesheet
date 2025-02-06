package DataProvider;

import org.testng.annotations.DataProvider;

public class TaskAllocationDataProvider {

	@DataProvider(name = "createTaskRL")
	public Object[][] createTaskforRL() {
		return new Object[][] { { "Timezone  test2", "Amazon", "Alexa", "JMJMA0B004", "Analysis", "1153", "Yes",
			"31-Feb-2025", "Testing to verify", "Enhancement-WOFCO"}

		};
	}
	@DataProvider(name = "search")
	public Object[][] SearchEmp() {
		return new Object[][] { 
			{ "Additional Support" }
		};
	}
	
	@DataProvider(name = "allocateHour")
	public Object[][] allocateHour() {
		return new Object[][] { 
			{ 1 ,2}
		};
	}
	
	@DataProvider(name = "editAllocateHour")
	public Object[][] editAllocateHour() {
		return new Object[][] { 
			{ 10 }
		};
	}
	
	@DataProvider(name = "AllocateHourAboveConsumed")
	public Object[][] AllocateHourAboveConsumed() {
		return new Object[][] { 
			{ "1500" }
		};
	}
	@DataProvider(name = "EditTaskRL")
	public Object[][] editTakforRL() {
		return new Object[][] {
				// task name, hour, note
				{ "Additional Support", "100", "notes" },

		};
	}
}