package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextStudy {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		driver.get("https://www.facebook.com/");
		
		WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'your life')]"));
		
		String actualtext = element1.getText();
		
		System.out.println(actualtext);
		
	  String expectedtext = "FacebookFacebook helps you connect and share with the people in your life";
	  
	  if(actualtext.equals(expectedtext))
	  {
		  System.out.println("text is matching tc is passed");
	  }
	  else {
		  System.out.println("text is not matching tc is failed");
	  }
	  

	
	}

}
