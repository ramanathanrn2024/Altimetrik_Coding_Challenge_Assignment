package com.makemytripe.baseclass;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;



public class BaseClass {
	
	public static WebDriver driver;
	public static String mmytripFromCity="Delhi";
	public static String mmytripToCity="Bangalore";
	public static String mmytripFromShotName="Del";
	public static String mmytripMultiFromCity="Kolkata";
	public static String mmytripMultiToCity="Chennai";
	public static String filename="takescreenshrt";
	
	
	public static void lunchBrowser() {
		System.setProperty("WebDriver.Chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\ChromeDriver\\chromeDriver.exe");
//		WebDriverManager.chromedriver().setup();
		// Instantiate a ChromeDriver class.			
		driver=new ChromeDriver();
		// Launch Website
		try {
			driver.get("https://www.makemytrip.com");
		} catch (Exception e) {
			System.err.println("[ERROR] Unable to launch" + "https://www.makemytrip.com" + e.toString());
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("[PASSED]" + "browser launched maximized successfully");
		
	}
////		driver.get("https://www.makemytrip.com");
//		System.out.println("pass");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//
//	}
	
	public void textField(WebElement element,String text) {
	
		element.clear();
		element.sendKeys(text);
	}

}
