package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
         WebElement link = driver.findElement(By.xpath("//a[text()='Appium']"));
         JavascriptExecutor js = ((JavascriptExecutor)driver);
         js.executeScript("arguments[0].scrollIntoView(true)", link);
         
         Thread.sleep(1000);
         link.click();
	}

}
