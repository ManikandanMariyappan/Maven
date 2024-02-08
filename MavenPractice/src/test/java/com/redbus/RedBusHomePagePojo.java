package com.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class RedBusHomePagePojo extends SeleniumBaseClass{
	
	public RedBusHomePagePojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement fromPlace;
	
	@FindBy(xpath = "(//div[@role='button'])[2]")
	private WebElement toPlace;
	
	@FindBy(xpath = "(//text[text()='Trichy'])[2]")
	private WebElement selectToPlace;
	
	@FindBy(xpath = "(//div[@role='button'])[3]")
	private WebElement pickDate;

	public WebElement getFromPlace() {
		return fromPlace;
	}

	public WebElement getToPlace() {
		return toPlace;
	}

	public WebElement getPickDate() {
		return pickDate;
	}

	public WebElement getSelectToPlace() {
		return selectToPlace;
	}
}
