package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageVerification {
	
	WebDriver driver = PageSetup.getDriver();
	
	public PageVerification PageStatus() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		Object status = jse.executeScript("return document.readyState");
		System.out.println("Page Status :"+ status);
		return this;
	}
	
	public PageVerification menuLinks() {
		List<WebElement> listOfMenu = driver.findElements(By.xpath("//ul//a"));
		System.out.println("Total menu links are "+listOfMenu.size());
		System.out.println("Menu links :");
		for(WebElement ele : listOfMenu) {
			System.out.println(ele.getText());
		}
		return this;
	}
}
