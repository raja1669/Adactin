package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	
	public SelectHotel(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;

	

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
	

}
