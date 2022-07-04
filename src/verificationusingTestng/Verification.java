package verificationusingTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
	
  @Test
  public void mtTC() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
	  
	  checkbox1.click();
	  Thread.sleep(200);
	  Assert.assertTrue(checkbox1.isSelected(), "checkbox isnt selected TC is failed");
	  Reporter.log("checkbox is selected TC is passed", true);
	  
  }
}
