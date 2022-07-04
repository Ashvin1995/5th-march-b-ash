package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Velocity Corporate')])[1]"));
		String actualtext = element1.getText();
		System.out.println("actual text is "+actualtext);
		
		String expectedtext = "VELOCITY CORPORATE TRAINING CENTER";
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("matching text tc passed");
		}
		else {
			System.out.println("dosnt matching text tc failed");
		}
				

	}

}
