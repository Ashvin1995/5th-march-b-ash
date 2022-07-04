package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FitstCodeSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com");
		
		//driver.close();
		//driver.quit();
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Facebook");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
