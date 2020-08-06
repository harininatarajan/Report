package day1.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     String url = "http://www.erail.in";
	     driver.get(url);
	     
	     driver.manage().window().maximize();
	     
	     //
	     
	     driver.findElementById("txtStationFrom").clear();
	     driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
	     
	     driver.findElementById("txtStationTo").clear();
	     driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
	     
	     WebElement chkele = driver.findElementById("chkSelectDateOnly");
	     
	     driver.findElementById("buttonFromTo").click();
	     
	     if (chkele.isSelected()) {
	    	 chkele.click();
	     }
	     
	     WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	     List<WebElement> allrows = table.findElements(By.tagName("tr"));
	     
	     for (int i=0;i<=allrows.size()-1;i++) {
	    	 WebElement rows = allrows.get(i);
	    	 
	    	 List<WebElement> allcols = rows.findElements(By.tagName("td"));
	          	 String text = allcols.get(1).getText();
	        	 System.out.println(text);
	         
	     }
	     
	     
	     

	}

}
