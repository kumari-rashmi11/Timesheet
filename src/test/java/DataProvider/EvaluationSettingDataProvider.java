package DataProvider;

import org.testng.annotations.DataProvider;

public class EvaluationSettingDataProvider {

	@DataProvider(name = "sendBonusPercentage")
	public Object[][] selectEvaluateQuater() {
		return new Object[][] { { "2024 Q2", 203 }, { "2024 Q2", 20 }, { "2024 Q2", 0 } };
	}
	
	@DataProvider(name = "addCatagory")
	public Object[][] addCatagory() {
		return new Object[][] { { "new catagory","this is a new catagory new def"} };
	}

	@DataProvider(name = "year_quater_filter")
	public Object[][] year_quater_filter() {
		return new Object[][] { { "2024 Q2", "Q2", "2023" } };
	}

	@DataProvider(name = "EvaluatedQuater")
	public Object[][] EvaluatedQuater() {
		return new Object[][] { { "2024 Q1", "All" } };
	}
	
	@DataProvider(name = "quarterandstatus")
	public Object[][] quarterandstatus() {
		return new Object[][] { { "2024 Q1", "Evaluated" } };
	}

	@DataProvider(name = "SendStatus")
	public Object[][] SendStatus() {
		return new Object[][] { { "Rejected" } };
	}

	@DataProvider(name = "SearchActiveCatagory")
	public Object[][] SearchActiveCatagory() {
		return new Object[][] { { "new catagory" } };
	}

	@DataProvider(name = "deleteActiveCatagory")
	public Object[][] deleteActiveCatagory() {
		return new Object[][] { { "Test Delete" } };
	}

	@DataProvider(name = "deleteArchiveCatagory")
	public Object[][] deleteArchiveCatagory() {
		return new Object[][] { { "Delete Archive" } };
	}

	@DataProvider(name = "selectEmp")
	public Object[][] selectEmp() {
		return new Object[][] { { "Kaushik" } };
	}

	@DataProvider(name = "createEmpCycle")
	public Object[][] createEmpCycle() {
		return new Object[][] { { "Virat Kohli" } };
	}

	@DataProvider(name = "ArchiveCatagory")
	public Object[][] ArchiveCatagory() {
		return new Object[][] { { "archive", "archive description" } };
	}

	@DataProvider(name = "RejectToEmployee")
	public Object[][] RejectToEmployee() {
		return new Object[][] { { "2023 Q2", 33, "summary" } };
	}

	@DataProvider(name = "RejectToRL")
	public Object[][] RejectToRL() {
		return new Object[][] { { "2023 Q1", 33, "summary" } };
	}

	@DataProvider(name = "RejectQuarter")
	public Object[][] RejectQuarter() {
		return new Object[][] { { "2023 Q1", 33, "summary" } };
	}

	@DataProvider(name = "reviewQuarter")
	public Object[][] reviewQuarter() {
		return new Object[][] { { "2024 Q2", 33, "summary" } };
	}

}