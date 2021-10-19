package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEST\\Documents\\Selenium download and exrct file\\chromedriver_win32\\chromedriver.exe\\");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");  //get the url link
	
	driver.navigate().to("https://www.facebook.com/"); //nav to new link
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	

	
      String title = driver.getTitle();	
      System.out.println(title);
      
      String currentUrl = driver.getCurrentUrl();
      System.out.println(currentUrl);
      
      driver.manage().window().maximize(); //maximize the window
      
      driver.manage().window().fullscreen(); //full screen 
      
      
      driver.close();  //close the current tab
  	
  	driver.quit();  //closes the entire window or browser 
	}

}
