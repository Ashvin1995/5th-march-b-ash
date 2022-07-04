package KiteWithExcel;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	File myfile=new File("F:\\velocity\\5ThMarchB.xlsx");
	Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet7");
	String username = sheet.getRow(0).getCell(0).getStringCellValue();
	String password = sheet.getRow(0).getCell(1).getStringCellValue();
	
	
//	System.out.println(password);
	
	LoginPage login=new LoginPage(driver);
	login.sendusername(sheet.getRow(0).getCell(0).getStringCellValue());
	Thread.sleep(3000);
	login.sendpassword(sheet.getRow(0).getCell(1).getStringCellValue());
	login.clickLoginButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	PinPage pin=new PinPage(driver);
	pin.sendpin(sheet.getRow(0).getCell(2).getStringCellValue());
	pin.clickContinueButton();
	
	HomePage home=new HomePage(driver);
    home.validateUID(username);
    home.clicklogout();
    
	
	
			

	}

}
