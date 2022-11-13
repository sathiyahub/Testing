package com.qa.selenium1.Testngframework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelhandleTest {
	
	@Test(dataProvider="testdata")
  public void mainTest1(String username, String password) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("username");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	  
	 System.out.println("Login successful");  
  }
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed()
	{
		
		ReadExcelFile file=new ReadExcelFile("C:\\Users\\sathiyaprya\\OneDrive\\Documents\\mail.xlsx");
		int rowcount=file.getRowCount(0);
		Object[][] credential=new Object[rowcount][2];
		for(int i=0;i<rowcount;i++) {
			credential[i][0]=file.getData(0, i, 0);
			credential[i][1]=file.getData(0, i, 1);		
		}
		return credential;
		
		
	}
}
