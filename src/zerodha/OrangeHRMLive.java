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

public class OrangeHRMLive {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement Password = driver.findElement(By.id("txtPassword"));
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
//		
//		username.sendKeys("Admin");
//		Password.sendKeys("admin123");
//		loginbutton.click();

		File myfile=new File("F:\\velocity\\5ThMarchB.xlsx");
		Sheet sheet =WorkbookFactory.create(myfile).getSheet("Sheet6");
		String UN = sheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(PWD);
		
		username.sendKeys(UN);
		Password.sendKeys(PWD);
		loginbutton.click();
		
		
		
	}

}
