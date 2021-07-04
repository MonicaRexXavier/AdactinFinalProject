package com.adactin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
 public WebDriver driver;
 
 @FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement chkbox;
 
 @FindBy(xpath = "//input[@id='logout']")
	public static WebElement out;
 
 public Logout(WebDriver Adriver)
 {
	 this.driver = Adriver;
	 PageFactory.initElements(driver, this);
 }
}
