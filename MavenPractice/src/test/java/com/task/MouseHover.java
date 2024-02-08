package com.task;

import org.openqa.selenium.WebElement;

import com.actionspojo.MouseHoverPage;
import com.baseclass.SeleniumBaseClass;

public class MouseHover extends SeleniumBaseClass{
	
	public static void main(String[] args) {
		
		edgeBrowser();
		maximizeWindow();
		launchURL("https://demoqa.com/menu/#");
		waitForTenSec();
		
		MouseHoverPage p = new MouseHoverPage();
		
		WebElement mainMenu = p.getMainMenu();
		mouseHoverAction(mainMenu);
		
		WebElement subMenu = p.getSubMenu();
		mouseHoverAction(subMenu);
		
		WebElement subSubMenu = p.getSubSubMenu();
		mouseHoverAction(subSubMenu);
	}

}
