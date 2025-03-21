package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationPage {
WebDriver driver;
	
	public organizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath ="//img[@title=\"Create Organization...\"]")
	private WebElement plusIcon;
	
	public WebElement getplusIcon() {
		return plusIcon;
	}
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement OrgNameTextField;
	
	public WebElement getOrgNameTextField() {
		return OrgNameTextField;
	}
	
	@FindBy(name ="button")
	private WebElement SaveButton;
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement Industry;
	
	public WebElement getIndustry() {
		return Industry;
	}
	
	@FindBy(id = "bas_searchfield")
	private WebElement DropDownSearchField;
	
	public WebElement getDropDownSearchField() {
		return DropDownSearchField;
	}
	
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement SearchBar;
	
	public WebElement getSearchBar() {
		return SearchBar;
	}
	
	@FindBy(name = "submit")
	private WebElement Submit;
	
	public WebElement getSubmit() {
		 return Submit;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Organization Information')]")
	private WebElement VerifyOrganization;
	
	public WebElement getVerifyOrganization() {
		return VerifyOrganization;
	}
	
	@FindBy(id = "phone")
	private WebElement PhoneTextField;
	
	public WebElement getPhoneTextField() {
		return PhoneTextField;
	}
	
	@FindBy(xpath = "//font[text()='Education']")
	private WebElement VerifyIndustry;
	
	public WebElement getVerifyIndustry() {
		return VerifyIndustry;
	}
	@FindBy(id = "dtlview_Phone")
	private WebElement VerifyPhone;
	
	public WebElement getVerifyPhone() {
		return VerifyPhone;
	}


}
