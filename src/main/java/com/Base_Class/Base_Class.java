package com.Base_Class;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		prefs.put("profile.credentials_enable_service", false);
		Options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(Options);
		driver.get("https://demo.us.espocrm.com/?l=en_GB#");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return driver;

	}

	public static void Quit() {
		driver.quit();

	}

	public static void Sendkeys(WebElement element, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
//		element.sendKeys(Keys.TAB);
//		element.sendKeys(Keys.chord(Keys.CONTROL + "a"));
//		element.sendKeys(Keys.chord(Keys.BACK_SPACE));
	}

	public static String Url() {
		return driver.getCurrentUrl();

	}

	public static void click(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);

	}

	public void clickelement(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

	public void clearelemenent(WebElement e) {
		e.clear();
	}

	public static void jsclick(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

	public static void WindowsScroll(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);", e);
	}

	public static void scrollIntoView(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
//		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);

	}

	public static void ScrolltoElemeent(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView({block;'center'})", e);
	}

	public static void date(WebElement e, String date) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + date + "';", e);
	}

	public static void SliderValue(WebElement slider, double targetValue) {
		wait.until(ExpectedConditions.visibilityOf(slider));
		double currentValue = Double.parseDouble(slider.getAttribute("aria-valuenow"));
		while (Math.abs(currentValue - targetValue) > 0.05) {
			if (currentValue < targetValue) {
				slider.sendKeys(Keys.ARROW_RIGHT.toString());
			} else {
				slider.sendKeys(Keys.ARROW_LEFT.toString());
			}
			currentValue = Double.parseDouble(slider.getAttribute("aria-valuenow"));
		}
	}

	public static void setPriceRange(WebElement minslider, WebElement maxslider, String minPrice, String maxPrice) {
		double minimum = Double.parseDouble(minPrice);
		double maximum = Double.parseDouble(maxPrice);
		SliderValue(minslider, minimum);
		SliderValue(maxslider, maximum);
	}

	public void Account(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sc = new Select(element);
		sc.selectByValue("Santhosh");
	}

	public static String GetAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);

	}

	public static String gettxt(WebElement e) {
		wait.until(ExpectedConditions.visibilityOf(e));
		return e.getText();
	}

//	public boolean isDisplayed(WebElement e) {
//		wait.until(ExpectedConditions.visibilityOf(e));
//		return e.isDisplayed();
//	}

	public static void Validation(WebElement e) {
		System.out.println(e.getAttribute("ValidationMessage"));
	}

}
