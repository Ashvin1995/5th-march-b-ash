package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsUnorderedList {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    driver.findElement(By.name("q")).sendKeys("honda");
    
    List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
    
    for(WebElement search:searchresult)
    {
    	System.out.println(search.getText());
    }
    
//    String expectedResult = "honda amaze";
//    for(WebElement result:searchresult)
//    {
//    	String actualResult = result.getText();
//    	if(actualResult.equals(expectedResult))
//    	{
//    		result.click();
//     		break;
//    	}
//    	
//    }
//    
//    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    driver.findElement(By.linkText("Images")).click();  //path by linked text
//    
  // driver.findElement(By.partialLinkText("Ima")).click();  //path by partial linked text
    

	}
	

}
