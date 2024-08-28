package Timesheet_Test;

import java.time.Duration;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    Dotenv dotenv = Dotenv.load();
    String username = dotenv.get("UNAME").trim();
    String password = dotenv.get("PASSWORD").trim();

    WebDriver driver;
    WebDriverWait wait;

    public Properties properties = new Properties();

    @BeforeClass
    public void setup() {
        loadProperties(); // Load properties before setting up the driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait
    }

    private void loadProperties() {
        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\RashmiKumari\\Desktop\\timesheetAutomation-main\\config.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        LoginPage lp = new LoginPage(driver);			

        // Wait for the username field to be visible and enter the username
        wait.until(ExpectedConditions.visibilityOfElementLocated(lp.usernameField_loc));
        lp.setUserName(username);

        // Wait for the next button to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(lp.nextButton_loc)).click();

        // Wait for the password field to be visible and enter the password
        wait.until(ExpectedConditions.visibilityOfElementLocated(lp.passwordField_loc));
        lp.setPassword(password);

        // Wait for the sign-in button to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(lp.signInButton_loc)).click();

        // Wait for the 'Stay Signed In' button to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(lp.staySignedInButton_loc)).click();

        // Wait for the page title to be as expected
        wait.until(ExpectedConditions.titleIs("Timesheet - Power Apps"));
    }

//    @AfterClass
////    public void tearDown() {
////        driver.quit();
////    }
}
