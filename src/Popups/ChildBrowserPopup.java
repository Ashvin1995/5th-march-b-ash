package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.findElement(By.name("NewWindow")).click();
		
		//Thread.sleep(1000);
		//driver.manage().window().maximize();
		
		String idOfMainPage = driver.getWindowHandle();
		
		System.out.println("main page id is "+idOfMainPage);
		
		//all ids received in set
		
		Set<String> allIds = driver.getWindowHandles();
		
		//set need to convert into arrey list
		
		ArrayList<String>ar=new ArrayList<>(allIds);
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		String mainPageId = ar.get(0);
		String childPageId = ar.get(1);
		
		//to switch to child page
		
		driver.switchTo().window(childPageId); //here selanium focus is switched to child page
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("the7-search")).sendKeys("selanium");
		
		driver.close(); //close current tab
		//driver.quit(); //will close all windows open by selanium in current session
		Thread.sleep(1000);
		
		driver.switchTo().window(mainPageId); //switching selanium focus from child page to main page
		
		//driver.switchTo().window(ar.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		

	}

}
