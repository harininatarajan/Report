package day1.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_text {

	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             
	     driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	     
	     driver.manage().window().maximize();
	            
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     driver.findElementByLinkText("Alert with OK & Cancel").click();
         driver.findElementByXPath("//button[@class='btn btn-primary']").click();
	      
	     Thread.sleep(400);
	           
	     Alert alert = (Alert) driver.switchTo().alert();  
         
	     alert.accept();  
	      Thread.sleep(400);  
	       String text = driver.findElementByXPath("//p[@id='demo']").getText();  
	       System.out.println(text);
	       
	           
	}

}
