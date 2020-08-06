package day1.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     String url = "http://www.google.com";
     driver.get("http://www.google.com");
     driver.get(url);
     
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     System.out.println("Title of the page is:" +driver.getTitle());
     
     driver.close();
	 	
	}
}
