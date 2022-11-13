package com.qa.bases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBaseclass {
	
	public static WebDriver driver; //global variable
	public static Properties prop;
	
	public TestBaseclass() {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\sathiyaprya\\eclipse-workspace\\Testngframework\\src\\main\\java\\com\\qa\\config\\qa.configproperties");
			prop.load(file);
		}
		catch(FileNotFoundException e) {
		e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}}
		
		public static void intialization() {
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();	
			
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().refresh();
			driver.get(prop.getProperty("url"));
			
			
	}
	

}
