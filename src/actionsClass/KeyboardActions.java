package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class KeyboardActions {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement textbox = driver.findElement(By.id("email"));
	
	//textbox.sendKeys("Ashvin");  -->using web driver method
	
	//using keyboard action
	
	Actions act=new Actions(driver);
	
	//act.sendKeys("Ashvin").perform();
	
	//act.keyDown(textbox, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
	act.keyDown(textbox,Keys.SHIFT).sendKeys("pu").keyUp(Keys.SHIFT).sendKeys("ne").build().perform();
	}

}
