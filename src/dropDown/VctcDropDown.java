package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VctcDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(listbox);
		
		s.selectByValue("option1");

	}

}
