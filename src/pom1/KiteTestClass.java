package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","F:\\\\\\\\\\\\\\\\velocity\\\\\\\\\\\\\\\\seleneium jar files\\\\\\\\\\\\\\\\chromedr\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage login=new KiteLoginPage(driver);
        login.sendusername();
        login.sendpassword();
        login.clickLoginButton();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage pin=new KitePinPage(driver);
		//pin.sendpin();
		pin.clickoncontinuebutton();
	}

}
