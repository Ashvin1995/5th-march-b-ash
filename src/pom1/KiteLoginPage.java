package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//data menbers/variables
	
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	public KiteLoginPage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void sendusername()
	{
		UN.sendKeys("ELR321");
	}
	public void sendpassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	public void clickLoginButton() 
	{
		loginButton.click();
	}
	

}
