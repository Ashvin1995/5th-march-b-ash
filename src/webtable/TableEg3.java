package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> noOfColumns = driver.findElements(By.xpath("//th"));
		
		int TotalnoOfRows = noOfRows.size();
		int TotalnoOfColumns = noOfColumns.size();
		
		System.out.println(TotalnoOfRows);
        System.out.println(TotalnoOfColumns);
        
        for(int i=1;i<=TotalnoOfRows;i++)
        {
        	for(int j=1;j<=TotalnoOfColumns;j++)
        	{
        		if  (i==1) {
        			String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
        			System.out.println(text+" ");
					
				} else {
				 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				 System.out.println(text+" ");

				}
        	}
        	System.out.println();
        }
	}

}
