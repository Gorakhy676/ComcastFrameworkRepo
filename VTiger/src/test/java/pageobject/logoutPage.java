package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {
WebDriver driver;
	
	
	public logoutPage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//img[contains(@src,'themes/softed/images/user.PNG')]")
	private WebElement Icon;
	
	public WebElement getIcon() {
		return Icon;
	}
	@FindBy(linkText="Sign Out")
	private WebElement SignOut;

	public WebElement getSignOut() {
		return SignOut;
	}
	
	public void LogOut() {
		getIcon().click();
		getSignOut().click();
	}
	
	


}
