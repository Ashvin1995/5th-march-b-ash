package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement HideShowButton = driver.findElement(By.id("hide-textbox"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",HideShowButton);
		Thread.sleep(2000);
		HideShowButton.click();
	

	}

}
