package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	ChromeDriver driver=new  ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getCurrentUrl() );
		
		
		

	}

}
