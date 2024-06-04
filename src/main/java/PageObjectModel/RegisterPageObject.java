package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class RegisterPageObject extends CommonMethod {

	WebDriver driver;

	public RegisterPageObject(WebDriver driver) {

		this.driver = driver;
	}

	// Identify Web Element For verifyElementVisibilityForRegisterPage

	private By NaveenAutomationLabs_Logo = By.xpath("//div[@id='logo']");
	private By MyAccount = By.xpath("//span[text()='My Account']");
	private By RegisterDropdown = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");
	private By ActualRegistext = By.xpath("//h1[text()='Register Account']");
	private By Para_Text = By.xpath("//p[text()='If you already have an account with us, please login at the ']");
	private By PersonalDetails = By.xpath("//legend[text()='Your Personal Details']");
	private By FirstName_LabelName = By.xpath("//label[text()='First Name']");
	private By LastName_LabelName = By.xpath("//label[text()='Last Name']");
	private By Email_LabelName = By.xpath("//label[text()='E-Mail']");
	private By Telephone_LabelName = By.xpath("//label[text()='Telephone']");

	private By YourPassword_Text = By.xpath("//legend[text()='Your Password']");
	private By Password_LabelName = By.xpath("//label[text()='Password']");
	private By ConfirmPassword_LabelName = By.xpath("//label[text()='Password Confirm']");

	private By Newsletter_HeadingText = By.xpath("//legend[text()='Newsletter']");
	private By Subscribe_Text = By.xpath("//label[text()='Subscribe']");
	private By RedioButtons = By.xpath("//input[@name='newsletter']");
	private By BottomText = By.xpath("//div[text()='I have read and agree to the ']");
	private By Checkbox = By.xpath("//input[@type='checkbox']");
	private By ContinueButton = By.xpath("//input[@type='submit']");

	// Identify Web Element For verifyAllTabsVisibility

	private By Desktops_Tab = By.xpath("//a[text()='Desktops']");
	private By LaptopsAndNotebooks_Tab = By.xpath("//a[text()='Laptops & Notebooks']");
	private By Components_Tab = By.xpath("//a[text()='Components']");
	private By Tablets_Tab = By.xpath("//a[text()='Tablets']");
	private By Software_Tab = By.xpath("//a[text()='Software']");
	private By PhonesAndPDAs_Tab = By.xpath("//a[text()='Phones & PDAs']");
	private By Cameras_Tab = By.xpath("//a[text()='Cameras']");
	private By MP3Players_Tab = By.xpath("//a[text()='MP3 Players']");

	// Identify Web Element For verifyAllBottomLinks

	private By Information_Text = By.xpath("//h5[text()='Information']");
	private By AboutUs_Link = By.xpath("//a[text()='About Us']");
	private By ActualText_ForAssertion_AboutUs_Link = By.xpath("//h1[text()='About Us']");
	private By DeliveryInformation_Link = By.xpath("//a[text()='Delivery Information']");
	private By ActualText_ForAssertion_DeliveryInformation_Link = By.xpath("//h1[text()='Delivery Information']");
	private By PrivacyPolicy_Link = By.xpath("//a[text()='Privacy Policy']");
	private By ActualText_ForAssertion_PrivacyPolicy_Link = By.xpath("//h1[text()='Privacy Policy']");
	private By TermsAndConditions_Link = By.xpath("//a[text()='Terms & Conditions']");
	private By ActualText_ForAssertion_TermsAndConditions_Link = By.xpath("//h1[text()='Terms & Conditions']");

	private By CustomerService_Text = By.xpath("//h5[text()='Customer Service']");
	private By ContactUs_Link = By.xpath("//a[text()='Contact Us']");
	private By ActualText_ForAssertion_ContactUs_Link = By.xpath("//h1[text()='Contact Us']");
	private By Returns_Link = By.xpath("(//a[text()='Returns'])[2]");
	private By ActualText_ForAssertion_Returns_Link = By.xpath("//h1[text()='Product Returns']");
	private By SiteMap_Link = By.xpath("//a[text()='Site Map']");
	private By ActualText_ForAssertion_SiteMap_Link = By.xpath("//h1[text()='Site Map']");

	private By Extras_Text = By.xpath("//h5[text()='Extras']");
	private By Brands_Link = By.xpath("//a[text()='Brands']");
	private By ActualText_ForAssertion_Brands_Link = By.xpath("//h1[text()='Find Your Favorite Brand']");
	private By GiftCertificates_Link = By.xpath("//a[text()='Gift Certificates']");
	private By ActualText_ForAssertion_GiftCertificates_Link = By.xpath("//h1[text()='Purchase a Gift Certificate']");
	private By Affiliate_Link = By.xpath("//a[text()='Affiliate']");
	private By ActualText_ForAssertion_Affiliate_Link = By.xpath("//h1[text()='Affiliate Program']");
	private By Specials_Link = By.xpath("//a[text()='Specials']");
	private By ActualText_ForAssertion_Specials_Link = By.xpath("//h2[text()='Special Offers']");

	private By MyAccount_Text = By.xpath("//h5[text()='My Account']");
	private By MyAccount_SubText = By.xpath("(//a[text()='My Account'])[2]");
	private By OrderHistory_Link = By.xpath("(//a[text()='Order History'])[2]");
	private By WishList_Link = By.xpath("(//a[text()='Wish List'])[2]");
	private By Newsletter_Link = By.xpath("(//a[text()='Newsletter'])[2]");
	
	// Identify Web Element For verifyErrorTextMessage
	
	private By Continue_Button = By.xpath("//input[@value='Continue']");
	private By Warning_ErrorIcon = By.xpath("//i[@class='fa fa-exclamation-circle']");
	private By Warning_ErrorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By FirstName_ErrorMessage = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By LastName_ErrorMessage = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By Email_ErrorMessage = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By Telophone_ErrorMessage = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By Password_ErrorMessage = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By PasswordConfirm_ErrorMessage = By.xpath("//div[text()='Password confirmation does not match password!']");
	
	//	Identify web Element for verifyRegisterFunctionality
	
	private By FirstName_TextField = By.xpath("//input[@id='input-firstname']");
	private By LastName_TextField = By.xpath("//input[@id='input-lastname']");
	private By Email_TextField = By.xpath("//input[@id='input-email']");
	private By Telephone_TextField = By.xpath("//input[@id='input-telephone']");
	private By Password_TextField = By.xpath("//input[@id='input-password']");
	private By ConfirmPassword_TextField = By.xpath("//input[@id='input-confirm']");
	private By yes_RedioButton = By.xpath("(//label[@class='radio-inline']/input)[1]");
	private By PrivacyPolicy_CheckBox = By.xpath("//input[@type='checkbox']");
	private By Continue_ButtonForRegister = By.xpath("//input[@type='submit']");
	private By ActualText_ForRegisterPageAssertion = By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By ContinueButton_AfterRegistration = By.xpath("//a[text()='Continue']");
	private By MyAccount_ForAssertion = By.xpath("//h2[text()='My Account']");
	
	//	verifyCountOfHyperlink()
	
	private By HyperLinks = By.tagName("a");
	
	
	

	// Create a method to perform operation

	public WebElement NaveenAutomationLabs_Logo() {
		waitForElementToVisible(NaveenAutomationLabs_Logo, driver, 30);
		return driver.findElement(NaveenAutomationLabs_Logo);

	}

	public WebElement MyAccount() {
		waitForElementToVisible(MyAccount, driver, 30);
		return driver.findElement(MyAccount);

	}

	public List<WebElement> RegisterDropdown() {
		waitForElementToVisible(RegisterDropdown, driver, 30);
		return driver.findElements(RegisterDropdown);

	}

	public WebElement ActualRegistext() {
		waitForElementToVisible(ActualRegistext, driver, 30);
		return driver.findElement(ActualRegistext);

	}

	public WebElement Para_Text() {
		waitForElementToVisible(Para_Text, driver, 30);
		return driver.findElement(Para_Text);

	}

	public WebElement PersonalDetails() {
		waitForElementToVisible(PersonalDetails, driver, 30);
		return driver.findElement(PersonalDetails);

	}

	public WebElement FirstName_LabelName() {
		waitForElementToVisible(FirstName_LabelName, driver, 30);
		return driver.findElement(FirstName_LabelName);

	}

	public WebElement LastName_LabelName() {
		waitForElementToVisible(LastName_LabelName, driver, 30);
		return driver.findElement(LastName_LabelName);

	}

	public WebElement Email_LabelName() {
		waitForElementToVisible(Email_LabelName, driver, 30);
		return driver.findElement(Email_LabelName);

	}

	public WebElement Telephone_LabelName() {
		waitForElementToVisible(Telephone_LabelName, driver, 30);
		return driver.findElement(Telephone_LabelName);

	}

	public WebElement YourPassword_Text() {
		waitForElementToVisible(YourPassword_Text, driver, 30);
		return driver.findElement(YourPassword_Text);

	}

	public WebElement Password_LabelName() {
		waitForElementToVisible(Password_LabelName, driver, 30);
		return driver.findElement(Password_LabelName);

	}

	public WebElement ConfirmPassword_LabelName() {
		waitForElementToVisible(ConfirmPassword_LabelName, driver, 30);
		return driver.findElement(ConfirmPassword_LabelName);

	}

	public WebElement Newsletter_HeadingText() {
		waitForElementToVisible(Newsletter_HeadingText, driver, 30);
		return driver.findElement(Newsletter_HeadingText);

	}

	public WebElement Subscribe_Text() {
		waitForElementToVisible(Subscribe_Text, driver, 30);
		return driver.findElement(Subscribe_Text);

	}

	public List<WebElement> RedioButtons() {
		waitForElementToVisible(RedioButtons, driver, 30);
		return driver.findElements(RedioButtons);

	}

	public WebElement BottomText() {
		waitForElementToVisible(BottomText, driver, 30);
		return driver.findElement(BottomText);

	}

	public WebElement Checkbox() {
		waitForElementToVisible(Checkbox, driver, 30);
		return driver.findElement(Checkbox);

	}

	public WebElement ContinueButton() {
		waitForElementToVisible(ContinueButton, driver, 30);
		return driver.findElement(ContinueButton);

	}

	public WebElement Desktops_Tab() {
		waitForElementToVisible(Desktops_Tab, driver, 30);
		return driver.findElement(Desktops_Tab);

	}

	public WebElement LaptopsAndNotebooks_Tab() {
		waitForElementToVisible(LaptopsAndNotebooks_Tab, driver, 30);
		return driver.findElement(LaptopsAndNotebooks_Tab);

	}

	public WebElement Components_Tab() {
		waitForElementToVisible(Components_Tab, driver, 30);
		return driver.findElement(Components_Tab);

	}

	public WebElement Tablets_Tab() {
		waitForElementToVisible(Tablets_Tab, driver, 30);
		return driver.findElement(Tablets_Tab);

	}

	public WebElement Software_Tab() {
		waitForElementToVisible(Software_Tab, driver, 30);
		return driver.findElement(Software_Tab);

	}

	public WebElement PhonesAndPDAs_Tab() {
		waitForElementToVisible(PhonesAndPDAs_Tab, driver, 30);
		return driver.findElement(PhonesAndPDAs_Tab);

	}

	public WebElement Cameras_Tab() {
		waitForElementToVisible(Cameras_Tab, driver, 30);
		return driver.findElement(Cameras_Tab);
	}

	public WebElement MP3Players_Tab() {
		waitForElementToVisible(MP3Players_Tab, driver, 30);
		return driver.findElement(MP3Players_Tab);

	}

	public WebElement Information_Text() {
		waitForElementToVisible(Information_Text, driver, 30);
		return driver.findElement(Information_Text);

	}

	public WebElement AboutUs_Link() {
		waitForElementToVisible(AboutUs_Link, driver, 30);
		return driver.findElement(AboutUs_Link);

	}

	public WebElement ActualText_ForAssertion_AboutUs_Link() {
		waitForElementToVisible(ActualText_ForAssertion_AboutUs_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_AboutUs_Link);
	}

	public WebElement DeliveryInformation_Link() {
		waitForElementToVisible(DeliveryInformation_Link, driver, 30);
		return driver.findElement(DeliveryInformation_Link);

	}

	public WebElement ActualText_ForAssertion_DeliveryInformation_Link() {
		waitForElementToVisible(ActualText_ForAssertion_DeliveryInformation_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_DeliveryInformation_Link);

	}

	public WebElement PrivacyPolicy_Link() {
		waitForElementToVisible(PrivacyPolicy_Link, driver, 30);
		return driver.findElement(PrivacyPolicy_Link);

	}

	public WebElement ActualText_ForAssertion_PrivacyPolicy_Link() {
		waitForElementToVisible(ActualText_ForAssertion_PrivacyPolicy_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_PrivacyPolicy_Link);

	}

	public WebElement TermsAndConditions_Link() {
		waitForElementToVisible(TermsAndConditions_Link, driver, 30);
		return driver.findElement(TermsAndConditions_Link);

	}

	public WebElement ActualText_ForAssertion_TermsAndConditions_Link() {
		waitForElementToVisible(ActualText_ForAssertion_TermsAndConditions_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_TermsAndConditions_Link);

	}

	public WebElement CustomerService_Text() {
		waitForElementToVisible(CustomerService_Text, driver, 30);
		return driver.findElement(CustomerService_Text);

	}

	public WebElement ContactUs_Link() {
		waitForElementToVisible(ContactUs_Link, driver, 30);
		return driver.findElement(ContactUs_Link);

	}

	public WebElement ActualText_ForAssertion_ContactUs_Link() {
		waitForElementToVisible(ActualText_ForAssertion_ContactUs_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_ContactUs_Link);

	}

	public WebElement Returns_Link() {
		waitForElementToVisible(Returns_Link, driver, 30);
		return driver.findElement(Returns_Link);

	}

	public WebElement ActualText_ForAssertion_Returns_Link() {
		waitForElementToVisible(ActualText_ForAssertion_Returns_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_Returns_Link);

	}

	public WebElement SiteMap_Link() {
		waitForElementToVisible(SiteMap_Link, driver, 30);
		return driver.findElement(SiteMap_Link);

	}

	public WebElement ActualText_ForAssertion_SiteMap_Link() {
		waitForElementToVisible(ActualText_ForAssertion_SiteMap_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_SiteMap_Link);
	}

	public WebElement Extras_Text() {
		waitForElementToVisible(Extras_Text, driver, 30);
		return driver.findElement(Extras_Text);

	}

	public WebElement Brands_Link() {
		waitForElementToVisible(Brands_Link, driver, 30);
		return driver.findElement(Brands_Link);

	}

	public WebElement ActualText_ForAssertion_Brands_Link() {
		waitForElementToVisible(ActualText_ForAssertion_Brands_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_Brands_Link);

	}

	public WebElement GiftCertificates_Link() {
		waitForElementToVisible(GiftCertificates_Link, driver, 30);
		return driver.findElement(GiftCertificates_Link);

	}

	public WebElement ActualText_ForAssertion_GiftCertificates_Link() {
		waitForElementToVisible(ActualText_ForAssertion_GiftCertificates_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_GiftCertificates_Link);

	}

	public WebElement Affiliate_Link() {
		waitForElementToVisible(Affiliate_Link, driver, 30);
		return driver.findElement(Affiliate_Link);

	}

	public WebElement ActualText_ForAssertion_Affiliate_Link() {
		waitForElementToVisible(ActualText_ForAssertion_Affiliate_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_Affiliate_Link);

	}

	public WebElement Specials_Link() {
		waitForElementToVisible(Specials_Link, driver, 30);
		return driver.findElement(Specials_Link);
	}

	public WebElement ActualText_ForAssertion_Specials_Link() {
		waitForElementToVisible(ActualText_ForAssertion_Specials_Link, driver, 30);
		return driver.findElement(ActualText_ForAssertion_Specials_Link);

	}

	public WebElement MyAccount_Text() {
		waitForElementToVisible(MyAccount_Text, driver, 30);
		return driver.findElement(MyAccount_Text);

	}

	public WebElement MyAccount_SubText() {
		waitForElementToVisible(MyAccount_SubText, driver, 30);
		return driver.findElement(MyAccount_SubText);

	}

	public WebElement OrderHistory_Link() {
		waitForElementToVisible(OrderHistory_Link, driver, 30);
		return driver.findElement(OrderHistory_Link);

	}

	public WebElement WishList_Link() {
		waitForElementToVisible(WishList_Link, driver, 30);
		return driver.findElement(WishList_Link);

	}
	
	public WebElement Newsletter_Link() {
		waitForElementToVisible(Newsletter_Link, driver, 30);
		return driver.findElement(Newsletter_Link);
		
	}
	
	public WebElement Continue_Button() {
		waitForElementToVisible(Continue_Button, driver, 30);
		return driver.findElement(Continue_Button);
		
	}
	
	public WebElement Warning_ErrorIcon() {
		waitForElementToVisible(Warning_ErrorIcon, driver, 30);
		return driver.findElement(Warning_ErrorIcon);
		
	}
	
	
	public WebElement Warning_ErrorMessage() {
		waitForElementToVisible(Warning_ErrorMessage, driver, 30);
		return driver.findElement(Warning_ErrorMessage);
		
	}
	
	public WebElement FirstName_ErrorMessage() {
		waitForElementToVisible(FirstName_ErrorMessage, driver, 30);
		return driver.findElement(FirstName_ErrorMessage);
		
		
	}
	
	public WebElement LastName_ErrorMessage() {
		waitForElementToVisible(LastName_ErrorMessage, driver, 30);
		return driver.findElement(LastName_ErrorMessage);
		
	}
	
	public WebElement Email_ErrorMessage() {
		waitForElementToVisible(Email_ErrorMessage, driver, 30);
		return driver.findElement(Email_ErrorMessage);
		
	}
	
	public WebElement Telophone_ErrorMessage() {
		waitForElementToVisible(Telophone_ErrorMessage, driver, 30);
		return driver.findElement(Telophone_ErrorMessage);
		
	}
	
	public WebElement Password_ErrorMessage() {
		waitForElementToVisible(Password_ErrorMessage, driver, 30);
		return driver.findElement(Password_ErrorMessage);
		
	}
	
	public WebElement PasswordConfirm_ErrorMessage() {
		waitForElementToVisible(PasswordConfirm_ErrorMessage, driver, 30);
		return driver.findElement(PasswordConfirm_ErrorMessage);
		
	}
	
	public WebElement FirstName_TextField() {
		waitForElementToVisible(FirstName_TextField, driver, 30);
		return driver.findElement(FirstName_TextField);
		
	}
	
	public WebElement LastName_TextField() {
		waitForElementToVisible(LastName_TextField, driver, 30);
		return driver.findElement(LastName_TextField);
		
	}
	
	public WebElement Email_TextField() {
		waitForElementToVisible(Email_TextField, driver, 30);
		return driver.findElement(Email_TextField);
		
	}
	
	public WebElement Telephone_TextField() {
		waitForElementToVisible(Telephone_TextField, driver, 30);
		return driver.findElement(Telephone_TextField);
		
	}
	
	public WebElement Password_TextField() {
		waitForElementToVisible(Password_TextField, driver, 30);
		return driver.findElement(Password_TextField);
		
	}
	
	public WebElement ConfirmPassword_TextField() {
		waitForElementToVisible(ConfirmPassword_TextField, driver, 30);
		return driver.findElement(ConfirmPassword_TextField);
		
	}
	
	public WebElement yes_RedioButton() {
		waitForElementToVisible(yes_RedioButton, driver, 30);
		return driver.findElement(yes_RedioButton);
		
	}
	
	public WebElement PrivacyPolicy_CheckBox() {
		waitForElementToVisible(PrivacyPolicy_CheckBox, driver, 30);
		return driver.findElement(PrivacyPolicy_CheckBox);
		
	}
	
	public WebElement Continue_ButtonForRegister() {
		waitForElementToVisible(Continue_ButtonForRegister, driver, 30);
		return driver.findElement(Continue_ButtonForRegister);
		
	}
	
	public WebElement ActualText_ForRegisterPageAssertion() {
		waitForElementToVisible(ActualText_ForRegisterPageAssertion, driver, 30);
		return driver.findElement(ActualText_ForRegisterPageAssertion);
		
	}
	
	public WebElement ContinueButton_AfterRegistration() {
		waitForElementToVisible(ContinueButton_AfterRegistration, driver, 30);
		return driver.findElement(ContinueButton_AfterRegistration);
		
	}
	public WebElement MyAccount_ForAssertion() {
		waitForElementToVisible(MyAccount_ForAssertion, driver, 30);
		return driver.findElement(MyAccount_ForAssertion);
		
	}
	
	public List<WebElement> HyperLinks(){
		waitForElementToVisible(HyperLinks, driver, 30);
		return driver.findElements(HyperLinks);
		
	}

}
