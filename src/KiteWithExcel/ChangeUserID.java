package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeUserID {

	@FindBy(xpath = "remove text-xxsmall") private WebElement changeUser;

	
	public ChangeUserID (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private void ClickOnChangeUser()
	{
		changeUser.click();
	}
}
