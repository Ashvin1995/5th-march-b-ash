package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	//data menbers/variables
	
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	public LoginPage (WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	//method
	
	public  void sendusername(String username)
	{
		UN.sendKeys(username);;
	}
	public void sendpassword(String password)
	{
		PWD.sendKeys(password);
	}
	public void clickLoginButton() 
	{
		loginButton.click();
	}
	
}
