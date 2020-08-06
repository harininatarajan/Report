package learndata_driven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex5 {
	//@Parameters({"url","email","password"})
	
	
	@Test (dataProvider="fetchData")

	public void loginmethod(String url, String email,String password) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //String url = "http://ui.freecrm.com";
	    //driver.get("http://newtours.demoaut.com");
	    driver.get(url);
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("Title of the page is:" +driver.getTitle());
	    driver.findElementByName("email").sendKeys(email); 
	    driver.findElementByName("password").sendKeys(password); 
	    driver.findElementById("//*[@id=\"ui\"]/div/div/form/div/div[3]").click();
	    
	}

}
