package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(400);
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(8000);
		
		WebElement otpButton = driver.findElement(By.id("//button[@type='submit']"));
		boolean result = otpButton.isEnabled();
		System.out.println("otp button status "+result);
		
		
		

	}

}
