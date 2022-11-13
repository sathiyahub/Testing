package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	public static void captureScreenshot(WebDriver driver,String stingname)  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyaprya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	  //WebDriver driver=new ChromeDriver();
	  
	try {
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\sathiyaprya\\eclipse-workspace\\Testngframework\\Screenshot\\"+ stingname + ".png"));
		System.out.println("take screenshot successfully");
		} 
		
		catch (Exception e) {
			System.out.println("Exception while taking screenshot"+e.getMessage());
			
		}
		
	}

	public static void captureScreenshot1(WebDriver driver, String stingname) {
		
		
	}
	

}
