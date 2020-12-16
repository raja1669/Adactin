package com.adactin.utils;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class Pageobjectmanager {
public static WebDriver driver;
	
	private HomePage homepage;
	private SearchHotel searchHotelPage;
	private SelectHotel selectHotelPage;
	private BookAHotel bookHotelPage;
	private BookingConfirmation bookingConfirmPage;
	private BookItinerary bookedItenaryPage;

	public  Pageobjectmanager(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public HomePage gethomepage() {
		homepage = new HomePage(driver);
		return homepage ;
	}

	public SearchHotel getSearchHotel() {
		searchHotelPage = new SearchHotel(driver);
		return searchHotelPage;
	}

	public SelectHotel getSelectHotelPage() {
		selectHotelPage = new SelectHotel(driver);
		return selectHotelPage;
	}

	public BookAHotel getBookHotelPage() {
		bookHotelPage = new BookAHotel(driver);
		return bookHotelPage;
	}

	public BookingConfirmation getBookingConfirmPage() {
		bookingConfirmPage = new BookingConfirmation(driver);
		return bookingConfirmPage;
	}

	public BookItinerary getBookedItenaryPage() {
		bookedItenaryPage = new BookItinerary(driver);
		return bookedItenaryPage;
	}
	

}
