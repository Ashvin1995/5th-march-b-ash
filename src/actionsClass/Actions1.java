package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//move to element using mouse action
	Actions act=new Actions(driver);
	WebElement myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	act.moveToElement(myelement).perform();
	
	//click using mouse actions
	
	WebElement testelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	
	//1St way
//	act.moveToElement(testelement).perform();
//	act.click().perform();
//	
	//2nnd way
	//act.moveToElement(testelement).click().build().perform();
	
	//3rd way
	
	//act.click(testelement).perform();
	
	//right click--context click
	
	//1st
	//act.moveToElement(testelement).contextClick().build().perform();
	
	//2nd
	act.contextClick(testelement).perform();	
	
	
	
	
	

	}

}
