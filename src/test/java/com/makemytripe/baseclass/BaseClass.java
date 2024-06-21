package com.makemytripe.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void lunchBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\ChromeDriver\\chromeDriver.exe");
//		WebDriverManager.chromedriver().setup();
		// Instantiate a ChromeDriver class.			
		driver=new ChromeDriver();
		// Launch Website
		driver.get("https://www.makemytrip.com");
		System.out.println("pass");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	
	public void textField(WebElement element,String text) {
	
		element.clear();
		element.sendKeys(text);
	}

}
