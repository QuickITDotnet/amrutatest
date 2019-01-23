package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
    private WebDriver driver;		
		@Test	
		public void testEasy() {	
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Evening_19_Nov\\jars\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();//local variables
		   
			
			driver.get("http://www.quickitdotnet.co.in");  
			 		
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	

}
