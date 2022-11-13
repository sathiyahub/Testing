package com.qa.pomodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.bases.TestBaseclass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPageclass;

public class LoginTest extends TestBaseclass {
	LoginPageclass loginPage;
	HomePage homepage;
	
	public LoginTest() {
		super(); //immediately access the parent class object
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage =new LoginPageclass();
		
	}
	@Test(priority=1)
public void LoginPageTitleTest() {
		String title=loginPage.validLoginPageTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority=2)
	public void FlipkartLogoTest() {
		boolean flag=loginPage.validFlipkartLogo();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority=3)
	public void LoginPageTest() {
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
