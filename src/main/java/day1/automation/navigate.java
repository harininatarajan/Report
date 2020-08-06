package day1.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     
	    
         // driver.get("http://www.google.com");
	     
	     driver.navigate().to("http://www.facebook.com");
	     
	     driver.manage().window().maximize();
	     // Using Back command navigate to back page
	     driver.navigate().back();                       
	 
	     // Using Forward command navigate to forward page
	     driver.navigate().forward();                                                                       
	 
	     // Using Refresh command Refresh current page
	     driver.navigate().refresh();
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     
	     driver.quit();
	     }
	}


