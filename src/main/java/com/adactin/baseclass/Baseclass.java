package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

	public static  WebDriver getbrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91909\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
				driver  = new ChromeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

	public static void waitforelement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputvaluetoelement( WebElement element , String value ) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void movetoelement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectdropdown(WebElement element , String value,String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		}else if (option.equalsIgnoreCase("text")) {
			Select s1 = new Select(element);
			s1.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			Select s2  = new Select(element);
			s2.selectByIndex(Integer.parseInt(value));
		}	
	}

	public static void alertbox( String accept , String dismiss) {
		if (accept.equalsIgnoreCase(accept)) {
			Alert element = driver.switchTo().alert();
			element.accept();
		}else if (accept.equalsIgnoreCase(dismiss)) {
			Alert element = driver.switchTo().alert();
			element.dismiss();
		}

	}

	public static void screenshot(String scr) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\91909\\eclipse-workspace\\SeleniumProject\\Screenshot\\" + scr);
			FileUtils.copyFile(src, f);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void robotfunction(WebElement element) throws AWTException {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();

			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);;
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void scrollupanddown(WebElement element) {

		try {
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()" , element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void waitForElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30); //explicit wait
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isDisplayed(WebElement element){

		waitForElement(element);
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	public static void clickelement(WebElement element) {
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

}




