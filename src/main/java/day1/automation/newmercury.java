package day1.automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class newmercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     String url1 = "http://newtours.demoaut.com/";
	     //driver.get("http://newtours.demoaut.com");
	     driver.get(url1);
	     driver.manage().window().maximize();
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Title of the page is:" +driver.getTitle());
	     
	     
	    driver.findElementByName("userName").sendKeys("harini");
	     driver.findElementByName("password").sendKeys("duchu");
	     driver.findElementByName("login").click();
	     
	     System.out.println(driver.getTitle());
	     
	    /* driver.findElementByLinkText("REGISTER").click();
	     driver.findElementById("email").sendKeys("harini");
	     driver.findElementByName("password").sendKeys("duchu");
	     driver.findElementByName("confirmPassword").sendKeys("duchu");
	     driver.findElementByName("register").click();
	     System.out.println(driver.getTitle());*/
	     
	     
	     
	     		 	
	}

}
