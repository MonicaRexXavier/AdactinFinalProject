package com.adactin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	public static WebElement firstname;
    
	@FindBy(xpath = "//input[@name='last_name']")
	public static WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	public static WebElement add;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	public static WebElement ccnum;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	public static WebElement cctype;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	public static WebElement expmonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	public static WebElement expyear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	public static WebElement cvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	public static WebElement booknow;
	
	public Book_Now(WebDriver Adriver)
	{
		this.driver = Adriver;
		PageFactory.initElements(driver, this);
	}
}
