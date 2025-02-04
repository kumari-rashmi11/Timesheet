package DataProvider;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;

public class EmployeeTabDataProvider {
	 @DataProvider(name = "employeeData")
	    public Object[][] getEmployeeData() {
		 return new Object[][] {
			 {"John", "Doe", "1001", "john.doe@example.com"},
			 
	          {"Alice", "Johnson", "1003", "alice.johnson@example.com"} 
	        	
		 };

	 }
	 @DataProvider(name = "searchemployee")
	    public Object[][] searchemployee() {
		 return new Object[][] {
			 {"Abhishek Banerjee"},
		 };	 
	 }
	 
	 @DataProvider(name = "selectemployee")
	    public Object[][] selectemployee() {
		 return new Object[][] {
			 {"Abhishek Banerjee"},
		 };	 
	 }
}

	