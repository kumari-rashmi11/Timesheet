package utils;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class EvalSettingLocators {
	private WebDriverWait wait;
	//TC-165
	public By evalSettingTab_editor = By.xpath("//div[position()=9]/div[contains(@class, 'canvasContentDiv') and contains(@class, 'container_1vt1y2p')]/div/div[position()=1]//button//*[contains(@class, 'appmagic-button') and contains(@class, 'center') and contains(@class, 'middle')]");
	//TC-166
	public By evaluationTab_editor = By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']//div[5]//div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[1]//div[contains(@class, 'canvasContentDiv') and contains(@class, 'container_1vt1y2p')]//div[1]//button/div");
	public By evaluationCategoriesTab_editor = By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']//div[5]//div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[2]//div[contains(@class, 'canvasContentDiv') and contains(@class, 'container_1vt1y2p')]//div[1]//button/div");

	public By EvaluationEligibilityTab_editor = By.xpath("//div[@id='publishedCanvas']//div[@class='app-canvas']//div[5]//div[7]//div[@role='list']//div[@class='react-gallery-items-window']/div[3]//div[contains(@class, 'canvasContentDiv') and contains(@class, 'container_1vt1y2p')]//div[1]//button/div");
 
	public By employeeFieldInputSelect_editor = By.xpath("(//div[@id='publishedCanvas']//div[@class='app-canvas']//div[@role='presentation']//input[@role='combobox'])[2]");
	public By employeeDropDownButton_editor= By.xpath("(//div[@id='publishedCanvas']//div[@class='app-canvas']//div[@role='presentation']//div[@role='presentation']//div//div//button[@role='presentation'])[2]");
	public By employeeSelectionFromDropDown_editor = By.xpath("//*[@role]//*[@role='option'][1]");
	public By statusFieldInputSelect_editor = By.xpath("(//div[@id='publishedCanvas']//div[@class='app-canvas']//div[@role='presentation']//input[@role='combobox'])[1]");
	public By employeeSelectionRefreshButton_editor = By.xpath("/html//div[@id='publishedCanvas']/div/div[contains(@class, 'app-canvas')]/div[5]/div/div/div[15]//div[contains(@class, 'react-knockout-control')]/div");
	public By reviewPreiodButton_editor = By.xpath("(//div[contains(@id, 'dropdown_')]/div/div[2])[1]");
    public By reviewPeriodSelect_editor = By.xpath("(//*[contains(@id, 'appmagic-dropdownFlyoutdropdown_siena_')])[5]");
 
	public By refreshButton_editor = By.xpath("(//*[@id=\"publishedCanvas\"]//div[position()=1]//div[position()=5]//div[position()=5]//div)[3]");
	public By activeCategory_editor = By.xpath("(//*[@id=\"publishedCanvas\"]//div[position()=1]//div[position()=5]//div[position()=18]//div//button)[1]");
	public By archivedCategory_editor = By.xpath("(//*[@id=\\\"publishedCanvas\\\"]//div[position()=1]//div[position()=5]//div[position()=18]//div//button)[2]");
	public By categoryRefresh_editor = By.xpath("(//*[@id=\"publishedCanvas\"]//div[position()=1]//div[position()=5]//div[position()=6]//div)[4]");
	public By categorySearch_editor = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[5]/div/div/div/div/input");

 
	public By evalSettingTab_HR = By.cssSelector("div:nth-of-type(9) > .canvasContentDiv.container_1vt1y2p > div > div:nth-of-type(1) button > .appmagic-button.center.middle");
 
	public EvalSettingLocators(WebDriver driver) {
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	public void test_editor() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_editor));
        eval.click();
	}
	public void test_HR() {
		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_HR));
        eval.click();
	}
//	public void test_PL() {
//		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_PL));
//        eval.click();
//	}
//	public void test_Viewer() {
//		WebElement eval = this.wait.until(ExpectedConditions.visibilityOfElementLocated(evalSettingTab_Viewer));
//        eval.click();
//	}
}
