package com.task;

import com.baseclass.Base;

public class AdactinHotel extends Base{

	public static void main(String[] args) {

		chromeBrowser();
		
		passURL("https://adactinhotelapp.com/");
		
		waitForTenSec();
		
		passValueByClassName("username", "manikandan96");
		
		passValueByXpath("//input[@name='password']", "5FO5ZJ");
		
		clickById("login");
		
		selectDropDownByIndex("location", 1);
		
		selctDropDownByVisibleText("hotels", "Hotel Sunshine");
		
		selectDropDownByValue("room_type", "Super Deluxe");
		
		selectDropDownByIndex("room_nos", 2);
		
		selectDropDownByIndex("adult_room", 3);
		
		selctDropDownByVisibleText("child_room", "2 - Two");
		
		passValueByXpath("//input[@name='datepick_in']", "01/01/2024");
		
		passValueByXpath("//input[@name='datepick_out']", "25/01/2024");
		
		clickByClassName("Submit");
		
		clickById("radiobutton_0");
		
		clickByClassName("continue");
		
		passValueByClassName("first_name", "Manikandan");
		
		passValueByClassName("last_name", "A");
		
		passValueById("address", "Trichy");
		
		passValueByClassName("cc_num", "7887654309875432");
		
		selectDropDownByIndex("cc_type", 2);
		
		selctDropDownByVisibleText("cc_exp_month", "January");
		
		selectDropDownByValue("cc_exp_year", "2025");
		
		passValueByClassName("cc_cvv", "888");
		
		clickById("book_now");
		
		getValue("order_no");
		
	}

}
