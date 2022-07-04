package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/nestedframes");
			
			driver.manage().window().maximize();
			
			Thread.sleep(500);
			driver.switchTo().frame("frame1");
			
			Thread.sleep(200);
			
		 
		 Thread.sleep(500);
		 
		 
		
		 WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		 driver.switchTo().frame("<p>Child Iframe</p>");
		
		 
		 
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 WebElement txt = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe')]"));
		 Thread.sleep(200);
		 System.out.println(txt.getText());
		
		 
		
			
			

	}

}
