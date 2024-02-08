package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class AccountCreatedPage extends SeleniumBaseClass{
	
	public AccountCreatedPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[text()='Account Created!']")
	private WebElement textValidation;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement continueButton;

	public WebElement getTextValidation() {
		return textValidation;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	}
