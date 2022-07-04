package kiteAppUtility;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile {
	
//	public static void takescreenshot(WebDriver driver) throws IOException
//	{
//		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String random= RandomString.make(3);
//		File dest=new File("F:\\velocity\\screenshot\\mysss"+random+".jpg");
//		FileHandler.copy(source, dest);
//	  
//	}
	
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myprop=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\5th_b_selenium\\MyProperty.properties");
		prop.load(myprop);
		
		String value=prop.getProperty(key);
		return value;
	}
	
	public static void implicitlyWait(WebDriver driver, int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}

}
