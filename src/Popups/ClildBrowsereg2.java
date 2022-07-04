package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClildBrowsereg2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.findElement(By.name("NewWindow")).click();
		
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		
		Set<String> allIds = driver.getWindowHandles();
		
		ArrayList<String> ar=new ArrayList<>(allIds);
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
       String IdofmainPage = ar.get(0);
        String childPageId = ar.get(1);
        
        driver.switchTo().window(childPageId);
        driver.manage().window().maximize();

	}

}
