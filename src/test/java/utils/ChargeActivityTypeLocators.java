package utils;

import org.openqa.selenium.By;

public class ChargeActivityTypeLocators {
	public By chargeCode = By.xpath("//div[contains(text(), 'HT-DTS-NB01')]");

	public By editIcon = By.xpath("//div[@data-control-name='Icon1_17']");

	public By deleteIcon = By.xpath("//div[@data-control-name='Icon3_7']");

	public By confirmDelete = By.xpath("//div[contains(text(), 'Yes')]//ancestor::button");

	public By saveEditedChargeActivityType = By
			.xpath("//div[contains(text(), 'Save')]//ancestor::button");

	public By addBtn = By.xpath("//div[normalize-space(text()) = 'Add']//ancestor::button");

	public By projectName = By.xpath("//div[@title='ProjectId']");

	public By selectProjectName = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'First_Project']");

	public By chargeCodeMenu = By.xpath("//div[@title='ChargeTypeOrCode']");

	public By selectchargeCode = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'HT-DTS-NB01']");

	public By activityType = By.xpath("//div[@title='ActivityType']");

	public By selectactivityType = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'Shadow']");
	
	public By editSelectactivityType = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'Planning']");

	public By task = By.xpath("//div[@title='Task']");

	public By selectTask = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'KLO']");
	
	public By addChargeActivityTypeBtn = By.xpath("//div[@data-control-name='Button7_13']");
	
	public By editSelectTask = By.xpath("//ul[@role='listbox']//child::li//child::span[text() = 'Admin']");

	public By chargeActivityType = By.xpath(
			"//div[contains(text(), 'Charge Activity Type')]//ancestor::div[@class='container_1f0sgyp']//child::div[position()=1]");

	public By search_Box = By.xpath("//input[@placeholder='Search here']");

	public By refreshIcon = By.xpath(
			"//div[@data-container-name='ChargeActivityType-container']//child::div[position()=1]//child::div[position()=8]");
}