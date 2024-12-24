package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonLocators;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	CommonLocators locator;
    Interactions interact;
    
	// Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.locator = new CommonLocators();
        this.interact = new Interactions(driver);
    }
    
    // Action methods
    public void setUserName(String user) {
        interact.sendingKeys(locator.usernameField, user);
    }

    public void clickNext() {
        interact.clickElement(locator.nextButton);
    }

    public void setPassword(String pwd) {
        interact.sendingKeys(locator.passwordField, pwd);
    }

    public void clickSignIn() {
        interact.clickElement(locator.signInButton);
    }
}
