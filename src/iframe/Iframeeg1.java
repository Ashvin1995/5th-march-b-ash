package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframecontainer");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframewrapper");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(200);
		
		
		

	}

}
