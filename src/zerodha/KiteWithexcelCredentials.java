package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteWithexcelCredentials {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		
		
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		File myfile=new File("F:\\\\velocity\\\\5ThMarchB.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		String UN = sheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = sheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = sheet.getRow(0).getCell(2).getStringCellValue();
		
		userId.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		

		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continueButton.click();
		
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserId = userid.getText();
		String expextedUserId = UN;
		
		if(actualUserId.equals(UN))
		{
			System.out.println("user id matches test case passed");
		}
		else {
			System.out.println("user id dosnt match test case failed");
		}
		
         userid.click();
         Thread.sleep(500);
 		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
 		logoutButton.click();
 		driver.close();

	}

}
