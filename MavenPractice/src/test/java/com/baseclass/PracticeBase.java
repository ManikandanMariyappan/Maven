package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBase {

	public static WebDriver d;
	public static void chromeWeb() {

		d = new ChromeDriver();
	}
	
	public static void maxWindow() {
		
		d.manage().window().maximize();
	}
	
	public static void urlLaunch(String u) {
		d.get(u);
	}
}
