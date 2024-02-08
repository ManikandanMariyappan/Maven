package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class HomePage extends SeleniumBaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fa fa-lock']")
	private WebElement signUpLogin;

	public WebElement getSignUpLogin() {
		return signUpLogin;
	}
	
	
}