package com.task;

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.SeleniumBaseClass;
import com.fbpojoclass.FacebookLoginPage;

public class TestNGFacebook extends SeleniumBaseClass{
	
	@BeforeClass
	public void openBrowser() {
		
		chromeBrowser();
		maximizeWindow();
	}
	
	@AfterClass
	public void closingBrowser() {
		
		closeBrowser();
	}
	
	@BeforeMethod
	public void getStartTime() {
		
		Date da = new Date();
		System.out.println("TestCase Started on "+da);
	}
	
	@AfterMethod
	public void getEndTime() {
		
		Date da = new Date();
		System.out.println("TestCase Ended on "+da);
	}
	
	@Test(enabled = false)
	public void tc01() throws InterruptedException, IOException {
		
		launchURL("https://www.facebook.com");
		waitForTenSec();
		FacebookLoginPage l = new FacebookLoginPage();
		WebElement emailField = l.getEmailField();
		passValue(emailField, "Manikandan");
		WebElement passwordField = l.getPasswordField();
		passValue(passwordField, "NotWorking");
		WebElement loginButton = l.getLoginButton();
		click(loginButton);
		Thread.sleep(3000);
	}
	
	@Test(enabled = false)
	public void tc03() throws InterruptedException, IOException {
		
		launchURL("https://www.facebook.com");
		waitForTenSec();
		FacebookLoginPage l = new FacebookLoginPage();
		WebElement emailField = l.getEmailField();
		passValue(emailField, "Rajesh");
		WebElement passwordField = l.getPasswordField();
		passValue(passwordField, "NotWorking");
		WebElement loginButton = l.getLoginButton();
		click(loginButton);
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"user","password"})
	public void tc02(@Optional("Hello") String s1, @Optional("hai") String s2) throws InterruptedException, IOException {
		
		launchURL("https://www.facebook.com");
		waitForTenSec();
		FacebookLoginPage l = new FacebookLoginPage();
		WebElement emailField = l.getEmailField();
		passValue(emailField, s1);
		WebElement passwordField = l.getPasswordField();
		passValue(passwordField, s2);
		WebElement loginButton = l.getLoginButton();
		Thread.sleep(3000);
		click(loginButton);
		Thread.sleep(3000);
	}
}
