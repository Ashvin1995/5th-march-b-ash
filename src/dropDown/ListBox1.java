package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);

		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);

		// 1.identify listbox/dropdown to be handled and store it into reference
		// veriable
		WebElement day = driver.findElement(By.name("birthday_day"));

		// 2.create object of select class which will accept web element as argument

		Select s = new Select(day);

		// 3. by using one of the method of select class we can select values from list
		// box
		// i. select by VisibleText:select visible Text(String arg())
		// ii. select by index: select byIndex(int arg())
		// iii.select by value:select ByValue (String arg())

		for(int i=0;i<=9;i++)
		{
			Thread.sleep(100);
			s.selectByIndex(i);
		}
		for(int i=9;i>=0;i--)
		{
			Thread.sleep(100);
			s.selectByIndex(i);
		}
		boolean result = s.isMultiple();
		
		System.out.println("multiple selection available result is "+result);
	}

}
