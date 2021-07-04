package com.Adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable{
	File f = new File("C:\\Users\\harmo\\eclipse-workspace\\AdactinFinalProject1\\src\\test\\java\\com\\Adactinsite\\heleper\\configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p= new Properties();
	p.load(fis);
	
	}
	
	
	
	public String get_Browser() {
		String browser= p.getProperty("browser");
		return browser;
		
	}
	
	public String get_url() {
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String get_ccnum() {
		String ccno = p.getProperty("ccno");
		return ccno;
	}
	
	public String get_cctype() {
		String cctype = p.getProperty("cctype");
		return cctype;
		
	}
	
	public String get_cvv() {
		String cvvno =p.getProperty("cvvno");
		return cvvno;
	}

}
