package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzPointsTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("(//table)[1]//th"));
		int totalNoOfRows = rows.size();
		int totalNoOfColumns = columns.size();
		
		System.out.println(totalNoOfRows);
		System.out.println(totalNoOfColumns);
		
		
		for(int i = 1;i<=totalNoOfRows;i++)
		{
			for(int j=1;j<=totalNoOfColumns;j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//tr["+j+"]")).getText();
					System.out.println(text+' ');
					
				}
				else {
					String text = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//td["+j+"]")).getText();
					System.out.println(text+" ");
				}
			}
			System.out.println();
		}
	

	}

}
