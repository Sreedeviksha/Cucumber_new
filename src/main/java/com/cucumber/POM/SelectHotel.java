package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public static WebDriver driver;
	
	public SelectHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
}
