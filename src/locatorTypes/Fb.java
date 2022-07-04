package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();  //xpath by attribute
		
	//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //xpath by text
		
	//	driver.findElement(By.xpath("//h2[contains(text(),'your life.')]")).click();  //contains with text
		
		driver.findElement(By.xpath("//a[contains(@title,'for Facebook')]")).click();
		

	}

}
