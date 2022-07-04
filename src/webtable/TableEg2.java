package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNoOfRows = rows.size();
		System.out.println("total no of rows are "+TotalNoOfRows);
		
		for(WebElement r:rows)
		{
			System.out.println("//"+r.getText()+"//");
			System.out.println();
		}
		
		// to know how many columns are there in table
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int totalNoOfColumns = columns.size();
		System.out.println("total no of colmns are"+totalNoOfColumns);
		
		for(WebElement c:columns)
		{
			System.out.println(c.getText()+"//");
		}
		
	}

}
