package adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class SearchHotelPage extends SeleniumBaseClass{
	
	public SearchHotelPage() {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement locationSelection;
	
	@FindBy(id="hotels")
	private WebElement hotelSelection;
	
	@FindBy(id="room_type")
	private WebElement roomTypeSelection;
	
	@FindBy(name="room_nos")
	private WebElement noOfRoomsSelection;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkInDateSelection;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOutDateSelection;
	
	@FindBy(id="adult_room")
	private WebElement noOfAdultsSelection;
	
	@FindBy(name="child_room")
	private WebElement noOfChildSelection;
	
	@FindBy(name="Submit")
	private WebElement searchButton;
	
	@FindBy(name="Reset")
	private WebElement resetButton;

	public WebElement getLocationSelection() {
		return locationSelection;
	}

	public WebElement getHotelSelection() {
		return hotelSelection;
	}

	public WebElement getRoomTypeSelection() {
		return roomTypeSelection;
	}

	public WebElement getNoOfRoomsSelection() {
		return noOfRoomsSelection;
	}

	public WebElement getCheckInDateSelection() {
		return checkInDateSelection;
	}

	public WebElement getCheckOutDateSelection() {
		return checkOutDateSelection;
	}

	public WebElement getNoOfAdultsSelection() {
		return noOfAdultsSelection;
	}

	public WebElement getNoOfChildSelection() {
		return noOfChildSelection;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

}
