package kiteWithExcel1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom1.KitePinPage;

public class TestClassUsingTestNG {
  KLoginPage login;
  KitePinPage pin;
  KHomePage home;
  WebDriver driver;
  Sheet mysheet;
  
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new KLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KHomePage(driver);
		
		File myfile=new File("F:\\\\\\\\velocity\\\\\\\\5ThMarchB.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("Sheet5");
	}
	
	@BeforeMethod
	public void loginToKite()
	{
		login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
		
		Reporter.log("sending username",true);
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("sending password", true);
		
		login.clickLogin();
		Reporter.log("clicking on loginButton");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("sending pin",true);
		pin.clickoncontinuebutton();
		Reporter.log("clicking on continue button",true);
	}
	
	@Test
  public void verifyKiteUserName()
  {
	  String expectedUserId = mysheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUserid = home.getActualUid();
	  
	  Reporter.log("validating userid",true);
	  
	  Assert.assertEquals(expectedUserId,actualUserid, "expectedUserId and actualuserid dosnt matching tc FAILED");
	  
	  Reporter.log("expectedUserId and actualuserid matching tc PASSED");
	  
  }
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		home.ClickONLogout();
		Reporter.log("logging out.........");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing browser....");
		driver.close();
	}
}
