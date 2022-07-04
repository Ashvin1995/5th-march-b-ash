package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateUserId()
	{
		String actualUserId = userId.getText();
		String expectedUserId = "ELR321";
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("user id matyching TC passed");
		}
		else {
			System.out.println("user id not matching TC failed");
		}
	}
	
	public void clickOnlogoutButton() throws InterruptedException
	{
		userId.click();
		
		Thread.sleep(200);
		
        Logout.click();
	
	}
}
