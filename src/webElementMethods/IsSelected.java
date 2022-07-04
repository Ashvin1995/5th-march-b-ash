package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
	
		    System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.get("https://vctcpune.com/selenium/practice.html");
		    Thread.sleep(5000);
		    
		    WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
		    
		    if(checkbox.isSelected())
		    {
		    	System.out.println("checkbox is already selected");
		    }
		    else {
		    	System.out.println("selecting checkbox now");
		    	checkbox.click();
		    	if(checkbox.isSelected())
		    	{
		    		System.out.println("checkbox is selected now");
		    	}
		    	else {
		    		System.out.println("failed to select checkbox");
		    	}
		    }
		    

	}

}
