package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.bases.TestBaseclass;

public class HomePage extends TestBaseclass {
	
	@FindBy(xpath="//img[@alt='Mobiles']")
	WebElement mobileLink;
	
	@FindBy(xpath="//img[@alt='Appliances']")
	WebElement applianceLink;
	
	@FindBy(xpath="//a[text()='Flights']")
	WebElement FlightsLink;
	
	@FindBy(xpath="//a[@title='Washing Machine']")
	WebElement WashingMachineLink;
	
	@FindBy(xpath="//img[@alt='2-Wheelers']")
	WebElement twoWheelerLink;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this); //intialize pagefactory
		
	}
	public String verifyHomePagetitle() {
		return driver.getTitle();
		
	}
	
	public MobilePage clickOnmobileLink() {
		mobileLink.click();
		return new MobilePage();
	}
public Appliancepage clickOnapplianceLink() {
	applianceLink.click();
	return new Appliancepage();
}

public  Appliancepage clickOnFlightsLink() {
	FlightsLink.click();
	return new  Appliancepage();
	}


public Appliancepage clickOnWashingMachineLink() {
	WashingMachineLink.click();
	return new  Appliancepage();

}

public TwoWheelerPage clicktwoWheelerLink() {
	twoWheelerLink.click();
	return new TwoWheelerPage();
}

}


