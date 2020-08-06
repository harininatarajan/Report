package learndata_driven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex1 {
	
	
@Parameters({"url","username","password"})
	
	
@Test //(dataProvider="fetchData")

public void loginmethod(String url, String username,String password) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //String url1 = "https://opensource-demo.orangehrmlive.com/";
    //driver.get("http://newtours.demoaut.com");
    driver.get(url);
    driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl());
    System.out.println("Title of the page is:" +driver.getTitle());
    
    driver.findElementByName("txtUsername").sendKeys(username); 
    driver.findElementByName("txtPassword").sendKeys(password); 
    
    driver.findElementByName("Submit").click();
    
}

  /* @DataProvider(name="fetchData")
public String[][] readdata() throws IOException {
	
	return Ex2.readexceldata();*/
	
}
 
