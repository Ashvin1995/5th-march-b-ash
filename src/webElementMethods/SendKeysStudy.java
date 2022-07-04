package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
     	 WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
     	 username.sendKeys("8698049140");
     	
	   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
     	 password.sendKeys("Ashvin@1995");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
