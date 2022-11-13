package com.qa.pomodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendTestnGReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
public void setUp() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);}
	@BeforeTest()
	public void beforeTest() {
        String projectpath=System.getProperty("user.dir");
        System.out.println(projectpath);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();	
	}
	
	@Test
public void test1() throws Exception {
		
		ExtentTest parent = extent.createTest(getClass().getName());
		driver.get("https://www.flipkart.com/");
		parent.pass("Navigated to flipkart");
		// log(Status, details)
        parent.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        parent.info("This step shows usage of info(details)");
        
        // log with snapshot
        parent.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("Screenshot.png").build());
        // test with snapshot
        parent.addScreenCaptureFromPath("Screenshot.png");
        
}
	public void tearDownTest() {
	driver.close();
	driver.quit();}
	
	@AfterSuite
public void tearDown() {
		extent.flush();
}
}