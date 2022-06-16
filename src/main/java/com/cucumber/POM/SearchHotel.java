package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement searchlocation;

	@FindBy(id = "hotels")
	private WebElement searchhotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement numberofrooms;

	@FindBy(name = "datepick_in")
	private WebElement checkindate;

	@FindBy(name = "datepick_out")
	private WebElement checkoutdate;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement search;

	public SearchHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchlocation() {
		return searchlocation;
	}

	public WebElement getSearchhotels() {
		return searchhotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}

}
