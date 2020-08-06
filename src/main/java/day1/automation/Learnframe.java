package day1.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  String baseURL = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
  String name= "Hello harini how are you today?";
  driver.get(baseURL);
  driver.switchTo().frame("iframeResult");
  driver.findElementByXPath("//button[text()='Try it']").click();
  driver.switchTo().alert().sendKeys("harini");
  driver.switchTo().alert().accept();
  String acualText = driver.findElementById("demo").getText();
  System.out.println(name);
  System.out.println(acualText);
  if(acualText.contains(name))
  {
	  System.out.println("name is verified successfully");
  }
  else
  {
	  System.out.println("name not verified");
  }
  driver.switchTo().defaultContent();
	}
}

			  
			  

