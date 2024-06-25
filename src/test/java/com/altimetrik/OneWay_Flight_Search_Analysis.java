package com.altimetrik;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.makemytrip.pom.ObjectRepository;
import com.makemytripe.baseclass.BaseClass;
import com.makemytripe.baseclass.ExtReporterClass;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dev.failsafe.internal.util.Assert;

//@Listeners(Liste/nTest.class)
public class OneWay_Flight_Search_Analysis extends BaseClass {	
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeClass
	public void beforeTest() {
		extent = ExtReporterClass.getInstance();
		test = ExtReporterClass.createExtentTest("MakeMyTrip Application Scenarios Validation Test Report");
	}
	@AfterClass
	public void afterClass() {
		ExtReporterClass.flushReport();
	}	
	
private void takeScreenshot() throws IOException {
	// TODO Auto-generated method stub
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshorts\\intermediate.png"));
	}

	@Test
	public void onewaySearchAnalysis() throws IOException {

//		Lunch Browser
		lunchBrowser();
		ObjectRepository or=new ObjectRepository(driver, test);		
		String actualTitle = driver.getTitle();
		test.log(Status.PASS,"Browser Title:"+actualTitle);
//		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";			
//		Assert.assertEquals(expectedTitle,actualTitle);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
//		Scenario 1: One-Way Flight Search and Filter Analysis Scenarios
		test.log(Status.PASS,"Make My Trip One-Way Flight Search and Filter Analysis");		
		or.enterFromCity(mmytripFromCity);		
		test.log(Status.PASS,"MMY From City Sucessfully Entered:"+mmytripFromCity);		
		or.enterToCity(mmytripToCity);
		test.log(Status.PASS,"MMY TO City Sucessfully Entered:"+mmytripToCity);	
		or.onewayclick();		
		or.searchFlights();
		test.log(Status.PASS,"One way flight From and To details updated and click Search");	
		//MakeMyTrip Application getting error after clicking Search button and tried multiple times and getting same issue:
		//1. Log all the flight names in ascending order by the departure time.From “Popular Filters”, filter the airlines by “Indigo” and log all the Flight number, Departure time, Arrival time, and Price/Adult respectively as below:
		//2. 6E6188 13:00 15:40 Rs.9100
		//3. 6E6288 14:20 18:30 Rs.9100
		//4. Filter the “Non-Stop” and the cheapest Indigo flight. Log its Flight number and its fare (Using of stream APIs would be a BONUS).
		//5. Click on “View Prices” of the cheapest Indigo flight as in the previous point.
		//6. Click on “Book Now” under the "Saver” Section. [Handle dynamic pop-ups if any] and log the 
		//7. “Fare Summary” which includes “Base Fare”, “Tax and Surcharges”, and “Total Amount”.
		//8. Close the new “make-my trip” tabs opened if any.
		
		
//		Scenario 2: Multi City Flight Search Scenarios
		test.log(Status.PASS,"Multi City Flight Search");	
		or.mmtLogo();
		test.log(Status.PASS,"Sucessfully Moved Make My Trip Home Page");	
		or.enterFromCity(mmytripFromShotName);
		test.log(Status.PASS,"Multi From City Sucessfully Entered:"+mmytripFromShotName);
		or.auto_suggested_cities();		
		or.multycity();
		or.fromMultyciti(mmytripFromCity);
		test.log(Status.PASS,"Multi TO City Sucessfully Entered:"+mmytripFromCity);		
		or.toMultyciti(mmytripMultiFromCity);		
		or.toselectMultyciti();
		test.log(Status.PASS,"Multi TO City Sucessfully Entered:"+mmytripMultiFromCity);
		or.secondMultyciti(mmytripMultiToCity);
		or.toscMultyciti();
		test.log(Status.PASS,"Multi TO City Sucessfully Entered:"+mmytripMultiToCity);
		or.departureDate();
		test.log(Status.PASS,"Multi City Departure dates updated Sucessfully");
		or.searchMultiCity();
		test.log(Status.PASS,"Multi City Departure Search dates buton clicked Sucessfully ");
		takeScreenshot();
		test.log(Status.PASS,"Multi City after Entring Departure dates seach taken screen shot for“Hold on, we’re fetching flights for you”. ");

//		Scenario 3:Forex Card and Currency Scenarios
		test.log(Status.PASS,"Forex Card and Currency");	
		or.mmtLogo();
		test.log(Status.PASS,"Sucessfully Moved Make My Trip Home Page");	
		or.forexcard_Currency_icon();
		test.log(Status.PASS,"Sucessfully Clicked on “Forex card and Currency icon”.");
		or.forex_Currency();
		test.log(Status.PASS,"Sucessfully taken Forex Currency Details");
		or.Multicurrency_Card();
		test.log(Status.PASS,"Sucessfully clicked Multicurrency Card");
		//MakeMyTrip Application is getting error after clicking on “Multicurrency Card” and tried multiple times and getting same issue:
		//1. Log the definition of Multi Currency Card:
		//2. “A Multicurrency Card is a prepaid card designed specifically for international travelers. It is fully compliant with RBI regulations and provides peace of mind with 100% acceptance at all merchants in over 150 countries. It also provides digital controls within the app, allowing you to lock/unlock the card instantly and offers several benefits, without the need to link your bank account to the card.”
		//3. Log the Multi Currency Card in the following way:
		//4. Every alternate word in the definition should be reversed like below:
		//5. A ycneruccitluM Card si a diaprep card dengised specifically rof international .srelevart It si fully tnalpmoc with IBR regulations dna provides ecape of dnim with %001 acceptance ta all stnahcrem ni over 051 .seirtnuoc It osla provides latigid controls nihtiw the ,ppa allowing uoy to /kcolnu lock the drac yltniatsni dna offers lareves benefits ,tuohtiw the deen to knil your knab account ot the .dra


//		Closing the browser
		extent.flush();
		driver.quit(); 
		test.log(Status.PASS,"Sucessfully Scripts Executed Completed :One-Way Flight Search Filter Analysis Multi City Flight Search and Forex Card and Currency");	
	}	
}
