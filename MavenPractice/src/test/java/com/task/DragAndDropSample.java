package com.task;

import org.openqa.selenium.WebElement;

import com.actionspojo.DragAndDropPage;
import com.baseclass.SeleniumBaseClass;


public class DragAndDropSample extends SeleniumBaseClass{
	
	public static void main(String[] args) {
		
		chromeBrowser();
		maximizeWindow();
		launchURL("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		
		DragAndDropPage d = new DragAndDropPage();
		
		WebElement dragOne = d.getDragOne();
		WebElement getdropZone = d.getdropZone();
		dragAndDropAction(dragOne, getdropZone);
		
		WebElement dragTwo = d.getDragTwo();
		dragAndDropAction(dragTwo, getdropZone);
		
		WebElement dragThree = d.getDragThree();
		dragAndDropAction(dragThree, getdropZone);
		
		WebElement dragFour = d.getDragFour();
		dragAndDropAction(dragFour, getdropZone);
	}
}
