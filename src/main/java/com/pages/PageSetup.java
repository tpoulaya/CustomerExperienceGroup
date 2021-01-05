package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSetup {
	
	static WebDriver driver;
	
	public void setUpApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.customerexperiencegroup.com/");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public ContactUsPage naviagteToContactPage() {
		driver.get("https://www.customerexperiencegroup.com/contact-us");
		return new ContactUsPage();
	}
}
