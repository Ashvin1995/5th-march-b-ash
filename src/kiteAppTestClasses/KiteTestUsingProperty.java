package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassUsingProperty;
import kiteAppPom.KHomePage;
import kiteAppPom.KLoginPage;
import kiteAppPom.KPinPage;
import kiteAppUtility.UtilityUsingPropertyFile;

@Listeners(testNGlistener.Listener.class)
public class KiteTestUsingProperty extends BaseClassUsingProperty{
	
	KLoginPage login;
	KPinPage pin;
	KHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login= new KLoginPage(driver);
		pin=new KPinPage(driver);
		home=new KHomePage(driver);
		
		UtilityUsingPropertyFile.implicitlyWait(driver, 200);
		
	}
	
	@BeforeMethod
	public void  loginToKite() throws IOException
	{
		login.sendusername(UtilityUsingPropertyFile.readDataFromProperty("UN1"));
		login.sendpassword(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
		login.clickLogin();
		pin.sendpin(UtilityUsingPropertyFile.readDataFromProperty("PIN"));
		pin.clickcontinue();
	}
	
  @Test
  public void validateUserName() throws IOException 
  {
	  String actualUserID=home.getActualUid();
	  String expectedUserID=UtilityUsingPropertyFile.readDataFromProperty("UN1");
	  Assert.assertEquals(actualUserID, expectedUserID,"actual and expected not matching tc IS FAILED");
	  Reporter.log("ctual and expected are matching tc IS Passed",true);
	  //UtilityUsingPropertyFile.takescreenshot(driver);
  }
  
  @AfterMethod
  public void logoutFromKite() throws InterruptedException
  {
	  home.ClickONLogout();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
