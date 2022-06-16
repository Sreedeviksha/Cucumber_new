package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItinerary {
public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItinerary;
	
	@FindBy(id ="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getBookItinerary() {
		return bookItinerary;
	}
	
	public BookItinerary(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
