package day1.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	               
	     driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	     
	     driver.manage().window().maximize();
	     
	       
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     
	     //driver.findElementByClassName("btn btn-danger").click();
	     
	     driver.findElementByLinkText("Alert with OK").click();
	     
	     driver.findElementByXPath("//button[@class='btn btn-danger']").click();
	     
	     Thread.sleep(400);
	     
	     Alert alert = driver.switchTo().alert();
	     Thread.sleep(1000);
	     alert.accept();
	     
	     System.out.println("Alert Accepted");
	     
	     
	     
	     
	     //driver.quit();
	   

	
	}
	}

