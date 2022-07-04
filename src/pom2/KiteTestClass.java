package pom2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\velocity\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\seleneium jar files\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedr\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
	    
	    LoginPage login=new LoginPage(driver);
	    login.sendUsername();
	    login.sendPassward();
	    login.clickLoginButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    PinPage pin=new PinPage(driver);
	    pin.sendPin();
	    pin.clickContinueButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    
	    HomePage home=new HomePage(driver);
	    
	    home.validateUserId();
	    home.clickOnlogoutButton();
	    
	    driver.close();
	    
	    
	}

}
