package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.BookAHotel;
import com.cucumber.POM.BookItinerary;
import com.cucumber.POM.HomePage;
import com.cucumber.POM.SearchHotel;
import com.cucumber.POM.SelectHotel;


public class PageObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private SelectHotel sl;
	private SearchHotel sh;
	private BookAHotel bh;
	private BookItinerary bi;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SelectHotel getSl() {
		sl = new SelectHotel(driver);
		return sl;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public BookAHotel getBh() {
		bh = new BookAHotel(driver);
		return bh;
	}

	public BookItinerary getBi() {
		bi = new BookItinerary(driver);
		return bi;
	}


}
