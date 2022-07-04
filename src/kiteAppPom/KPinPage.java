package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KPinPage {
	
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;

	//constructor
	public KPinPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickcontinue()
	{
		continueButton.click();
	}

}
