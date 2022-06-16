package com.cucumber.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cucumber.BaseClass.BaseClass;
import com.cucumber.POM.BookAHotel;
import com.cucumber.POM.BookItinerary;
import com.cucumber.POM.SearchHotel;
import com.cucumber.POM.SelectHotel;
import com.cucumber.Runner.TestRunner;
import com.cucumber.helper.FileReaderManager;
import com.cucumber.helper.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Before
	//executes before 1st line of every scenario & gets the name of the scenario
	
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName:  "+name);
	}
	
	@After
	//executes after last line of every scenario & can take the screenshot of failed test cases
	
	public void afterHooks(Scenario scenario) throws IOException {
		Status status = scenario.getStatus();
		System.out.println("       ScenarioStatus: "+status);
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
		}
	}
	
	@Given("^User launches the adactin application$")
	public void user_launches_the_adactin_application() throws Throwable {
		System.out.println("User launches adactin the application");
	}

	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
		System.out.println("User log into the application");

	}

	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}

	
	 /* @When("^User enters the valid username in the username field$") public void
	  user_enters_the_valid_username_in_the_username_field() throws Throwable {
	  HomePage hp = new HomePage(driver); 
	  inputValuestoElement(hp.getUsername(),"SreeDeviRaman"); }
	  
	  @When("^User enters the valid password in the password field$") public void
	  user_enters_the_valid_password_in_the_password_field() throws Throwable {
	  HomePage hp = new HomePage(driver); 
	  inputValuestoElement(hp.getPassword(),"Sree@123"); }*/
	 
	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		inputValuestoElement(pom.getHp().getUsername(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		inputValuestoElement(pom.getHp().getPassword(), password);

	}
	

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickonElement(pom.getHp().getLogin());
	}

	@Then("^User verifies whether HomePage navigates to Search Hotel Page$")
	public void user_verifies_whether_HomePage_navigates_to_Search_Hotel_Page() throws Throwable {
		//Assert.assertEquals("Actual", "expected");
	}

	/*@When("^User selects the location in the Select location field$")
	public void user_selects_the_location_in_the_Select_location_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getSearchlocation(), "Sydney", "value");

	}

	@When("^User selects the Hotel in Select Hotel field$")
	public void user_selects_the_Hotel_in_Select_Hotel_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getSearchhotels(), "Hotel Creek", "visibletext");

	}*/
	
	@When("^User selects the location \"([^\"]*)\" as \"([^\"]*)\" in the Select location field$")
	public void user_selects_the_location_as_in_the_Select_location_field(String location, String option) throws Throwable {
		selectDropDown(pom.getSh().getSearchlocation(), location, option);
	}

	@When("^User selects the Hotel \"([^\"]*)\" as \"([^\"]*)\" in Select Hotel field$")
	public void user_selects_the_Hotel_as_in_Select_Hotel_field(String hotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getSearchhotels(), hotel, option);
	
	}

	@When("^User selects the room type in Select Room type field$")
	public void user_selects_the_room_type_in_Select_Room_type_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getRoomtype(), "Standard", "value");

	}

	@When("^User selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
		selectDropDown(pom.getSh().getNumberofrooms(), "1", "value");

	}

	@When("^User selects the check in date$")
	public void user_selects_the_check_in_date() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		
		inputValuestoElement(sh.getCheckindate(), "06/08/2020");

	}

	@When("^User selects the check out date$")
	public void user_selects_the_check_out_date() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		inputValuestoElement(sh.getCheckoutdate(), "07/08/2020");

	}

	@When("^User selects the adults per Room$")
	public void user_selects_the_adults_per_Room() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getAdultroom(), "2", "value");

	}

	@When("^User selects the children per Room$")
	public void user_selects_the_children_per_Room() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getChildroom(), "2", "value");

	}

	@When("^User clicks on search button to search for the details$")
	public void user_clicks_on_search_button_to_search_for_the_details() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		clickonElement(sh.getSearch());

	}

	@Then("^User verify the Search Hotel Page navigates to Select hotel page$")
	public void user_verify_the_Search_Hotel_Page_navigates_to_Select_hotel_page() throws Throwable {
		//Assert.assertEquals("A", "a");

	}

	@When("^User clicks on the selected radion button$")
	public void user_clicks_on_the_selected_radion_button() throws Throwable {
		SelectHotel sl = new SelectHotel(driver);
		clickonElement(sl.getRadiobutton());

	}

	@When("^User clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {
		SelectHotel sl = new SelectHotel(driver);
		clickonElement(sl.getContinuebtn());

	}

	@Then("^User verify the Select Hotel page navigates to Book a Hotel page$")
	public void user_verify_the_Select_Hotel_page_navigates_to_Book_a_Hotel_page() throws Throwable {

	}

	@When("^User enters the  first name in FirstName field$")
	public void user_enters_the_first_name_in_FirstName_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuestoElement(bh.getFirstName(), "SreeDevi");

	}

	@When("^User enters the  last name in LastName field$")
	public void user_enters_the_last_name_in_LastName_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuestoElement(bh.getLastName(), "Raman");

	}

	@When("^User enters the  billing Address in Billing Address field$")
	public void user_enters_the_billing_Address_in_Billing_Address_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuestoElement(bh.getAddress(), "Saligramam, chennai");

	}

	@When("^User enters the  Credit Card Number in Credit Card Number field$")
	public void user_enters_the_Credit_Card_Number_in_Credit_Card_Number_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuestoElement(bh.getCcNum(), "1234567891425367");

	}

	@When("^User enters the  credit card type in Credit Card Type field$")
	public void user_enters_the_credit_card_type_in_Credit_Card_Type_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getCcType(), "VISA", "visibleText");

	}

	@When("^User enters expiry month in Expiry Month field$")
	public void user_enters_expiry_month_in_Expiry_Month_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getExpMonth(), "1", "value");

	}

	@When("^User enters expiry year in Expiry Year field$")
	public void user_enters_expiry_year_in_Expiry_Year_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getExpYear(), "2022", "visibletext");

	}

	@When("^User enters the cvv number in CVV field$")
	public void user_enters_the_cvv_number_in_CVV_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputValuestoElement(bh.getCvv(), "235");

	}

	@When("^User clicks on the BookNow Button$")
	public void user_clicks_on_the_BookNow_Button() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		clickonElement(bh.getBookNow());

	}

	@Then("^User verify the Book a Hotel navigates to Booking Confirmation page$")
	public void user_verify_the_Book_a_Hotel_navigates_to_Booking_Confirmation_page() throws Throwable {

	}

	@When("^user clicks on book itinerary button$")
	public void user_clicks_on_book_itinerary_button() throws Throwable {
		BookItinerary bi = new BookItinerary(driver);
		clickonElement(bi.getBookItinerary());

	}

	@When("^User clicks on log out button to exit the page$")
	public void user_clicks_on_log_out_button_to_exit_the_page() throws Throwable {
		BookItinerary bi = new BookItinerary(driver);
		clickonElement(bi.getLogout());
	}

	@Then("^User verify Book Itinerary page navigates to successfully logged out page$")
	public void user_verify_Book_Itinerary_page_navigates_to_successfully_logged_out_page() throws Throwable {

	}

}
