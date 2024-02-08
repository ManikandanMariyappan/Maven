package com.fbpojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class FacebookLoginPage extends SeleniumBaseClass{
	
	public FacebookLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(name = "pass")
	private WebElement passwordField;
	
	@FindBy(name="login")
	private WebElement loginButton;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
