package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReviewAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\velocity\\\\\\\\seleneium jar files\\\\\\\\chromedr\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		System.out.println(reviews.getText());
		
		WebElement ratings = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
		System.out.println(ratings.getText());

	}

}
