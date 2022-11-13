package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.bases.TestBaseclass;

public class LoginPageclass extends TestBaseclass{
	
	//Page Factory or object repository
	//username xpath
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement username;
	
	
	
	//password xpath
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	//Login xpath
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement logintbtn;
	
	//Flipkart logo xpath
	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement Flipkart_logo_name;
	
	public LoginPageclass() {
		PageFactory.initElements(driver, this); //intialize pagefactory
		
	}
	//actions:
	public String validLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validFlipkartLogo() {
		return Flipkart_logo_name.isDisplayed();
	}
	public HomePage login(String us, String paswd) { //homepage return in login
		
	username.sendKeys(us);
	password.sendKeys(paswd);
	logintbtn.click();
	return new HomePage();
	}
	}
	
	

