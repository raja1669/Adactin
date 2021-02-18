package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItinerary {
	public static WebDriver driver;
	
	public BookItinerary(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement searchbutton;
	

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement selectall;
	

	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;

	


	public WebElement getSelectall() {
		return selectall;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
}
