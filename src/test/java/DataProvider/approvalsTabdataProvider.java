package DataProvider;

import org.testng.annotations.DataProvider;

public class approvalsTabdataProvider {
	
	 @DataProvider(name = "weekSelectionDataProvider")
	    public Object[][] provideWeekSelectionData() {
	        return new Object[][] {
	            { "12 Jan - 18 Jan, 2025", "2025" },
	        };
	    }
	 
	 @DataProvider(name = "statusSelectionDataProvider")
	    public Object[][] provideStatusSelectionData() {
	        return new Object[][] {
	            { "All", "2025" },
	        };
	    }
	 @DataProvider(name = "reporteesSelectionDataProvider")
	    public Object[][] provideReporteesSelectionData() {
	        return new Object[][] {
	            { "Uddhav Gupta(1509)" },
	            { "Monalisha Rabha(1510)" },

	        };
	    }
	  @DataProvider(name = "yearSelectionDataProvider")
	    public Object[][] provideYearSelectionData() {
	        return new Object[][] {
	            { "2024" },
	            { "2025" },
	        };
	    }
	  
	  @DataProvider(name = "ApproveTimesheetDataProvider")
	  public Object[][] ApproveTimesheetDataProvider() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025", "Monalisha Rabha(1510)" }
	          
	        	      };
	  }
	  @DataProvider(name = "RejectTimesheetDataProvider")
	  public Object[][] RejectTimesheetDataProvider() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025", "Monalisha Rabha(1510)" }
	          
	        	      };
	  }
	  @DataProvider(name = "DataVisibilityDataProvider")
	    public Object[][] DataVisibility() {
	        return new Object[][] {
	        	 { "19 Jan - 25 Jan, 2025", "2025","All" }

	        };
	    }
	  @DataProvider(name = "DataVisibilityPRDataProvider")
	    public Object[][] DataVisibility_particularReportee() {
	        return new Object[][] {
	        	 { "19 Jan - 25 Jan, 2025", "2025","All","Monalisha Rabha(1510)" }

	        };
	    }
	  
	  @DataProvider(name = "notResetingDataProvider")
	    public Object[][] notresetingDataProvider() {
	        return new Object[][] {
	        	 { "All", "2025","19 Jan - 25 Jan, 2025","Monalisha Rabha(1510)"}

	        };
	    }
	  
	  @DataProvider(name = "PartiallyApproveTimesheetDataProvider")
	  public Object[][] PartiallyApproveTimesheetDataProvider() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025", "Monalisha Rabha(1510)","All" }
	          
	        	      };
	  }
    @DataProvider(name = "holidayMarkingDataProvider")
	        		  public Object[][] HolidayDataProvider() {
	        		      return new Object[][] {
	        		          { "All","19 Jan - 25 Jan, 2025", "2025" }
	        		          
	        		        	      };
}
    
    @DataProvider(name = "plAndreporteesSelectionDataProvider")
    public Object[][] PlReporteesSelectionData_Editor() {
        return new Object[][] {
            {"Vivek Rajput","Uddhav Gupta(1509)" }

        };
    }
	  @DataProvider(name = "ApproveTimesheetDataProvider_Editor")
	  public Object[][] ApproveTimesheetDataProvider_Editor() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025", "Vivek Rajput","Monalisha Rabha(1510)" }
	          
	        	      };
	  }
	  @DataProvider(name = "RejectTimesheetDataProvider_Editor")
	  public Object[][] RejectTimesheetDataProvider_Editor() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025", "Vivek Rajput","Monalisha Rabha(1510)" }
	          
	        	      };
	  }
	  @DataProvider(name = "PartiallyApproveTimesheetDataProvider_Editor")
	  public Object[][] PartiallyApproveTimesheetDataProvider_Editor() {
	      return new Object[][] {
	          { "19 Jan - 25 Jan, 2025", "2025","Vivek Rajput", "Monalisha Rabha(1510)","All" }
	          
	        	      };
}
	  @DataProvider(name = "dataVisibilityDataProvider_Editor")
	  public Object[][] dataVisibilityDataProvider_Editor() {
	      return new Object[][] {
	          {  "Vivek Rajput","19 Jan - 25 Jan, 2025"}
	          
	        	      };
}
	  @DataProvider(name = "SearchAndRefresh_Timesheet_RL")
	  public Object[][] searchAndRefreshOperationData_Rl() {
	      return new Object[][] {
	          {  "2025","All","19 Jan - 25 Jan, 2025","Vivek Rajput"}
	          
	        	      };
}  
}