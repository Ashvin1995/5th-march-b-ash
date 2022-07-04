package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);
		
		//1.identify listbox/dropdown to be handled and store it into reference veriable
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		//2.create object of select class which will accept web element as argument
		
		Select s=new Select(day);
		
		//3. by using one of the method of select class we can select values from list box
		//i. select by VisibleText:select visible Text(String arg())
		//ii. select by index: select byIndex(int arg())
		//iii.select by value:select ByValue (String arg())
		
		Thread.sleep(2000);
		s.selectByVisibleText("8");
		Thread.sleep(2000);
		s.selectByIndex(17);
		Thread.sleep(2000);
		s.selectByValue("30");
		
		//1.
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		//2.
		Select s1=new Select(month);
		
		//3.
		Thread.sleep(2000);
		s1.selectByVisibleText("Feb");
		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByValue("2");
		
		
		

	}

}
