package com.junit;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JunitFB {
	
	static WebDriver driver;

	@BeforeClass
	public static void beforeAllTestCase() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	
	@AfterClass
	public static void afterAllTestCase() {
		
		driver.quit();
	}
	
	@Before
	public void beforeEachTestCase() {
		
	System.out.println("Test Case Started");
	Date d = new Date();
	System.out.println(d);
	}
	
	@After
	public void afterEachTestCase() {
		
		System.out.println("Test Case Ended");
		Date d =  new Date();
		System.out.println(d);
	}
	
	@Test
	public void testCase1() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void testCase2() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("Apple Inc");
		driver.findElement(By.name("pass")).sendKeys("Steve Jobs");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void testCase3() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
}
