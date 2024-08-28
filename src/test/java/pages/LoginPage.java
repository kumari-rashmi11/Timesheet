package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    public By usernameField_loc = By.id("i0116");
    public By nextButton_loc = By.id("idSIButton9");
    public By passwordField_loc = By.id("i0118");
    public By signInButton_loc = By.id("idSIButton9");
    public By staySignedInButton_loc = By.id("idSIButton9");

    // Action methods
    public void setUserName(String user) {
        WebElement usernameField = driver.findElement(usernameField_loc);
        usernameField.sendKeys(user);
    }

    public void clickNext() {
        WebElement nextButton = driver.findElement(nextButton_loc);
        nextButton.click();
    }

    public void setPassword(String pwd) {
        WebElement passwordField = driver.findElement(passwordField_loc);
        passwordField.sendKeys(pwd);
    }

    public void clickSignIn() {
        WebElement signInButton = driver.findElement(signInButton_loc);
        signInButton.click();
    }

    public void clickStaySignedIn() {
        WebElement staySignedInButton = driver.findElement(staySignedInButton_loc);
        staySignedInButton.click();
    }
}
