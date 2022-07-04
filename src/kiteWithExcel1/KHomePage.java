package kiteWithExcel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KHomePage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	
	
	public KHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  String getActualUid()
	{
		String actualUId=UID.getText();
		return actualUId;
		
	}
	
	public void ClickONLogout() throws InterruptedException
	{
		UID.click();
		Thread.sleep(200);
		logoutButton.click();
	}
}
