package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class NewUserSignUpPage extends SeleniumBaseClass{
	
	public NewUserSignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='New User Signup!']")
	private WebElement textSignUp;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement nameSignUp;
	
	@FindBy(xpath = "(//input[@type='email'])[2]")
	private WebElement emailSignUp;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submitSignUp;

	public WebElement gettextSignUp() {
		return textSignUp;
	}

	public WebElement getNameSignUp() {
		return nameSignUp;
	}

	public WebElement getEmailSignUp() {
		return emailSignUp;
	}

	public WebElement getSubmitSignUp() {
		return submitSignUp;
	}
	
	
}
