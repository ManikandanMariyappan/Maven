package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBaseClass {

	public static WebDriver driver;
	
	public static void chromeBrowser() {

		 driver = new ChromeDriver();
	}

	public static void edgeBrowser() {

		driver = new EdgeDriver();
	}

	public static void firefoxBrowser() {

		driver = new FirefoxDriver();
	}

	public static void launchURL(String url) {

		driver.get(url);
	}

	public static void maximizeWindow() {

		driver.manage().window().maximize();
	}

	public static void minimizeWindow() {

		driver.manage().window().maximize();
	}
	
	public static void waitForTenSec() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void printCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void printTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void closeTab() {
		
		driver.close();
	}
	
	public static void closeBrowser() {
		
		driver.quit();
	}
	
	public static void printCurrentDate() {
		
		Date date = new Date();
		System.out.println(date);
	}

	public static void passValue(WebElement element, String locator) {

		element.sendKeys(locator);
	}

	public static void click(WebElement element) {

		element.click();
	}
	
	public static void selectDropDownByValue(WebElement element, String Value) {
		
		Select s = new Select(element);
		s.selectByValue(Value);
	}
	
	public static void selectDropDownByIndex(WebElement element, int index) {
		
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void getAttributeText(WebElement element) {
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	public static void getTagText(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
		
	}
	
	public static void navigationTo(String url)	{
		
		driver.navigate().to(url);
	}
	
	public static void navigationBack() {
		
		driver.navigate().back();
	}
	
	public static void navigationForward() {
		
		driver.navigate().forward();
	}
	
	public static void navigationRefresh() {
		
		driver.navigate().refresh();
	}
	
	public static void dragAndDropAction(WebElement source, WebElement target) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	
	public static void mouseHoverAction(WebElement target) {
		
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	public static void doubleClickAction(WebElement target) {
		
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}
	
	public static void contextClickAction(WebElement target) {
		
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}
	
	public static void keyPressDownRobot() throws AWTException {
	
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void keyReleaseDownRobot() throws AWTException {
		
		Robot a = new Robot();
		a.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void acceptAlert() {
		
		driver.switchTo().alert().accept();;
	}
	
	public static void dismissAlert() {
		
		driver.switchTo().alert().dismiss();
	}
	
	public static void sendKeysAlert(String value) {
		
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static void getTextAlert() {
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}
	
	public static void takeSnap() throws IOException {
		
		Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File tempLoc = tk.getScreenshotAs(OutputType.FILE);
		File myLoc = new File("C:\\Users\\Manikandan\\eclipse-workspace\\MavenPractice\\ScreenShots\\"+sdf.format(d)+".png");
		FileUtils.copyFile(tempLoc, myLoc);
	}
	
}