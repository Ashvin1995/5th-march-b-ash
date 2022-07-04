package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void method1() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  System.out.println("method1 is running");
  }
  
  @Test
  public void method2() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Reporter.log("method 2 is running");
  }
  
  @Test
  public void method3() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  Reporter.log("method 3 is running", true);
  }
}
