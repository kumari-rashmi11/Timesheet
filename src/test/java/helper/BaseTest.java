package helper;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.RoleSelectionPage;
 
 
public class BaseTest {
 
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
    public void beforeMethod() {

    	
    	loadProperties();
    	EdgeOptions options = new EdgeOptions();
    	driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	NavigateToTimesheet nt = new NavigateToTimesheet(driver);
    	nt.clickTeams();
    	nt.clickTimsheetQA();
    	nt.clickTimesheetGeneral();
    	nt.clickTimesheetTab();
    	

        RoleSelectionPage roleSelectionPage = new RoleSelectionPage(driver);
        roleSelectionPage.switchToIframe();
        // Select the desired role 
//        roleSelectionPage.iframeSwitch1();
//        roleSelectionPage.iframeSwitch2();
        roleSelectionPage.selectRLRole();

    }
}
    