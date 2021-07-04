package com.adactin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	public static WebElement selhotel;
	
	@FindBy(xpath = "//input[@id='continue']")
	public static WebElement cont;
	
	public Selecthotel(WebDriver Adriver)
	{
		this.driver = Adriver;
		PageFactory.initElements(driver, this);
	}
	

}
