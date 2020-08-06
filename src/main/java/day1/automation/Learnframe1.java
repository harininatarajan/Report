package day1.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/guru99home/");  
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   
	}

}
