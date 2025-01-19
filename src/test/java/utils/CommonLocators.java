package utils;

import org.openqa.selenium.By;

public class CommonLocators {
	
	// Locators for Microsoft Teams Login
	public By usernameField = By.id("i0116");
    public By nextButton = By.id("idSIButton9");
    public By passwordField = By.id("i0118");
    public By signInButton = By.id("idSIButton9");
	
    // Locators for navigating to Timesheet in teams app
    public By teams = By.id("2a84919f-59d8-4441-a975-2a8c2643b741");
	public By timeSheet_QA = By.cssSelector("#\\31 9\\:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1\\@thread\\.tacv2 > span > div > div > div.fui-Flex.___qj3tpe0.f22iagw.f1a3p1vp");
    public By timeSheetGeneral = By.xpath("//*[@id=\"channel-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2\"]/a");
    public By timeSheetTab = By.xpath("//*[@id=\"tab::b4f5eb53-5d7d-47e6-87da-dae0338d347c\"]/span[1]/div/div");
    
    
	// Locators for Access Type Role Selection
	public By iframeLocator1 = By.id("fullscreen-app-host");
	public By iframeLocator2 = By.id("cacheable-iframe:a6b63365-31a4-4f43-92ec-710b71557af9");
    public By RLroleBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");
    
    public By EditorRoleBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");
    
    public By PLRoleBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(3) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");
    
    public By ViewerRoleBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");
    
    public By HRRoleBtn = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");    
    public By EmployeeRoleBtn = By.cssSelector(
            "#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(4) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button > div");
    
}
//#publishedCanvas > div > div.app-canvas > div:nth-child(3) > div > div > div:nth-child(3) > div > div > div > div > div.virtualized-gallery > div > div > div:nth-child(1) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(2) > div > div > div > div > button

