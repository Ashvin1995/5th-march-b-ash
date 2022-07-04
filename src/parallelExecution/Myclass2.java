package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 {
	
	  
	  @Test
	  public void method2() {
		  System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  Reporter.log("method 2 is running");
	  }
	  
	  

}
