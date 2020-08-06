package day1.automation;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Erail {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String baseURL = "https://erail.in/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS",Keys.TAB);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("SBC",Keys.TAB);
		driver.findElementById("buttonFromTo").click();
		
		WebElement eleTrain= driver.findElementByXPath("//a[text()='MYSURU EXP']//preceding::a[1]");
		String trainNo=eleTrain.getText();
		System.out.println("The TrainNo is:"+trainNo);
		
		WebElement deptTime = driver.findElementByXPath("//a[text()='MYSURU EXP']//following::td[2]");
		String time = deptTime.getText();
		System.out.println("The departure time is : "+time);
	}
}
		
				
		
	


