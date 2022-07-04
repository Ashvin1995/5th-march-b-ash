package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlertPopups {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
			driver.manage().window().maximize();
			
			Thread.sleep(100);
		
		    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			Alert altr1 = driver.switchTo().alert();
			Thread.sleep(1000);
			altr1.accept();
		
		   
		  
			
			

	}

}
