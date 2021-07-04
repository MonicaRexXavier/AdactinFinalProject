package com.adactin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver; // null driver
	
	@FindBy(xpath = "//input[@id ='username']")
	public static WebElement user;
	
	@FindBy(xpath = "//input[@id ='password']")
	public static WebElement pw;
	
	@FindBy(xpath = "//input[@id ='login']")
	public static WebElement login;

	public Loginpage(WebDriver Adriver)
	{
		this.driver =Adriver;//---- chrome driver
		PageFactory.initElements(driver,this);

}
}

