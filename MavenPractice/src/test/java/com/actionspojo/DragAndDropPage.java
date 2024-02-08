package com.actionspojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SeleniumBaseClass;

public class DragAndDropPage extends SeleniumBaseClass{
	
	public DragAndDropPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Draggable 1']")
	private WebElement dragOne;
	
	@FindBy(xpath = "//span[text()='Draggable 2']")
	private WebElement dragTwo;
	
	@FindBy(xpath = "//span[text()='Draggable 3']")
	private WebElement dragThree;
	
	@FindBy(xpath = "//span[text()='Draggable 4']")
	private WebElement dragFour;
	
	@FindBy(id="mydropzone")
	private WebElement dropZone;
	
	
	public WebElement getDragOne() {
		return dragOne;
	}

	public WebElement getDragTwo() {
		return dragTwo;
	}

	public WebElement getDragThree() {
		return dragThree;
	}

	public WebElement getDragFour() {
		return dragFour;
	}
	
	public WebElement getdropZone() {
		return dropZone;
	}

}
