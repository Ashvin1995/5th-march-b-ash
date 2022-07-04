package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/select-menu");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor j = ((JavascriptExecutor)driver);
		    j.executeScript("window.scrollBy(80,500)");
		    Thread.sleep(500);
		    j.executeScript("window.scrollBy(80,-500)");
			

	}

}
