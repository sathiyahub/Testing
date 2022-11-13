package com.qa.pomodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.bases.TestBaseclass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPageclass;
import com.qa.pages.MobilePage;

public class HomeTest extends TestBaseclass {
	LoginPageclass loginPage;
	HomePage homepage;
	MobilePage mobilepage;
	
	public HomeTest() {
		super(); //immediately access the parent class object
	}
	//testcase should be separated--independant which each other
	
	@BeforeMethod
	public void setUp() {
		intialization();
		mobilepage=new MobilePage();
		loginPage =new LoginPageclass();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	//@Test(priority=1)
	@Test(enabled=false)
	public void verifyHomePageTitle() {
		String title=homepage.verifyHomePagetitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority=2)
	public void verifymobileLink() {
		mobilepage=homepage.clickOnmobileLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
