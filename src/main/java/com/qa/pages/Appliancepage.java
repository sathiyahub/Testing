package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.bases.TestBaseclass;

public class Appliancepage extends TestBaseclass{
	@FindBy(xpath="//img[@alt='Appliances']")
	WebElement applianceLink;
	
	@FindBy(xpath="//a[text()='Flights']")
	WebElement FlightsLink;
	
	@FindBy(xpath="//a[@title='Washing Machine']")
	WebElement WashingMachineLink;
	
	public Appliancepage clickOnapplianceLink() {
		applianceLink.click();
		return new Appliancepage();
		
	}
	
	public Appliancepage clickOnFlightsLink() {
		FlightsLink.click();
		return new Appliancepage();
		
	}
	public Appliancepage clickOnWashingMachineLink() {
		WashingMachineLink.click();
		return new Appliancepage();
	}
}