package DataProvider;

import org.testng.annotations.DataProvider;

public class chargeActivityTabDataProvider {
	@DataProvider(name = "searchchargecode")
    public Object[][] searchchargecode() {
	 return new Object[][] {
		 {"HT-DTS-NB01"},
		 {"JMJMFEB001"}
	 };
}
}