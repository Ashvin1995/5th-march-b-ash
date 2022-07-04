package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass;
import kiteAppPom.KHomePage;
import kiteAppPom.KLoginPage;
import kiteAppPom.KPinPage;
import kiteAppUtility.Utility;

public class ValidateKiteUserId extends BaseClass{
	
	KLoginPage login;
	KPinPage pin;
	KHomePage home;
	
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login=new KLoginPage(driver);
	pin=new KPinPage(driver);
	home= new KHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendusername(Utility.readDataFromExcel(0, 0));
		login.sendpassword(Utility.readDataFromExcel(0, 1));
		login.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.readDataFromExcel(0, 2));
		pin.clickcontinue();
	}
	
	
	
	
  @Test
  public void validateUsername() throws EncryptedDocumentException, IOException 
  {
	  String actualUsername = home.getActualUid();
	  String expectedUsername = Utility.readDataFromExcel(0, 0);
	  Assert.assertEquals(actualUsername, expectedUsername,"TC is failed actual and expected UIDs dosnt matching");
	  Reporter.log("TC is PASSED actual and expected UIDs are matching");
	  
	  Utility.takescreenshot(driver);
			  
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.ClickONLogout();
  }
  
  @AfterClass
  public void closeBrowser ()
  {
	  driver.close();
  }
}
