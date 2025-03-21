package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	WebDriver driver;
	public  contactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Contacts")
	private WebElement contact;
	
	public WebElement getContact() {
		return contact;
	}
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement plusIcon;

	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public void contacts() {
		getContact().click();
		getPlusIcon().click();
		getLastName().sendKeys("Soni");
	}
	
	@FindBy(xpath = "//img[contains(@onclick,'Popup&popuptype')]")
	private WebElement AddOrganization;
	
	public WebElement getAddOrganization() {
		return AddOrganization;
				
	}
	
	@FindBy(id = "search_txt")
	private WebElement SearchOrganization;
	
	public WebElement getSearchOrganization() {
		return SearchOrganization;
	}
	@FindBy(xpath = "//input[@name='search']")
	private WebElement SearchNow;
	
	public WebElement getSearchNow() {
		return SearchNow;
	}
	
	@FindBy(xpath ="//input[@accesskey='X']/../input")
	private WebElement SaveButton;
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	@FindBy(id = "dtlview_Last Name")
	private WebElement VerifyLastName;
	
	public WebElement getVerifyLastName() {
		return VerifyLastName;
	}
	
	


}
