package pom_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage {
	
	//data members/variables
	
	@FindBy(id = "txtUsername") private WebElement UN;
	@FindBy(id = "txtPassword") private WebElement PWD;
	@FindBy(id = "btnLogin") private WebElement loginButton;
	
	//constructor
	
	public OrangeHrmLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void sendUN()
	{
		UN.sendKeys("Admin");
	}
	
	public void sendPWD()
	{
		PWD.sendKeys("admin123");
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

}
