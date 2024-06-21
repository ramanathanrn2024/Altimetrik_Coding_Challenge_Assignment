package com.altimetrik;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.makemytrip.pom.ObjectRepository;
import com.makemytripe.baseclass.BaseClass;

import dev.failsafe.internal.util.Assert;

public class OneWay_Flight_Search_Analysis extends BaseClass {
		
private void takeScreenshot() throws IOException {
	// TODO Auto-generated method stub
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshorts\\intermediate.png"));
}
	
	@Test
	public void onewaySearchAnalysis() throws IOException {

		lunchBrowser();
		ObjectRepository or=new ObjectRepository(driver);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";			
//		Assert.assertEquals(expectedTitle,actualTitle);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		or.enterFromCity("Delhi");
		or.enterToCity("Bangalore");
		or.onewayclick();
		or.searchFlights();
		
//		Multi City Flight Search
		or.mmtLogo();
		or.enterFromCity("Del");
		or.auto_suggested_cities();
		or.multycity();
		or.fromMultyciti("Delhi");
		or.toMultyciti("Kolkata");
		or.toselectMultyciti();
		or.secondMultyciti("Chennai");
		or.toscMultyciti();
		or.departureDate();
		or.searchMultiCity();
		takeScreenshot();
//		or.selectDate();
//		or.searchFlights();
//		System.out.println("Auto Suggested Cities: "+cities);
		

//		//Closing the browser
//		driver.quit();       
		
	}
	
	
}
