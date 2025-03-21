package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	public WebElement getPassword()
	{
		return password;
	}
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginbtn;
	public WebElement getLoginbtn()
	{
		return loginbtn;
	}
	public void login() {
		getUserName().sendKeys("admin");
		getPassword().sendKeys("admin");
		getLoginbtn().click();
	}


}
