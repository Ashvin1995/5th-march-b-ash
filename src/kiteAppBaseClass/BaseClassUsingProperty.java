package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingProperty {
	protected static WebDriver driver;
	
	//browser setup
	
	public void  openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		UtilityUsingPropertyFile.implicitlyWait(driver, 1000);
	}
	
	public void takescreenshot(String TCname) throws IOException
	{
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      File dest=new File("F:\\velocity\\screenshot\\"+TCname+".jpg");
      org.openqa.selenium.io.FileHandler.copy(src, dest);
      
	}
	

}
