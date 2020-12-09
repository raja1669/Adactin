package com.adactin.stepdefinition;

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

import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass {

	public static WebDriver driver;

	@Given("^User should launch the application$")
	public void user_should_launch_the_application() throws Throwable {
		getbrowser("chrome");
		geturl("http://adactinhotelapp.com/");

	}

	@When("^Enter the valid user name$")
	public void enter_the_valid_user_name() throws Throwable {
		HomePage hp = new HomePage(driver);
		inputvaluetoelement(hp.getUsername(), "raja1669");

	}

	@When("^Enter the valid password$")
	public void enter_the_valid_password() throws Throwable {
		HomePage hp = new HomePage(driver);
		inputvaluetoelement(hp.getPassword(), "@RAVIGIRI@");

	}

	@When("^Click the login button$")
	public void click_the_login_button() throws Throwable {
		HomePage hp = new HomePage(driver);
		clickelement(hp.getLogin());

	}

	@Then("^Verify Homepage navigates to the search hotel page$")
	public void verify_Homepage_navigates_to_the_search_hotel_page() throws Throwable {
		WebElement e = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		e.isDisplayed();
		System.out.println("search Hotel is displayed");

	}

	@Given("^Search hotels page is displayed$")
	public void Search_hotels_page_is_displayed() throws Throwable {
		
	}

	@When("^select the location by drop down$")
	public void select_the_location_by_drop_down() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		selectdropdown(s.getLocation(), "Brisbane", "2");
	}

	@When("^select the hotel by drop down$")
	public void select_the_hotel_by_drop_down() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		selectdropdown(s.getHotel(), "Hotel Sunshine", "2");
	}

	@When("^select the room type by drop down$")
	public void select_the_room_type_by_drop_down() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		selectdropdown(s.getHotel(), "Deluxe", "4");
	}
	@When("^Select the no of rooms$")
	public void Select_the_no_of_rooms() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		selectdropdown(s.getNumberrooms(), "4", "5");
	}

	@When("^Enter the check in date$")
	public void enter_the_check_in_date() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		inputvaluetoelement(s.getDatepickin(), "02/12/2020");
	}

	@When("^Enter the check out date$")
	public void enter_the_check_out_date() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		inputvaluetoelement(s.getDatepickout(), "05/12/2020");
	}

	@When("^Select the Adult per room$")
	public void select_the_Adult_per_room() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		selectdropdown(s.getAdultperroom(), "3", "3");
	}

	@When("^Select the children per room$")
	public void select_the_children_per_room() throws Throwable {

	}

	@Then("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickelement(s.getSearch());
	}

	@Given("^User should complete the search hotel page$")
	public void user_should_complete_the_search_hotel_page() throws Throwable {
		
	}

	@When("^select the hotel by radio button$")
	public void select_the_hotel_by_radio_button() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickelement(sh.getRadiobutton());
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickelement(sh.getContinuebutton());
	}

	@Given("^User should complete the select hotel page$")
	public void user_should_complete_the_select_hotel_page() throws Throwable {

	}

	@When("^Enter the First name$")
	public void enter_the_First_name() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		inputvaluetoelement(b.getFirstname(), "Raja");
	}

	@When("^Enter the last name$")
	public void enter_the_last_name() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		inputvaluetoelement(b.getLast_name(), "Ravi");
	}

	@When("^Enter the Billing address$")
	public void enter_the_Billing_address() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		inputvaluetoelement(b.getBillingaddress(), "32/32 sasthri 1 st cross street");
	}

	@When("^Enter the Credit card no$")
	public void enter_the_Credit_card_no() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		inputvaluetoelement(b.getCreditcardno(), "12345678978945612");
	}

	@When("^Select the Credit card Type$")
	public void select_the_Credit_card_Type() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		selectdropdown(b.getCreditcardtype(), "VISA", "3");
	}

	@When("^Select the Expiery date$")
	public void select_the_Expiery_date() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		selectdropdown(b.getExpierymonth(), "July", "9");
	}

	@When("^Select the Year$")
	public void select_the_Year() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		selectdropdown(b.getSelectyear(), "2020", "11");
	}

	@When("^Enter the CVV no$")
	public void enter_the_CVV_no() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		inputvaluetoelement(b.getCvvno(), "255");
	}

	@Then("^Click on the Book now button$")
	public void click_on_the_Book_now_button() throws Throwable {
		BookAHotel b = new BookAHotel(driver);
		clickelement(b.getBooknow());
	}

	@Given("^User Should complete the Booking a Hotel page$")
	public void user_Should_complete_the_Booking_a_Hotel_page() throws Throwable {

	}

	@When("^Verify the booking is confirmed$")
	public void verify_the_booking_is_confirmed() throws Throwable {

	}

	@Then("^click on search itinerary$")
	public void click_on_search_itinerary() throws Throwable {
		BookingConfirmation bc= new BookingConfirmation(driver);
		clickelement(bc.getMyitinerary());
	}

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {

	}

	@When("^Verify the Order Id confirmation$")
	public void verify_the_Order_Id_confirmation() throws Throwable {
		BookItinerary bi = new BookItinerary(driver);
		clickelement(bi.getSelectall());
	}

	@Then("^Click on the Logout$")
	public void click_on_the_Logout() throws Throwable {
		BookItinerary bi = new BookItinerary(driver);
		clickelement(bi.getLogout());
	}

}
