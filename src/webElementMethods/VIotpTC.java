package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VIotpTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.get("https://www.myvi.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		Thread.sleep(6000);
		
		WebElement otpbutton = driver.findElement(By.xpath("//button[text()='send OTP']"));
		boolean result = otpbutton.isEnabled();
		System.out.println(result);
		
		

	}

}
