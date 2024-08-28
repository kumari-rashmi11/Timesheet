package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class AddEmployeePage {
	
	private WebDriverWait wait;
	private WebDriver driver;
	
	public By employeeTab = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(9) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1) > div > div > div > div > button > div");
	private By addEmployeeButton = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(18) > div > div > div > div > button > div");
	private By firstNameField = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[9]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/input");  
	private By lastNameField = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[9]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/input");    
	private By employeeNumberField = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[9]/div/div/div/div/div[1]/div/div/div/div[4]/div/div/div/div[3]/div/div/div/div/input"); 
	private By emailField = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[9]/div/div/div/div/div[1]/div/div/div/div[5]/div/div/div/div[3]/div/div/div/div/input");  
	
	public AddEmployeePage(WebDriver driver) {
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void addNewEmployee() {
		WebElement employeeTabElement =  wait.until(ExpectedConditions.elementToBeClickable(employeeTab));
		employeeTabElement.click();
	}
	
	public void clickAddEmployeeButton() {
		WebElement addEmployeeBtnElement = wait.until(ExpectedConditions.elementToBeClickable(addEmployeeButton));
		addEmployeeBtnElement.click();
	}
	
	public void enterFirstName() {
		WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
		firstNameElement.sendKeys("Rashmi");
	}

	public void enterLastName() {
		WebElement lastNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
		lastNameElement.sendKeys("Kumari");
	}

	public void enterEmployeeNumber() {
		WebElement employeeNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNumberField));
		employeeNumberElement.sendKeys("123");
	}
	
	public void enterEmail() {
		WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
		emailElement.sendKeys("testing123@gmail.com");
	}

	
	
}
