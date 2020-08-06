package day1.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     
	     //String url = "http://demo.automationtesting.in/Windows.html";
	     driver.get("http://demo.automationtesting.in/Windows.html");
	     //driver.get(url);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     
	     String mainwindow = driver.getWindowHandle();
	     
	     System.out.println("The main window id is:" +mainwindow);
	     
	     driver.findElementByXPath("//button[@class='btn btn-primary']").click();
	     
	     Set<String> allwindows = driver.getWindowHandles();
	     
	     List<String> eachwin = new ArrayList <String>(allwindows);
	     
	     for (int i=0;i<=eachwin.size();i++) {
	    	 
	    	 driver.switchTo().window(eachwin.get(1));
	    	 
	    	 System.out.println("Title of the window is:" + driver.getTitle());
	    	 
	    	 
	     }
	     
	     driver.close();
	    
	}

}
