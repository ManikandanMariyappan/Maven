package adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.SeleniumBaseClass;

public class SelectHotelPage extends SeleniumBaseClass{
	
	public SelectHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement hotelSelectButton;
	
	@FindBy(name="continue")
	private WebElement continueButton;

	public WebElement getHotelSelectButton() {
		return hotelSelectButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
