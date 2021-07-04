package com.Adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Adactin.helper.File_Reader_Manager;
import com.Adactin.helper.Page_Object_Manager;
import com.Adactin.runner.Test_Runner;
import com.adactin1.Baseproject;
import com.adactin1.Book_Now;
import com.adactin1.BookingConfirm;
import com.adactin1.Loginpage;
import com.adactin1.Logout;
import com.adactin1.Search;
import com.adactin1.Selecthotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseproject {
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    String url = File_Reader_Manager.getInstance().getInstanceCR().get_url();
	  site(url);
	 
	}
	@When("^user Enter The \"([^\"]*)\"  In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		sndk(pom.get_Instance_Login().user, username); 
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		 sndk(pom.get_Instance_Login().pw,password);  
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel() throws Throwable {
		ck(pom.get_Instance_Login().login);
		Thread.sleep(3000);

	    }
	@When("^user Select The Location of The Hotel In Location Field$")
	public void user_Select_The_Location_of_The_Hotel_In_Location_Field() throws Throwable {
				selectvalue(pom.get_Instance_Search().location,"Sydney");
	}

	@When("^user Select The Hotel Name In Hotels Field$")
	public void user_Select_The_Hotel_Name_In_Hotels_Field() throws Throwable {
		selectvalue(pom.get_Instance_Search().hotels,"Hotel Sunshine");
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
	  selectvisibletext(pom.get_Instance_Search().room,"Super Deluxe");
	}

	@When("^user Select The Number Of Rooms In Number of Room Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_of_Room_Field() throws Throwable {
	   selectvisibletext(pom.get_Instance_Search().roomnum,"7 - Seven");
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		
	    
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	   
	}

	@When("^user Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
	    selectvisibletext(pom.get_Instance_Search().adultroom,"2 - Two");
	}

	@When("^user Select The Childrens Per Room In Children Per Room Field$")
	public void user_Select_The_Childrens_Per_Room_In_Children_Per_Room_Field() throws Throwable {
		 selectvisibletext(pom.get_Instance_Search().childroom,"4 - Four");
	    	}

	@Then("^user Click On The Search Button And It Navigate To select Hotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_select_Hotel() throws Throwable {
	    ck(pom.get_Instance_Search().search);
	}

	@When("^user Press The Radio button In The Field Select To Select Hotel$")
	public void user_Press_The_Radio_button_In_The_Field_Select_To_Select_Hotel() throws Throwable {
	  ck(pom.get_Instance_Selecthotel().selhotel);
	}

	@Then("^user Click On Continue Button And It Navigate To Book A Hotel$")
	public void user_Click_On_Continue_Button_And_It_Navigate_To_Book_A_Hotel() throws Throwable {
	    ck(pom.get_Instance_Selecthotel().cont);
	}

	@When("^user Enter Their Firstname In First Name Field$")
	public void user_Enter_Their_Firstname_In_First_Name_Field() throws Throwable {
		sndk(pom.get_Instance_Booknow().firstname,"Monica");
	   
	}

	@When("^user Enter Their Lastname In Last Name Field$")
	public void user_Enter_Their_Lastname_In_Last_Name_Field() throws Throwable {
		sndk(pom.get_Instance_Booknow().lastname,"RexXavier");
	}

	@When("^user Give The Address In Billing Address Field$")
	public void user_Give_The_Address_In_Billing_Address_Field() throws Throwable {
		sndk(pom.get_Instance_Booknow().add,"9181 Vanguard Ln,Fredrick,MD-210712");
	   
	}

	@When("^user Enter Credit Card Number In Credit Card No\\. Field$")
	public void user_Enter_Credit_Card_Number_In_Credit_Card_No_Field() throws Throwable {
		Thread.sleep(2000);
		String ccno = File_Reader_Manager.getInstance().getInstanceCR().get_ccnum();
		sndk(pom.get_Instance_Booknow().ccnum,ccno);
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		String cctype = File_Reader_Manager.getInstance().getInstanceCR().get_cctype();
		selectvisibletext(pom.get_Instance_Booknow().cctype,cctype);
	  	}

	@When("^user Select The Month In Expiry Month Field$")
	public void user_Select_The_Month_In_Expiry_Month_Field() throws Throwable {
		selectvisibletext(pom.get_Instance_Booknow().expmonth,"November");

	}

	@When("^user Select The Year In Expiry Year Field$")
	public void user_Select_The_Year_In_Expiry_Year_Field() throws Throwable {
		selectvisibletext(pom.get_Instance_Booknow().expyear,"2022");
		Thread.sleep(2000);
	}

	@When("^user Enter CVV Number In CVV Number Field$")
	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvvno = File_Reader_Manager.getInstance().getInstanceCR().get_cvv();
	   sndk(pom.get_Instance_Booknow().cvv,cvvno);
	}

	@Then("^user Click On Book Now Button And It Navigate To Booking Confirmation$")
	public void user_Click_On_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation() throws Throwable {
	   ck(pom.get_Instance_Booknow().booknow);
	   Thread.sleep(2000);
	}

	@Then("^user Click On My Itinerary Button And It Navigate To Booked Itinerary$")
	public void user_Click_On_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary() throws Throwable {
		ck(pom.get_Instance_Bookingconfirm().myitn);
		Thread.sleep(2000);
	   
	}

	@When("^user Click On Booked Itinerary Check Box$")
	public void user_Click_On_Booked_Itinerary_Check_Box() throws Throwable {
		ck(pom.get_Instance_Logout().chkbox);
	  
	}

	@Then("^user Click On Logout Button And It Navigate To HomePage$")
	public void user_Click_On_Logout_Button_And_It_Navigate_To_HomePage() throws Throwable {
	  ck(pom.get_Instance_Logout().out);
	}


}