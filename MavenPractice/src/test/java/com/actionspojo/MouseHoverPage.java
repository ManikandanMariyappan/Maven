package com.actionspojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class MouseHoverPage extends SeleniumBaseClass{
	
	public MouseHoverPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Main Item 2']")
	private WebElement mainMenu;
	
	@FindBy(xpath = "//a[text()='SUB SUB LIST »']")
	private WebElement subMenu;
	
	@FindBy(xpath = "//a[text()='Sub Sub Item 2']")
	private WebElement subSubMenu;

	public WebElement getSubSubMenu() {
		return subSubMenu;
	}

	public WebElement getMainMenu() {
		return mainMenu;
	}

	public WebElement getSubMenu() {
		return subMenu;
	}

}
