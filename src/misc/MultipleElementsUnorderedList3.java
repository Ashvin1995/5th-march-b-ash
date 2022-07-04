package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsUnorderedList3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    WebElement searchbox = driver.findElement(By.name("q"));
	    searchbox.sendKeys("iphone");
	    
	    List<WebElement> searchReasult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	   
	    for(WebElement search:searchReasult)
	    {
	    	System.out.println(search.getText());
	    }
	    String expextedResult = "iphone 14";
	    for(WebElement results:searchReasult)
	    {
	    	String actualReasult = results.getText();
	    	if(actualReasult.equals(expextedResult))
	    	{
	    		results.click();
	    		break;
	    	}
	    }

	}

}
