package com.automation.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class genericClass {

		public static WebDriver driver = null;
		public static String baseURL="http://www.5elementslearning.com/demosite";
	
		public static void setDriver() throws Exception{
			System.setProperty("webdriver.chrome.driver","D:\\BUSINESS\\5 ELEMENTS LEARNING\\SELENIUM WEBDRIVER\\NEWDRIVER\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(baseURL);
	}
		
		public static void CloseBrowser() throws Exception{
			driver.quit();
		}
	
		public static boolean isElementPresent(By by) {
			boolean isPresent = true;
			try{
				driver.findElement(by);
			 }catch (NoSuchElementException e) {
				 isPresent = false;
				 }
			return isPresent;
			}
	}
