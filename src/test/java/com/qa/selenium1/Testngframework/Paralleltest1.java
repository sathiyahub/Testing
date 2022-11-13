package com.qa.selenium1.Testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Paralleltest1 {
	WebDriver driver=null;
	
	@Test(threadPoolSize=3,invocationCount=4,timeOut=1000)
	public void test1() throws Exception {
		System.out.println("Iam in test method 1 | " + Thread.currentThread().getId());	
		
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("Iam in test method 2 | " + Thread.currentThread().getId());	
		

}
	@Test
	public void test3() {
		System.out.println("Iam in test method 3 | " + Thread.currentThread().getId());
	}
	}
