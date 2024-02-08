package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name) {
		if (name.equals("Chrome")) {
			
			driver = new ChromeDriver();
			
		} else if(name.equals("FireFox")) {
			
			driver = new FirefoxDriver();

		}	else if(name.equals("Edge")){
			
			driver = new EdgeDriver();
			
		}
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
	}
}

