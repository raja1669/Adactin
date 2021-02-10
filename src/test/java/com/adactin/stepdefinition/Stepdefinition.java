package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.adactin.baseclass.Baseclass;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;
import com.adactin.utils.FileReaderManager;
import com.adactin.utils.Pageobjectmanager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass {

	public static WebDriver driver = TestRunner.driver;

	Pageobjectmanager pm = new Pageobjectmanager(driver);

	@Before
	public void beforehooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName : " + name);
	}

	@After
	public void Afterhooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("Scenariostatus : " + status);
		if (scenario.isFailed()) {
			screenshot(scenario.getName());
		}
	}

	@Given("^User should launch the application$")
	public void user_should_launch_the_application() throws Throwable {
		// getbrowser("chrome");
		// geturl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getinstance().getcrinstance().geturl();
		geturl(url);
	}

	@When("^Enter the valid \"([^\"]*)\" user name$")
	public void enter_the_valid_user_name(String username) throws Throwable {
		// HomePage hp = new HomePage(driver);

		inputvaluetoelement(pm.gethomepage().getUsername(), username);
	}

	@When("^Enter the valid \"([^\"]*)\" password$")
	public void enter_the_valid_password(String password) throws Throwable {
		// HomePage hp = new HomePage(driver);
		inputvaluetoelement(pm.gethomepage().getPassword(), password);
	}

	@When("^Click the login button$")
	public void click_the_login_button() throws Throwable {
		// HomePage hp = new HomePage(driver);
		clickelement(pm.gethomepage().getLogin());

	}

	@Then("^Verify Homepage navigates to the search hotel page$")
	public void verify_Homepage_navigates_to_the_search_hotel_page() throws Throwable {
		//WebElement e = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		Assert.assertEquals(true, isDisplayed(pm.getSearchHotel().getWelcome()));
		System.out.println("search Hotel is displayed");
	}

	@When("^select the location \"([^\"]*)\" as \"([^\"]*)\" by drop down$")
	public void select_the_location_as_by_drop_down(String location, String type) throws Throwable {
		selectdropdown(pm.getSearchHotel().getLocation(), location, type);
	}

	@When("^select the hotel \"([^\"]*)\" as \"([^\"]*)\" by drop down$")
	public void select_the_hotel_as_by_drop_down(String hotel, String type) throws Throwable {
		selectdropdown(pm.getSearchHotel().getHotel(), hotel, type);
	}

	@When("^select the room type \"([^\"]*)\" as \"([^\"]*)\" by drop down$")
	public void select_the_room_type_as_by_drop_down(String room, String type) throws Throwable {
		selectdropdown(pm.getSearchHotel().getRoomtype(), room, type);
	}

	@When("^Select the no of rooms \"([^\"]*)\" as \"([^\"]*)\" by drop down$")
	public void select_the_no_of_rooms_as_by_drop_down(String room, String value) throws Throwable {
		selectdropdown(pm.getSearchHotel().getNumberrooms(), room, value);
	}

	@When("^Enter the check in date \"([^\"]*)\" as \"([^\"]*)\"$")
	public void enter_the_check_in_date_as(String date, String value) throws Throwable {
		inputvaluetoelement(pm.getSearchHotel().getDatepickin(), date);
	}

	@When("^Enter the check out date \"([^\"]*)\" as \"([^\"]*)\"$")
	public void enter_the_check_out_date_as(String date, String arg2) throws Throwable {
		inputvaluetoelement(pm.getSearchHotel().getDatepickout(), date);
	}

	@When("^Select the Adult per room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void select_the_Adult_per_room_as(String adult, String value) throws Throwable {
		selectdropdown(pm.getSearchHotel().getAdultperroom(), adult, value);
	}

	@When("^Select the children per room$")
	public void select_the_children_per_room() throws Throwable {

	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		clickelement(pm.getSearchHotel().getSearch());
	}

	@When("^select the hotel by radio button$")
	public void select_the_hotel_by_radio_button() throws Throwable {
		clickelement(pm.getSelectHotelPage().getRadiobutton());
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		clickelement(pm.getSelectHotelPage().getContinuebutton());
	}

	@When("^Enter the First name as \"([^\"]*)\"$")
	public void enter_the_First_name_as(String firstname) throws Throwable {
		inputvaluetoelement(pm.getBookHotelPage().getFirstname(), firstname);
	}

	@When("^Enter the last name  as \"([^\"]*)\"$")
	public void enter_the_last_name_as(String lastname) throws Throwable {
		inputvaluetoelement(pm.getBookHotelPage().getLast_name(), lastname);
	}

	@When("^Enter the Billing address as \"([^\"]*)\"$")
	public void enter_the_Billing_address_as(String billing) throws Throwable {
		inputvaluetoelement(pm.getBookHotelPage().getBillingaddress(), billing);
	}

	@When("^Enter the Credit card no as \"([^\"]*)\"$")
	public void enter_the_Credit_card_no_as(String value) throws Throwable {
		inputvaluetoelement(pm.getBookHotelPage().getCreditcardno(), value);
	}

	
	@When("^Select the Credit card Type \"([^\"]*)\"$")
	public void select_the_Credit_card_Type(String credit) throws Throwable {
		selectdropdown(pm.getBookHotelPage().getCreditcardtype(), credit, "value");
	}

	@When("^Select the Expiery date as \"([^\"]*)\"$")
	public void select_the_Expiery_date_as(String expiery) throws Throwable {
		selectdropdown(pm.getBookHotelPage().getExpierymonth(), expiery, "text");
	}

	@When("^Select the Year as \"([^\"]*)\"$")
	public void select_the_Year_as(String year) throws Throwable {
		selectdropdown(pm.getBookHotelPage().getSelectyear(), year, "value");
	}

	@When("^Enter the CVV no \"([^\"]*)\"$")
	public void enter_the_CVV_no(String cvvnumber) throws Throwable {
		inputvaluetoelement(pm.getBookHotelPage().getCvvno(), cvvnumber);
	}

	@Then("^Click on the Book now button$")
	public void click_on_the_Book_now_button() throws Throwable {
		clickelement(pm.getBookHotelPage().getBooknow());
	}

	@When("^Verify the booking is confirmed$")
	public void verify_the_booking_is_confirmed() throws Throwable {

	}

	@Then("^click on search itinerary$")
	public void click_on_search_itinerary() throws Throwable {
		clickelement(pm.getBookingConfirmPage().getMyitinerary());
	}

	@When("^Verify the Order Id confirmation$")
	public void verify_the_Order_Id_confirmation() throws Throwable {
		scrollupanddown(pm.getBookedItenaryPage().getSearchbutton());
		//clickelement(pm.getBookedItenaryPage().getSelectall());
		//Thread.sleep(5000);
	}

	@Then("^Click on the Logout$")
	public void click_on_the_Logout() throws Throwable {
		clickelement(pm.getBookedItenaryPage().getLogout());
	}
}
