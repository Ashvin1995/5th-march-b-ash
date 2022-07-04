package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStydy {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.get("https://vctcpune.com/selenium/practice.html");
    Thread.sleep(2000);
    
    WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
    boolean result = checkbox.isSelected();
    System.out.println("result is "+result);
    

	}

}
