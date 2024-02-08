package com.actionspojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class AlertPage extends SeleniumBaseClass{
	
	public AlertPage() {
		
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "alert")
	private WebElement alertClick;
	
	@FindBy(name = "confirmation")
	private WebElement ConfirmationAlertClick;
	
	@FindBy(name = "prompt")
	private WebElement promptAlertClick;
	
	public WebElement getAlertClick() {
		return alertClick;
	}

	public WebElement getConfirmationAlertClick() {
		return ConfirmationAlertClick;
	}

	public WebElement getPromptAlertClick() {
		return promptAlertClick;
	}

	public WebElement getDoubleClick() {
		return doubleClick;
	}

	@FindBy(id = "double-click")
	private WebElement doubleClick;
	
	@FindBy(id = "promtButton")
	private WebElement prompButton;

	public WebElement getPrompButton() {
		return prompButton;
	}
}
