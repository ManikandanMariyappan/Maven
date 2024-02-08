package com.task;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.baseclass.SeleniumBaseClass;
import com.fbpojoclass.FacebookLoginPage;

public class FaceBookPojoLogin extends SeleniumBaseClass {
	
	FacebookLoginPage f = new FacebookLoginPage();
	
	@BeforeClass
	public static void beforeAllClass() {
		
		edgeBrowser();
		maximizeWindow();
		launchURL("https:\\www.facebook.com");
		waitForTenSec();
	}
	
	@AfterClass
	public static void afterAllClass() {
		
		closeTab();
	}

	@Before
	public void beforeEachClass() {
		
		System.out.println("Test Case Strated");
		printCurrentDate();
	}
	
	@After
	public void afterEachClass() {
		
		printCurrentDate();
		System.out.println("Test Case Ended");	
	}
	
	@Test
	public void testCase1() {
		
		WebElement emailField = f.getEmailField();
		passValue(emailField, "Sony");
		WebElement passwordField = f.getPasswordField();
		passValue(passwordField, "SouthMusic");
	}
	@Test
	public void testCase2() {
		
		printCurrentUrl();
		WebElement loginButton = f.getLoginButton();
		click(loginButton);
	}
	@Test
	public void testCase3() {
		
		printTitle();
		
	}
}