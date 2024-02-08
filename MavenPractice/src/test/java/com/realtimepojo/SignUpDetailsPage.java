package com.realtimepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class SignUpDetailsPage extends SeleniumBaseClass{
		
	public SignUpDetailsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	private WebElement textAccountInfo;
	
	@FindBy(id = "id_gender1")
	private WebElement genderRadio;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id ="days")
	private WebElement day;
	
	@FindBy(id ="months")
	private WebElement month;
	
	@FindBy(id ="years")
	private WebElement year;
	
	@FindBy(id = "newsletter")
	private WebElement newsletter;
	
	@FindBy(name ="optin")
	private WebElement offers;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="company")
	private WebElement companyName;
	
	@FindBy(id="address1")
	private WebElement addressOne;
	
	@FindBy(id="address2")
	private WebElement addressTwo;
	
	@FindBy(id="country")
	private WebElement countryName;
	
	@FindBy(id="state")
	private WebElement stateName;
	
	@FindBy(id="city")
	private WebElement cityName;
	
	@FindBy(id="zipcode")
	private WebElement zipCode;
	
	@FindBy(id="mobile_number")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement createAccountButton;

	public WebElement getUserName() {
		return name;
	}

	public WebElement getTextAccountInfo() {
		return textAccountInfo;
	}

	public WebElement getGenderRadio() {
		return genderRadio;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getAddressOne() {
		return addressOne;
	}

	public WebElement getAddressTwo() {
		return addressTwo;
	}

	public WebElement getCountryName() {
		return countryName;
	}

	public WebElement getStateName() {
		return stateName;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	
}
