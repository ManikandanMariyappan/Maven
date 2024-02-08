package com.redbus;

import org.openqa.selenium.WebElement;

import com.baseclass.SeleniumBaseClass;

public class RedBusPractice extends SeleniumBaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		chromeBrowser();
		maximizeWindow();
		launchURL("https://www.redbus.in/");
		waitForTenSec();
		
		RedBusHomePagePojo r = new RedBusHomePagePojo();
		
		WebElement fromPlace = r.getFromPlace();
		passValue(fromPlace, "CMBT, Chennai");
		
		WebElement toPlace = r.getToPlace();
		passValue(toPlace, "Trichy");
		
		WebElement selectToPlace = r.getSelectToPlace();
		
	//	Thread.sleep(3000);
		mouseHoverAction(selectToPlace);
	//	Thread.sleep(3000);
		click(selectToPlace);
		
		WebElement pickDate = r.getPickDate();
		click(pickDate);
		
	//	passValue(pickDate, "30 Dec 2023");
		}

}
