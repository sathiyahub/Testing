package com.qa.selenium1.Testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParalleltestBrowser {
	WebDriver driver;
	@Test
	public void Test1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?");
	Thread.sleep(3000);
	driver.close();
	}
	@Test
public void test2() throws InterruptedException {
System.setProperty("webdriver.ie.driver","C:\\Users\\sathiyaprya\\Downloads\\IEDriverServer_Win32_4.5.0\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.close();


}}
