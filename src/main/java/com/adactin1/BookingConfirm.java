package com.adactin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='my_itinerary']")
	public static WebElement myitn;
	
	public BookingConfirm(WebDriver Adriver)
	{
		this.driver = Adriver;
		PageFactory.initElements(driver, this);
	}
    
}
