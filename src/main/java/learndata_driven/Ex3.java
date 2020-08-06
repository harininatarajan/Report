package learndata_driven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex3 {

	@Test (dataProvider="fetchData")

	public void loginmethod(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String url1 = "https://phptravels.org/clientarea.php";
	    //driver.get("http://newtours.demoaut.com");
	    driver.get(url1);
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("Title of the page is:" +driver.getTitle());
	    driver.findElementByName("username").sendKeys(username); 
	    driver.findElementByName("password").sendKeys(password); 
	    driver.findElementById("recaptcha-anchor").click();
		
	    driver.findElementById("login").click();
	    
	   
	}
	@DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return Ex4.readexceldata();
		
	}

}