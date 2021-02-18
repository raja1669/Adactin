package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	public SearchHotel(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement welcome;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement numberrooms;
	
	public WebElement getNumberrooms() {
		return numberrooms;
	}

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datepickin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement datepickout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultperroom;

	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement search;

	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getWelcome() {
		return welcome;
	}
	
	
}
