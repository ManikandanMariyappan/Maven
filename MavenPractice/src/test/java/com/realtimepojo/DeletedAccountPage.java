package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class DeletedAccountPage extends SeleniumBaseClass {
	
	public DeletedAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	private WebElement deleteAccount;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement deleteContinueButton;

	public WebElement getDeleteAccount() {
		return deleteAccount;
	}

	public WebElement getDeleteContinueButton() {
		return deleteContinueButton;
	}
}
