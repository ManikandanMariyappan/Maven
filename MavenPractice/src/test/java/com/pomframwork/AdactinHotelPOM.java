package com.pomframwork;

import org.openqa.selenium.WebElement;
import com.baseclass.SeleniumBaseClass;
import adactinpojo.BooKHotelPage;
import adactinpojo.LoginPage;
import adactinpojo.OrderIDPage;
import adactinpojo.SearchHotelPage;
import adactinpojo.SelectHotelPage;

public class AdactinHotelPOM extends SeleniumBaseClass{
	
	public static void main(String[] args) {
		
		edgeBrowser();
		launchURL("https://adactinhotelapp.com/");
		maximizeWindow();
		waitForTenSec();
		
		LoginPage l = new LoginPage();
		
		WebElement userName = l.getUserName();
		passValue(userName, "manikandan96");
		
		WebElement passWord = l.getPassWord();
		passValue(passWord, "5FO5ZJ");
		
		WebElement loginButton = l.getLoginButton();
		click(loginButton);
		
		SearchHotelPage s = new SearchHotelPage();
		
		WebElement locationSelection = s.getLocationSelection();
		selectDropDownByValue(locationSelection, "Brisbane");
		
		WebElement hotelSelection = s.getHotelSelection();
		selectDropDownByIndex(hotelSelection, 3);
		
		WebElement noOfRoomsSelection = s.getNoOfRoomsSelection();
		selectDropDownByIndex(noOfRoomsSelection, 1);
		
		WebElement roomTypeSelection = s.getRoomTypeSelection();
		selectDropDownByValue(roomTypeSelection, "Super Deluxe");
		
		WebElement checkInDateSelection = s.getCheckInDateSelection();
		passValue(checkInDateSelection, "01/10/2024");
		
		WebElement checkOutDateSelection = s.getCheckOutDateSelection();
		passValue(checkOutDateSelection, "01/10/2024");
		
		WebElement noOfAdultsSelection = s.getNoOfAdultsSelection();
		selectDropDownByIndex(noOfAdultsSelection, 2);
		
		WebElement noOfChildSelection = s.getNoOfChildSelection();
		selectDropDownByIndex(noOfChildSelection, 0);
		
		WebElement searchButton = s.getSearchButton();
		click(searchButton);
		
		SelectHotelPage h = new SelectHotelPage();
		
		WebElement hotelSelectButton = h.getHotelSelectButton();
		click(hotelSelectButton);
		
		WebElement continueButton = h.getContinueButton();
		click(continueButton);
		
		BooKHotelPage b = new BooKHotelPage();
		
		WebElement firstName = b.getFirstName();
		passValue(firstName, "Harry");
		
		WebElement lastName = b.getLastName();
		passValue(lastName, "Potter");
		
		WebElement adress = b.getAdress();
		passValue(adress, "Hogwarts");
		
		WebElement cardNumber = b.getCreditCardNumber();
		passValue(cardNumber, "7654098712345678");
		
		WebElement creditCardType = b.getCreditCardType();
		selectDropDownByIndex(creditCardType, 1);
		
		WebElement expiryMonth = b.getExpiryMonth();
		selectDropDownByIndex(expiryMonth, 5);
		
		WebElement expiryYear = b.getExpiryYear();
		selectDropDownByIndex(expiryYear, 8);
		
		WebElement cvvNo = b.getCvvNo();
		passValue(cvvNo, "793");
		
		WebElement bookNowButton = b.getBookNowButton();
		click(bookNowButton);
		
		OrderIDPage o = new OrderIDPage();
		WebElement orderNo = o.getOrderNo();
		getAttributeText(orderNo);
	}

}
