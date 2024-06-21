package com.makemytrip.pom;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytripe.baseclass.BaseClass;


public class ObjectRepository {
	
	private WebDriver driver;
	
	
	public ObjectRepository(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
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
		
		@FindBy(xpath="//p//span//span[text()='Kolkata']")
		private WebElement toselectMultyciti;	
		
		@FindBy(xpath="//p//span//span[text()='Chennai']")
		private WebElement toscMultyciti;	
		
		@FindBy(xpath="//div[@aria-label='Sun Jun 23 2024']")
		private WebElement departureDate;
		
		@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity']")
		private WebElement searchMultiCity;	
		
		//a[@class="primaryBtn font24 latoBold widgetSearchBtn  fltWidgetSearchBtnMultiCity"]
		
		//div[@aria-label="Sun Jun 23 2024"]
		
//		//div[@aria-label="Mon Jun 24 2024"]
				
		public void selectDate() {
			LocalDateTime myDateObj = LocalDateTime.now();  			
//		    System.out.println("Before Formatting: " + myDateObj);  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyyy");  
		    String formattedDate = myDateObj.format(myFormatObj);  
		    System.out.println("After Formatting: " + formattedDate);   
		    
		}
		
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
				System.out.println("Auto Suggested Cities: "+text);
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
		public void departureDate() {			
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click();", departureDate);
		}
		public void searchMultiCity() {
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click();", searchMultiCity);
		}

		
}
