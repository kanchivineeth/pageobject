package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout {
	//ddefinr repository for llogut
	@FindBy(xpath = "//a[@id=\"welcome\"]")
	WebElement ObjWelcome;
	@FindBy(xpath = "//a[normalize-space()=\"Logout\"]")
	WebElement ObjLogout;
	//method for logout
	public void adminLogout()
	{
		ObjWelcome.click();
		ObjLogout.click();
	}
}