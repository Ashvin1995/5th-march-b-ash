package waitInSelanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_study {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]"));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(2000));
		w.until(ExpectedConditions.visibilityOf(createAccount));
		


	}

}
