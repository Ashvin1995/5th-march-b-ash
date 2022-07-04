package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		boolean result = textbox.isDisplayed();
		
		System.out.println("textbox status is "+result);
		textbox.sendKeys("its ashvin");
		
		driver.findElement(By.id("hide-textbox"));
	    boolean result1 = textbox.isDisplayed();
	    
	    System.out.println("text box result is "+result1);

	}

}
