package day1.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_getText {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	     
	     driver.manage().window().maximize();
	            
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     driver.findElementByLinkText("Alert with Textbox").click();
        driver.findElementByXPath("//button[@class='btn btn-info']").click();
	          Thread.sleep(900);
	           
	       /* Alert alert = (Alert) driver.switchTo().alert();  
	       alert.sendKeys("Harini");
            alert.accept(); */
	          
	      Thread.sleep(800);  
	       String text = driver.findElementByXPath("//p[@id='demo1']").getText();  
	       System.out.println(text);
	       
	           
	}

}

