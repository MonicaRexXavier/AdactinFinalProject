package com.Adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin1.Book_Now;
import com.adactin1.BookingConfirm;
import com.adactin1.Loginpage;
import com.adactin1.Logout;
import com.adactin1.Search;
import com.adactin1.Selecthotel;


public class Page_Object_Manager {

	public WebDriver driver;// null driver
	
	private  Loginpage login;
	
	private Search searchhotel;
	
	private Selecthotel sel;
	
	private Book_Now Booknow;
	
	private BookingConfirm iten;
	
	private  Logout out;
	
	public Page_Object_Manager(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public Loginpage get_Instance_Login()
	{
		 login = new Loginpage(driver);
		 return login;
		
	}
	public Search get_Instance_Search()
	{
		searchhotel = new Search(driver);
		return searchhotel;
	}
	public Selecthotel get_Instance_Selecthotel()
	{
		sel = new Selecthotel(driver);
		return sel;
	}
	public Book_Now get_Instance_Booknow()
	{
		Booknow = new Book_Now(driver);
		return Booknow;
	}
	public BookingConfirm get_Instance_Bookingconfirm()
	{
		iten = new BookingConfirm(driver);
		return iten;
	}
	public Logout get_Instance_Logout()
	{
		out = new Logout(driver);
		return out;
	}
}
