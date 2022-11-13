package com.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		//how to properties file
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\sathiyaprya\\eclipse-workspace\\Testngframework\\src\\main\\java\\com\\qa\\config\\qa.configproperties");
		prop.load(file);
		
		System.out.println(prop.getProperty("browser"));
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sathiyaprya\\Downloads\\geckodriver-v0.32.0-win32 (2)\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
		System.out.println("Browser value is not given");}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("Flipkart_logo_name"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("user_name"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("pass_word_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("logintbtn"))).click();
		
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

}
