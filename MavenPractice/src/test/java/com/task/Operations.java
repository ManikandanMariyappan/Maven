package com.task;

import com.baseclass.Base;

public class Operations extends Base{
	
	public static void main(String[] args) {
		
		edgeBrowser();
		passURL("https://www.facebook.com");
		passValueById("email", "Mani");
		passValueByClassName("pass", "Welcome");
		clickByClassName("login");
		
	}

}
