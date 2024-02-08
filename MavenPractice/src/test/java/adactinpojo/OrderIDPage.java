package adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class OrderIDPage extends SeleniumBaseClass{
	
	public OrderIDPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

}
