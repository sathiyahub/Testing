package com.qa.pomodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.bases.TestBaseclass;
import com.qa.pages.Appliancepage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPageclass;

public class ApplianceTest extends TestBaseclass {
	LoginPageclass loginPage;
	HomePage homepage;
	Appliancepage appliancepage;
	
	public ApplianceTest() {
		super(); //immediately access the parent class object
	}
@BeforeMethod
public void setUp() {
	intialization();
	appliancepage=new Appliancepage();
	loginPage =new LoginPageclass();
	homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	
}
@Test(priority=1)
public void verifyapplianceLink() {
	appliancepage=homepage.clickOnapplianceLink();
	
}

@Test(priority=2)
public void verifyFlightsLink() {
	appliancepage=homepage.clickOnFlightsLink();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}

