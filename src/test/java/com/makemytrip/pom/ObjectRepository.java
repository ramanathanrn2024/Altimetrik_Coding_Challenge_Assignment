package com.makemytrip.pom;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.altimetrik.OneWay_Flight_Search_Analysis;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.makemytripe.baseclass.ExtReporterClass;

public class ObjectRepository {
	private WebDriver driver;
	
//	ExtentReports extent;
	ExtentTest test;
	
	
//	private WebDriver driver;
//	ExtentReports extent = new ExtentReports();
//	ExtentTest test;
//	
	
	public ObjectRepository(WebDriver driver, ExtentTest test){
		this.driver=driver;	
		PageFactory.initElements(driver, this);
		this.test = test;
	}

	//	@FindBy(xpath="(//h3[@class='expired-popup-heading'])[2]")
//	public WebElement expiryPopupMsg;
//	
	
	 	//MakmyTripe 
		@FindBy(xpath="//input[@id='fromCity']") //Prod FedEx acc xpath
		private WebElement findFromCity;
		
		@FindBy(xpath="//input[@id='toCity']")
		private WebElement findToCity;		
			
		@FindBy(xpath="//span[@class='headerIconWrapper']")
		private WebElement onewayclick;
		
		@FindBy(xpath="//p[@data-cy='submit']//a") 
		private WebElement searchFlights;
		
		@FindBy(xpath="//a[@class='chMmtLogo']") 
		private WebElement mmtLogo;	
		
		@FindBy(xpath="//li//div//div//p//span//span") 
		private List<WebElement> auto_suggested_cities;		

		@FindBy(xpath="//li[@data-cy='mulitiCityTrip']//span")
		private WebElement multycity;
		
		@FindBy(xpath="//input[@id='fromAnotherCity0']")
		private WebElement fromMultyciti;	
		
		@FindBy(xpath="//input[@id='toAnotherCity0']")
		private WebElement toMultyciti;	
		
		@FindBy(xpath="//input[@id='toAnotherCity1']")
		private WebElement secondMultyciti;	
		
//		@FindBy(xpath="//p//span//span[text()=mmytripMultiFromCity]")
		@FindBy(xpath="//p//span//span[text()='Kolkata']")
		private WebElement toselectMultyciti;	
		
		@FindBy(xpath="//p//span//span[text()='Chennai']")
		private WebElement toscMultyciti;	
		
		@FindBy(xpath="//div[@aria-label='Mon Jun 24 2024']")
		private WebElement departureDate;
				
		@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity']")
		private WebElement searchMultiCity;	
		
		@FindBy(xpath="//li[@class='menu_Forex']")
		private WebElement forexcard_Currency_icon;
		
		@FindBy(xpath="//div[@class='Marqueestyle__MarqueeContainer-sc-1temmac-3 fZiknN']//ul//li") 
		private List<WebElement> forex_Currency;
		
		@FindBy(xpath="//div[@id='listingPage_multicurrencyCard_logoContainer']") 
		private WebElement Multicurrency_Card;	
		
		//div[@id="listingPage_multicurrencyCard_logoContainer"]
		
		//a[@class="primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity"]
		
		//div[@aria-label="Sun Jun 23 2024"]
		
//		//div[@aria-label="Mon Jun 24 2024"]
				
//		public void selectDate() {
//			LocalDateTime myDateObj = LocalDateTime.now();  			
////		    System.out.println("Before Formatting: " + myDateObj);  
//		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyyy");  		    
//		    String formattedDate = myDateObj.format(myFormatObj);  
//		    System.out.println("After Formatting: " + formattedDate);  
////			LocalDate futureDate = LocalDate.now().plusDays(2);
////			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
////			String dateStr = futureDate.format(formatter);
////			System.out.println(dateStr);
////			return dateStr;
//		    
//		}
		
				
		public void enterFromCity(String fromCity) {
			
			findFromCity.sendKeys(fromCity);
		}		
		public void enterToCity(String toCity) {
			findToCity.sendKeys(toCity);
		}
		public void onewayclick() {
			onewayclick.click();
		}
		public void searchFlights() {
			searchFlights.click();
		}
		public void mmtLogo() {
			mmtLogo.click();
		}
		public void auto_suggested_cities() {
		List<WebElement> cities = auto_suggested_cities;
		for (WebElement webElement : cities) {
			String text = webElement.getText();
			if(!text.trim().equals("NEW")){
				test.log(Status.PASS,"Auto Suggested Cities: "+text);	
//				System.out.println("Auto Suggested Cities: "+text);
				}			
			}
		
		}
		public void multycity() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", multycity);
		}
		public void fromMultyciti(String Multyciti) {
			fromMultyciti.sendKeys(Multyciti);
		}
		public void toMultyciti(String twMultyciti) {
			toMultyciti.sendKeys(twMultyciti);
		}
		public void secondMultyciti(String scMultyciti) {
			secondMultyciti.sendKeys(scMultyciti);
		}
		public void toselectMultyciti() {
			toselectMultyciti.click();
		}
		public void toscMultyciti() {
			toscMultyciti.click();
		}
//		public void departureDate() {			
//			JavascriptExecutor js = (JavascriptExecutor)driver;	
//			js.executeScript("arguments[0].click();", departureDate);
//		}
		public void departureDate() {			
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click();", departureDate);
		}
		public void searchMultiCity() {
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click();", searchMultiCity);
		}
		public void forexcard_Currency_icon() {
			forexcard_Currency_icon.click();
		}
		public void forex_Currency() {
			List<WebElement> fccards = forex_Currency;
			for (WebElement webElement : fccards) {
				String fcrate = webElement.getText();
				String[] mmtfcRateSplit=fcrate.split("₹");
				String  exchangerates = mmtfcRateSplit[0];
				if((exchangerates.trim().equals("EUR"))|| (exchangerates.trim().equals("USD"))|| (exchangerates.trim().equals("NZD"))){					
					test.log(Status.PASS,"FCC Exchange Rates: "+fcrate.replace("₹", ":"));
//					System.out.println("FCC Exchange Rates: "+fcrate.replace("₹", ":"));					
					}			
				}
		}
		public void Multicurrency_Card() {
			Multicurrency_Card.click();	
		}
		
}
