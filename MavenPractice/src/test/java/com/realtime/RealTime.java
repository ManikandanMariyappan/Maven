package com.realtime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.baseclass.SeleniumBaseClass;
import com.realtimepojo.AccountCreatedPage;
import com.realtimepojo.DeletedAccountPage;
import com.realtimepojo.HomePage;
import com.realtimepojo.NewUserSignUpPage;
import com.realtimepojo.SignUpDetailsPage;
import com.realtimepojo.ValidateUserName;

public class RealTime extends SeleniumBaseClass{

	@BeforeClass
	private void openWebsite() {
		chromeBrowser();
		
	}
	
	@AfterClass
	private void closeWebsite() throws InterruptedException {
		
		Thread.sleep(5000);
//		closeBrowser();
	}
	
	@Test
	@Parameters("Browser")
	private void registerUser(String names) {
		
		if (names.equals("Chrome")) {
			
			driver = new ChromeDriver();
			
		} else if(names.equals("FireFox")) {
			
			driver = new FirefoxDriver();

		}	else if(names.equals("Edge")){
			
			driver = new EdgeDriver();
			
		}
		launchURL("https://automationexercise.com/");
		maximizeWindow();
		waitForTenSec();
		
		HomePage h = new HomePage();
		WebElement signUpLogin = h.getSignUpLogin();
		
		if (signUpLogin.isEnabled()) {
			System.out.println("Home Page is visible successfully");
		}
		else {
			System.out.println("HomePage is not visible");
		}
		
		click(signUpLogin);
		
		NewUserSignUpPage n = new NewUserSignUpPage();
		
		WebElement gettextSignUp = n.gettextSignUp();
		
		if (gettextSignUp.isDisplayed()) {
			
			System.out.println("'New User Signup!' is visible");
			
		} else {
			
			System.out.println("'New User Signup!' is not visible");
		}
		
		WebElement nameSignUp = n.getNameSignUp();
		passValue(nameSignUp, "Harry");
		
		WebElement emailSignUp = n.getEmailSignUp();
		
		passValue(emailSignUp, "murkajumli@gum7.com");
		
		WebElement submitSignUp = n.getSubmitSignUp();
		click(submitSignUp);
		
		SignUpDetailsPage s = new SignUpDetailsPage();
		
		WebElement textAccountInfo = s.getTextAccountInfo();
		if (textAccountInfo.isDisplayed()) {
			
			System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
			
		} else {
			
			System.out.println("'ENTER ACCOUNT INFORMATION' is not visible");
			
		}
		
		WebElement genderRadio = s.getGenderRadio();
		click(genderRadio);
		
		WebElement name = s.getUserName();
		name.clear();
		passValue(name, "Harry");
		
		WebElement password = s.getPassword();
		passValue(password, "Wrong!Password");
		
		WebElement day = s.getDay();
		selectDropDownByValue(day, "7");
		
		WebElement month = s.getMonth();
		selectDropDownByIndex(month, 5);
		
		WebElement year = s.getYear();
		selectDropDownByValue(year, "1998");
		
		WebElement newsletter = s.getNewsletter();
		click(newsletter);
		
		WebElement offers = s.getOffers();
		click(offers);
		
		WebElement firstName = s.getFirstName();
		passValue(firstName, "Harry");
		
		WebElement lastName = s.getLastName();
		passValue(lastName, "Potter");
		
		WebElement companyName = s.getCompanyName();
		passValue(companyName, "Hogwarts");
		
		WebElement addressOne = s.getAddressOne();
		passValue(addressOne, "4 Privet Drive");
		
		WebElement addressTwo = s.getAddressTwo();
		passValue(addressTwo, "England");
		
		WebElement countryName = s.getCountryName();
		selectDropDownByIndex(countryName, 3);
		
		WebElement stateName = s.getStateName();
		passValue(stateName, "Surrey");
		
		WebElement cityName = s.getCityName();
		passValue(cityName, "Vernon");
		
		WebElement zipCode = s.getZipCode();
		passValue(zipCode, "765876");
		
		WebElement mobileNumber = s.getMobileNumber();
		passValue(mobileNumber, "987654321");
		
		WebElement createAccountButton = s.getCreateAccountButton();
		click(createAccountButton);
		
		AccountCreatedPage a = new AccountCreatedPage();
		
		WebElement textValidation = a.getTextValidation();
		if (textValidation.isDisplayed()) {
			
			System.out.println("'ACCOUNT CREATED!' is visible");
		}
		else
			
		{
			System.out.println("'ACCOUNT CREATED!' is not visible");
			
		}
		
		WebElement continueButton = a.getContinueButton();
		click(continueButton);
		
		ValidateUserName v = new ValidateUserName();
		
		WebElement userNameValidation = v.getUserNameValidation();
		getTagText(userNameValidation);

		WebElement deleteAccount = v.getDeleteAccount();
		click(deleteAccount);
		
		DeletedAccountPage d = new DeletedAccountPage();
		
		WebElement deleteAccount2 = d.getDeleteAccount();
		
		Assert.assertTrue(deleteAccount2.isDisplayed(), "Displaying");
		
		System.out.println("ACCOUNT DELETED!' is visible");
		
		WebElement deleteContinueButton = d.getDeleteContinueButton();
		
		click(deleteContinueButton);
	}
	
}