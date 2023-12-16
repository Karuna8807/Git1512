package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	driver.get("https://www.facebook.com/");
	driver.get("https://www.amazon.in");
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
