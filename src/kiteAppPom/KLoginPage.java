package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KLoginPage {

	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	public KLoginPage (WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void sendpassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
}
