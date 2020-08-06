package day1.automation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();  	
       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       String baseURL = "https://www.irctc.co.in/eticketing/userSignUp.jsf";
       driver.get(baseURL);
       String mainwin = driver.getWindowHandle();
       System.out.println(mainwin);
       driver.findElementByLinkText("Contact Us").click();
       
       Set <String> Allwindows = driver.getWindowHandles();
       System.out.println(Allwindows.size());
       
       List <String> ls = new ArrayList<String>(Allwindows);
       driver.switchTo().window(ls.get(0));
       System.out.println("Title of the page is : "+driver.getTitle());
       System.out.println("CurrentURL is "+driver.getCurrentUrl());
       driver.switchTo().window(ls.get(0));
       driver.close();
       driver.switchTo().window(ls.get(1));
       System.out.println("Title of the page is :"+driver.getTitle());
       System.out.println("CurrentURL is "+driver.getCurrentUrl());
	}

}
