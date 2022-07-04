package pom_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeTestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		OrangeHrmLoginPage login=new OrangeHrmLoginPage(driver);
		login.sendUN();
		login.sendPWD();
		login.clickLoginButton();

	}

}
