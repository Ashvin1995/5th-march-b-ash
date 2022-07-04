package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//data members/variables
	
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id  = "password") private WebElement PWD;
    @FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
    
    //constructor
    
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //methods
    
    public void sendUsername()
    {
    	UN.sendKeys("ELR321");
    }
    
    public void sendPassward()
    {
    	PWD.sendKeys("Dhana1111");
    }
    
    public void clickLoginButton()
    {
    	loginButton.click();
    }
}
