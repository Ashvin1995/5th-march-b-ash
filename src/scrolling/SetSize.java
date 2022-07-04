package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\velocity\\seleneium jar files\\chromedr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//to set size -->use dimension class and create the object of dimension class
		
		Dimension d=new Dimension(1050, 400);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		
		
		

	}

}
