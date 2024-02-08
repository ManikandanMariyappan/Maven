package com.testNG;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.SeleniumBaseClass;
import com.fbpojoclass.FacebookLoginPage;

public class AssertPractice extends SeleniumBaseClass{
	
	@BeforeClass
	private void openWeb() {
		chromeBrowser();
		maximizeWindow();
		launchURL("https://www.facebook.com");
		
	}
	
	@Test
	@Parameters({"emailUser", "passwordUser"})
	private void Facebook(@Optional("Hello") String email, @Optional("Hai") String password) {
		
		FacebookLoginPage f = new FacebookLoginPage();
		
		WebElement emailField = f.getEmailField();
		passValue(emailField, email);
		
		WebElement passwordField = f.getPasswordField();
		passValue(passwordField, password);
		
		WebElement loginButton = f.getLoginButton();
		click(loginButton);
		
		String currentUrl = driver.getCurrentUrl();
		
		SoftAssert s = new SoftAssert();
		
		s.assertTrue(currentUrl.contains("facebook"), "Assert True");
		s.assertAll();
		
	//	Assert.assertTrue(currentUrl.contains("apple"), "Assert True");
		
		System.out.println(currentUrl);
		
		
		
		
		
		
	}

}
