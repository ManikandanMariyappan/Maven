package com.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	
	public static WebElement element;
	
	public static Select s;

	public static void chromeBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void edgeBrowser() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	public static void firefoxBrowser() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}
	
	public static void waitForTenSec() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public static void passURL(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void passValueById(String id, String value) {

		driver.findElement(By.id(id)).sendKeys(value);
	}

	public static void passValueByClassName(String name, String value) {

		driver.findElement(By.name(name)).sendKeys(value);
	}

	public static void passValueByXpath(String xpath, String value) {

		driver.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public static void clickById(String id) {

		driver.findElement(By.id(id)).click();
	}

	public static void clickByClassName(String name) {

		driver.findElement(By.name(name)).click();
	}

	public static void selectDropDownByIndex(String id, int index) {

		element = driver.findElement(By.id(id));

		s = new Select(element);

		s.selectByIndex(index);

	}

	public static void selectDropDownByValue(String name, String value) {

		element = driver.findElement(By.name(name));

		s = new Select(element);

		s.selectByValue(value);

	}
	
	public static void selctDropDownByVisibleText(String name, String value) {

		WebElement element = driver.findElement(By.name(name));

		s = new Select(element);

		s.selectByVisibleText(value);

	}
	
	public static void getValue(String id) {

		element = driver.findElement(By.id(id));
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
}
