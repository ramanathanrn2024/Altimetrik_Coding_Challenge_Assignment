//package com.altimetik.mainclass;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.PageFactory;
//
//import com.makemytrip.pom.ObjectRepository;
//import com.makemytripe.baseclass.BaseClass;
//
//public class MainClass {
//	
//	@Test
//	public static void onewaySearchAnalysis() {
//		ObjectRepository or=new ObjectRepository();
//		PageFactory.initElements(driver, or);
//		BaseClass base = new BaseClass();
//		
//		lunchBrowser();
//		System.out.println("-----"+or.findFromCity);
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";			
////		Assert.assertEquals(expectedTitle,actualTitle);
//		base.textField(or.findFromCity,"Delhi");
////		or.findFromCity.sendKeys("Delhi");
////		ObjectRepository.findToCity.sendKeys("Bangalore");
//		
////		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Delhi");
////		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
//		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Bangalore");
////		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();
//
////		//Closing the browser
//		driver.quit();       
//		
//	}
//
//}
