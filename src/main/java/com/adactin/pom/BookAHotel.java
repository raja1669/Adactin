package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	public static WebDriver driver;
	
	public BookAHotel(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath = "//textarea[@class='txtarea']")
	private WebElement billingaddress;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditcardno;
	
	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement creditcardtype;
	
	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement Expierymonth;
	
	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")
	private WebElement selectyear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvno;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;



	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpierymonth() {
		return Expierymonth;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	








}
