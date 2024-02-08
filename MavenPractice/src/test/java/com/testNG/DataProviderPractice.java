package com.testNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.baseclass.SeleniumBaseClass;
import com.dataprovider.DataProviderData;
import com.fbpojoclass.FacebookLoginPage;

public class DataProviderPractice extends SeleniumBaseClass{
	
	@BeforeClass
	private void browserConfig() {
		
		chromeBrowser();
		maximizeWindow();		
	}
	
	@BeforeMethod
	private void launchingUrl() {
		launchURL("https://www.facebook.com");
	}
	
	@AfterClass
	private void closingBrowser() {
		closeTab();
	}
	
	@Test(dataProvider = "facebookdata", dataProviderClass = DataProviderData.class)
	private void loginTestCase(String username, String password) throws InterruptedException {
		
		FacebookLoginPage l = new FacebookLoginPage();
		
		WebElement emailField = l.getEmailField();
		passValue(emailField, username);
		
		WebElement passwordField = l.getPasswordField();
		passValue(passwordField, password);
		
		Thread.sleep(1500);
		
		WebElement loginButton = l.getLoginButton();
		click(loginButton);
		
		Thread.sleep(3500);
	}
}
