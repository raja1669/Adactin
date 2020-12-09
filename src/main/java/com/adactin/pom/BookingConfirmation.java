package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	public static WebDriver driver;
	
	public BookingConfirmation(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myitinerary;

	

	public WebElement getMyitinerary() {
		return myitinerary;
	}


	
}
