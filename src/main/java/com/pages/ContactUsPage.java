package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends PageSetup {
	
	@FindBy(id = "edit-submitted-wrapper-name")
	private WebElement name;
	
	@FindBy(id ="edit-submitted-wrapper-email")
	private WebElement email;
	
	@FindBy(id ="edit-submitted-wrapper-phone")
	private WebElement phone;
	
	@FindBy(id ="edit-submitted-wrapper-countryselect")
	private WebElement countrySelect;
	
	@FindBy(id ="edit-submitted-wrapper-company")
	private WebElement company;
	
	@FindBy(id ="edit-submitted-wrapper-position")
	private WebElement position;
	
	@FindBy(id ="edit-submitted-wrapper-productcatgory")
	private WebElement productCatgory;
	
	@FindBy(id ="edit-submitted-wrapper-howaboutus")
	private WebElement howabtUs;
	
	@FindBy(id ="edit-submitted-message")
	private WebElement message;
	
	@FindBy(xpath ="//input[@name='op']")
	private WebElement submitBtn;
	

	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateContactUs() throws Exception {
		Thread.sleep(1000);
		if(name.isDisplayed()) {
			System.out.println("Yes name field is displayed");
		}
		name.sendKeys("Poul");
		email.sendKeys("poul@abc.com");
		phone.sendKeys("6473929902");
		new Select(countrySelect).selectByIndex(2);
		company.sendKeys("Oracle");
		position.sendKeys("Senior QA");
		new Select(productCatgory).selectByIndex(4);
		new Select(howabtUs).selectByIndex(3);
		message.sendKeys("This is the message");
		
		submitBtn.click();
	}
	
}
