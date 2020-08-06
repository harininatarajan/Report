package learncrossbrowser;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LearnDriver {
	
	public static WebDriver driver;
	
	@Parameters({"browser"})
	
	@BeforeMethod
	public void intialize_driver(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			} 
			
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			     driver = new FirefoxDriver();
				} 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    String url = "https://opensource-demo.orangehrmlive.com/";
		    //driver.get("http://newtours.demoaut.com");
		    driver.get(url);
		    driver.manage().window().maximize();
		    System.out.println(driver.getCurrentUrl());
		    System.out.println("Title of the page is:" +driver.getTitle());
	}
	
	public static void screencapture() throws IOException {
	TakesScreenshot schot =(TakesScreenshot) driver;
	File scr = schot.getScreenshotAs(OutputType.FILE);
	File tgt = new File("./snapshot/img.png");
	FileUtils.copyFile(scr, tgt);
	
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
