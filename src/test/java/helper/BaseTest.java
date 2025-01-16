package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.cdimascio.dotenv.Dotenv;

public class BaseTest {
	
	Dotenv dotenv = Dotenv.load();
    String username = dotenv.get("UNAME").trim();
    String password = dotenv.get("PASSWORD").trim();

    public WebDriver driver;
    public WebDriverWait wait;
    
    public Properties properties = new Properties();
    
    private void loadProperties() {
        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\RashmiKumari\\Desktop\\timesheetAutomation-main\\config.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
    	loadProperties();
    	driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        
       
//        
//        NavigateToTimesheet nt = new NavigateToTimesheet(driver);
//    	nt.clickTeamsBtn();
//    	nt.clickTimesheetBtn();
//    	nt.clickTimesheetGeneral();
//    	nt.clickTimesheetLink();
    	
    	
    	
    	
    	RoleSelection roleSelectionPage = new RoleSelection(driver);
//        roleSelectionPage.switchToIframe();
        // Select the desired role 
    	roleSelectionPage.timesheetNavigation();
        roleSelectionPage.iframeSwitch1();
        roleSelectionPage.iframeSwitch2();
        roleSelectionPage.PLRoleBtn();
    	
		
    }
    
    
}
