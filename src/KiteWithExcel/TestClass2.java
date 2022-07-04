package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\velocity\\\\seleneium jar files\\\\chromedr\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile=new File("F:\\\\velocity\\\\5ThMarchB.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		
	   ArrayList<String> al=new ArrayList<String>();
		
	
		int rowNo = sheet.getLastRowNum();
	//	Object totalrowcount = rowno;
		int columnNo = sheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=rowNo;i++)
		{
			
			
			LoginPage login=new LoginPage(driver);
			login.sendusername(al.get(0));
			login.sendpassword(al.get(1));
			login.clickLoginButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			PinPage pin=new PinPage(driver);
			pin.sendpin(al.get(2));
			pin.clickContinueButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			HomePage home=new HomePage(driver);
			home.validateUID(username);
			 home.clicklogout();
			 
			 ChangeUserID change=new ChangeUserID(driver);
			 change.equals(change);
			 
			 
					 
			 
			 
		}
		driver.close();
		
	}
}
