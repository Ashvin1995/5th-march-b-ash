package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolleg1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/select-menu");
			
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			JavascriptExecutor j = ((JavascriptExecutor)driver);
			Thread.sleep(1000);
		     //j.executeScript("window.scrollBy(80,1000)");
		     Thread.sleep(2000);
		     j.executeScript("window.scrollBy(10,-900)");
			

	}

}
