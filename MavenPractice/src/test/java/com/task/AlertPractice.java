package com.task;

import org.openqa.selenium.WebElement;

import com.actionspojo.AlertPage;
import com.baseclass.SeleniumBaseClass;

public class AlertPractice extends SeleniumBaseClass{

	public static void main(String[] args) throws InterruptedException {

		chromeBrowser();
		maximizeWindow();
		launchURL("https://demoqa.com/alerts");
//		https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
		waitForTenSec();
		
		AlertPage a = new AlertPage();
//		WebElement alertClick = a.getAlertClick();
//		click(alertClick);
//		getTextAlert();
//		acceptAlert();
//		
//		WebElement confirmationAlertClick = a.getConfirmationAlertClick();
//		click(confirmationAlertClick);
//		dismissAlert();
//		
//		WebElement promptAlertClick = a.getPromptAlertClick();
//		click(promptAlertClick);
//		sendKeysAlert("check");
//		Thread.sleep(3000);
//		acceptAlert();
//		
//		WebElement doubleClick = a.getDoubleClick();
//		doubleClickAction(doubleClick);
		
		WebElement prompButton = a.getPrompButton();
		click(prompButton);
		Thread.sleep(3000);
		sendKeysAlert("Checking");
		acceptAlert();
		
	}

}
