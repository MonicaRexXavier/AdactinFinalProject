package com.adactin1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Baseproject {
	public static WebDriver driver;
	
	
	public static WebDriver getDriver(String type)
	{
	 if (type.equalsIgnoreCase("chrome"))
			 {
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harmo\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
						 }
	 else if(type.equalsIgnoreCase("safari"))
	 {
		// System.setProperty("webdriver.safari.driver","C:\\Users\\harmo\\eclipse-workspace\\SeleniumTesting\\Drivers\\safari.exe");
		
		// WebDriver driver =new SafariDriver();
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	 return driver;
	}
	
	public static void site(String url)
	{
		driver.get(url);
	}

	
	public static void ck(WebElement c)
	{
		
		c.click();
	}

	public static void sndk(WebElement element,String val)
	 {
	 	element.sendKeys(val);
	 }
	
	public static void getcurrenturl()
	{
	driver.getCurrentUrl();
	}
	
	public static void frm(WebElement element)
	{
		driver.switchTo().frame(element);
	}
public static void selectvalue(WebElement element, String value)
{
	Select s1 =new Select(element);
	s1.selectByValue(value);
	
}
	
public static void selectvisibletext(WebElement element,String value)
{
	Select s2 = new Select(element);
	s2.selectByVisibleText(value);
}

public static void clo()
{
	driver.close();
}


//		public static void main(String[] args ) throws Throwable{
//			
//				
//		    WebDriver driver = new ChromeDriver();
//		
//			driver.get("http://www.adactinhotelapp.com");
//			driver.manage().window().maximize();
//			Thread.sleep(3000);
//			PageFactory.initElements(driver, Loginpage.class);
//
//					
//			Loginpage.user.sendKeys("Monicarexxavier");	
//			Loginpage.pw.sendKeys("Je$$ica03");
//			Loginpage.login.click();
//			
//			PageFactory.initElements(driver, Search.class);
//			Thread.sleep(3000);
//			
//			Search.location.click();
//			Search.hotels.click();
//			Search.room.click();
//			Search.checkin.sendKeys("11/06/2021");
//			Search.checkout.sendKeys("12/06/2021");
//			Search.adultroom.click();
//			Search.childroom.click();
//			Search.search.click();
//			
//			PageFactory.initElements(driver, Selecthotel.class);
//			Thread.sleep(3000);
//			
//			Selecthotel.selhotel.click();
//			Selecthotel.cont.click();
//			
		}



