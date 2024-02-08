package adactinpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class LoginPage extends SeleniumBaseClass{
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;

	@FindBy(id="login")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
