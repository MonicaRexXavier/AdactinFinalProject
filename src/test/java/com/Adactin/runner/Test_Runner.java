package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.helper.File_Reader_Manager;
import com.adactin1.Baseproject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactin//feature",
glue="com.Adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = false,
tags =("@SmokeTest,@SanityTest"),
plugin = {"html:Report/HTML_Report", "pretty",
		"json:Report/CucumberJSON_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
public class Test_Runner{
	
	public static WebDriver driver;//----null driver
	
	@BeforeClass
	public static void set_up() throws Throwable
	{
		 String b = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		driver = Baseproject.getDriver(b);
	}
	@AfterClass
	public static void tear_down()
	{
		driver.close();
	}
	
}