package com.qa.selenium1.Testngframework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class PaginationFlipkartMobiles {
	WebElement clickbtn;
	static String nextClassName;
	@Test
	public void pagination() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?");
		 
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");	 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//JavascriptExecutor js=(JavascriptExecutor) driver;
//js.executeScript("scrollBy(0,2500)");
List<String>arr=new ArrayList<String>();
int pagesize=driver.findElements(By.xpath("//div[@class='a-section a-text-center s-pagination-container']//a")).size();
System.out.println(pagesize);
if(pagesize>0) {
	
	clickbtn=driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
	nextClassName=clickbtn.getAttribute("class");
	//if(!nextClassName.contains("disabled")) {
	clickbtn.click();		
	}
	
}
	
	
{
	//System.out.println("not paginate this page");
}

}
	


	


