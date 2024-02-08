package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class ValidateUserName extends SeleniumBaseClass{
	
	public ValidateUserName() {
		
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//b[text()='Harry']")
	private WebElement userNameValidation;
	
	@FindBy(xpath = "//a[text()=' Delete Account']")
	private WebElement deleteAccount;
	
	public WebElement getUserNameValidation() {
		return userNameValidation;
	}

	public WebElement getDeleteAccount() {
		return deleteAccount;
	}
}
