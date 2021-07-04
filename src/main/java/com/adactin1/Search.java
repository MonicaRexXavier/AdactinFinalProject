package com.adactin1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search {
	
	      public WebDriver driver;


		@FindBy(xpath = "//select[@id='location']")
		public static WebElement location;
		
		@FindBy(xpath = "//select[@id='hotels']")
		public static WebElement hotels;
		
		@FindBy(xpath = "//select[@name='room_type']")
		public static WebElement room;
		
		@FindBy(xpath = "//select[@id='room_nos']")
		public static WebElement roomnum;
		
		@FindBy(xpath = "//input[@id='datepick_in']")
		public static WebElement checkin;
		
		@FindBy(xpath = "//input[@name='datepick_out']")
		public static WebElement checkout;
		
		@FindBy(xpath = "//select[@id='adult_room']")
		public static WebElement adultroom;
        
		@FindBy(xpath = "//select[@name='child_room']")
		public static WebElement childroom;
		
		@FindBy(xpath = "//input[@id='Submit']")
		public static WebElement search;
		
		public Search(WebDriver Adriver)
		{
			this.driver =Adriver;//---- chrome driver
			PageFactory.initElements(driver,this);

	}


}
