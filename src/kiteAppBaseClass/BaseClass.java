package kiteAppBaseClass;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kiteAppPom.KPinPage;
import kiteWithExcel1.KHomePage;
import pom1.KitePinPage;

public class BaseClass {
	protected WebDriver driver;
	KPinPage pin;
	kiteAppPom.KHomePage home;
	  Sheet mysheet;
    //browser setup
	//i want seperate method for browser calling
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	

}
