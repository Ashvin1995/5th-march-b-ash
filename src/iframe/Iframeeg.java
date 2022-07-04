package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.switchTo().frame("iframe-name");
			
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//a[text()='About us']")).click();
			
			driver.switchTo().defaultContent();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//input[@value='Radio2']")).click();
			

	}

}
