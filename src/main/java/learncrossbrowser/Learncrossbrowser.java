package learncrossbrowser;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Learncrossbrowser extends LearnDriver {
	
	@Test (dataProvider="fetchData")

	public void loginmethod( String username,String password) throws IOException {
		
	   
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	   
	    driver.findElement(By.name("txtPassword")).sendKeys(password); 
	    
	    driver.findElement(By.name("Submit")).click();
	    
	    screencapture();
	    
	}

	  @DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return Ex2.readexceldata();
		
	}
	        
	}
