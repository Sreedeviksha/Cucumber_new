package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public static WebDriver driver;

	
	@FindBy(id ="username")
	private WebElement username;
	 
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	//we have to create a constructor & initialise the driver with the elements
	
	 public HomePage(WebDriver ldriver) {
		 this.driver=ldriver;
		 PageFactory.initElements(driver, this);
	 }

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
