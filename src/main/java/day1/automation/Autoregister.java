package day1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoregister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			     ChromeDriver driver = new ChromeDriver();
			     String url = "http://demo.automationtesting.in/index.html";
			     driver.get(url);
			     driver.manage().window().maximize();
			     System.out.println(driver.getCurrentUrl());
			     System.out.println("Title of the page is:" +driver.getTitle());
			     driver.findElementById("enterimg").click();
			     driver.findElementByLinkText("Register");
			     driver.findElementByXPath("//input[@placeholder='First Name']").sendKeys("Harini");
			     driver.findElementByXPath("//input[@placeholder='Last Name']").sendKeys("Natarajan");
			     Thread.sleep(600);
			     driver.findElementByXPath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea").click();
			     driver.findElementByXPath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea").sendKeys("456 park street");
			     //driver.findElementByXPath("//div[@class='col-md-4 col-xs-4 col-sm-4'and @id='eid']").click();
			     driver.findElementByXPath("//*[@id=\"eid\"]/input").sendKeys("aaa123@gmail.com");
			  
			     driver.findElementByXPath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[4]/input").sendKeys("9994647997");
			     driver.findElementByXPath("//input[@value='Male']").click();
			     
			     WebElement chkele1 = driver.findElementById("checkbox2");
			     
			     System.out.println(chkele1.isSelected());
			     
			     driver.findElementById("checkbox2").click();
			     
			     System.out.println(chkele1.isSelected());
			     
			     driver.findElementById("checkbox3").click();
			     
			     WebElement lskills = driver.findElementById("Skills");
			     Select allskills = new Select(lskills);
			     //allskills.selectByVisibleText("C");
			     allskills.selectByIndex(8);
			     WebElement Country = driver.findElementById("countries");
			     Select allcountry = new Select(Country);
			     allcountry.selectByVisibleText("India");
			     WebElement Year = driver.findElementById("yearbox");
			     Select allyear = new Select(Year);
			     allyear.selectByVisibleText("1988");
			     WebElement IMonth = driver.findElementByXPath("(//div[@class='col-md-3 col-xs-3 col-sm-3' ])[2]/select");
			     Select allmonth = new Select(IMonth);
			     allmonth.selectByVisibleText("December");
			     WebElement Day = driver.findElementById("daybox");
			     Select alldays = new Select(Day);
			     alldays.selectByVisibleText("24");
			     
			     //driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input").sendKeys("9994746997");
			     driver.findElementById("firstpassword").sendKeys("harini");
	             driver.findElementById("secondpassword").sendKeys("harini");
	             //driver.findElementByName("signup").click();
	}           

}
