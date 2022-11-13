package com.qa.selenium1.Testngframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class Takescreenshots {
	@Test
	public void captureScreenshot() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.flipkart.com/");
		 Utility.captureScreenshot(driver, "Browser started");
		  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("username");
		  
		  Utility.captureScreenshot(driver, "enter username");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  
//TakesScreenshot shot=(TakesScreenshot)driver;
//File src=shot.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src, new File("C:\\Users\\sathiyaprya\\eclipse-workspace\\Testngframework\\Screenshot\\Filpkart.png"));
//System.out.println("take screenshot successfully");
	}

}
