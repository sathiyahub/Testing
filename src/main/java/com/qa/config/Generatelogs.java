package com.qa.config;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generatelogs {
	public static void main(String[]args) {
	Logger logs=Logger.getLogger(Generatelogs.class); //get logger appache import packages
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	logs.info("launching browser");
	driver.get("https://www.flipkart.com/");
	logs.info("Flipkart url succesfully launch");
	String title=driver.getTitle();
	System.out.println("the title is"+title);
	logs.info("the title is"+title);
	if(logs.equals("Flipkart")) {
		System.out.println("correct the flipkart title");
		logs.info("correct title is passed");
	}
	else {
	
		System.out.println("correct the flipkart not title");
		logs.info("flipkart title is failed");
	}

}}
