package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void validateUID(String uid)
	{
		String actualUID=UID.getText();
		String expectedUID=uid;
		
		if(actualUID.equals(expectedUID))		
		{
			System.out.println("UId matching tc is passed");
		}
		else {
		System.out.println("uid not matching tc failed");
		}
//		
		
	}
	
	public void clicklogout() throws InterruptedException
	{
	UID.click();
	Thread.sleep(1000);
	logout.click();
	
	
	}
	
	
//	
}
