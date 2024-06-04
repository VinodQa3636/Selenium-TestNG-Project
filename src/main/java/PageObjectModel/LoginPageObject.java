package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class LoginPageObject extends CommonMethod {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {

		this.driver = driver;
	}
	
		//verifyElementVisibility
	
	private By MyAccount = By.xpath("//span[text()='My Account']");
	private By MyAccount_Dropdown = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");
	private By ActualText_ForAssertionLogin = By.xpath("//h2[text()='Returning Customer']");
	private By NewCustomer_Text = By.xpath("//h2[text()='New Customer']");
	private By RegisterAccount_Text = By.xpath("//strong[text()='Register Account']");
	private By Paragraph_Text = By.xpath("(//div[@class='well'])[1]/p[2]");
	private By Continue_Button = By.xpath("//a[text()='Continue']");
	private By ParagraphText_ReturningCustomer = By.xpath("//strong[text()='I am a returning customer']");
	private By EmailAddress_LabelName = By.xpath("//label[text()='E-Mail Address']");
	private By Password_LabelName = By.xpath("//label[text()='Password']");
	private By ForgottenPassword_Link = By.xpath("(//a[text()='Forgotten Password'])[1]");
	private By Login_Button = By.xpath("//input[@type='submit']");
	
	
	private By EmailAddress_TextField = By.xpath("//input[@id='input-email']");
	private By Password_TextField = By.xpath("//input[@type='password']");
	private By AssertionFor_LoginPage = By.xpath("//h2[text()='My Account']");
	private By ContinueButton_AssertionMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By ContinueButton_AssertionMessageForWrongEmail = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	// 
	
	private By MyAccount_ForAssertion = By.xpath("//h2[text()='My Account']");
	
	//	verifyLoginPage_ElementVisibility()
	
	private By PhoneIcon = By.xpath("//a//i[@class='fa fa-phone']");
	private By PhoneNumber = By.xpath("//span[text()='123456789']");
	private By MyAccount_Icon = By.xpath("//i[@class='fa fa-user']");
	private By MyAccount_Text = By.xpath("//span[text()='My Account']");
	private By WishList_Icon = By.xpath("(//i[@class='fa fa-heart'])[1]");
	private By WishList_Text = By.xpath("//span[text()='Wish List (0)']");
	private By ShoppingCart_Icon = By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
	private By ShoppingCart_Text = By.xpath("//span[text()='Shopping Cart']");
	private By Checkout_Icon = By.xpath("//i[@class='fa fa-share']");
	private By Checkout_Text = By.xpath("//span[text()='Checkout']");
	private By SearchBar = By.xpath("//input[@name='search']");
	private By SearchBar_Icon = By.xpath("//i[@class='fa fa-search']");
	private By AddToCart_TextBox = By.xpath("//div[@id='cart']");
	private By AddToCart_Icon = By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	private By AddToCart_Item = By.xpath("//span[text()='0 item(s) - $0.00']");
	private By NaveenAutomationLabs_Logo = By.xpath("//div[@id='logo']"); 
	
	private By Desktops_Tab = By.xpath("//a[text()='Desktops']");
	private By desktops_Tab_Show_AllDesktops = By.xpath("//a[text()='Show All Desktops']");
	private By LaptopsAndNotebooks_Tab = By.xpath("//a[text()='Laptops & Notebooks']");
	private By Components_Tab = By.xpath("//a[text()='Components']");
	private By Tablets_Tab = By.xpath("//a[text()='Tablets']");
	private By Software_Tab = By.xpath("//a[text()='Software']");
	private By PhonesAndPDAs_Tab = By.xpath("//a[text()='Phones & PDAs']");
	private By Cameras_Tab = By.xpath("//a[text()='Cameras']");
	private By MP3Players_Tab = By.xpath("//a[text()='MP3 Players']");
	
	
		//	verifyTotalLinks()
	
	private By BrokenLinks = By.xpath("//ul[@class='list-unstyled']/li");
	
	
	public WebElement MyAccount() {
		waitForElementToVisible(MyAccount, driver, 30);
		return driver.findElement(MyAccount);
		
	}
	
	public List<WebElement> MyAccount_Dropdown(){
		waitForElementToVisible(MyAccount_Dropdown, driver, 30);
		return driver.findElements(MyAccount_Dropdown);
		
	}
	
	public WebElement ActualText_ForAssertionLogin() {
		waitForElementToVisible(ActualText_ForAssertionLogin, driver, 30);
		return driver.findElement(ActualText_ForAssertionLogin);
		
	}
	
	public WebElement NewCustomer_Text() {
		waitForElementToVisible(NewCustomer_Text, driver, 30);
		return driver.findElement(NewCustomer_Text);
		
	}
	
	public WebElement RegisterAccount_Text() {
		waitForElementToVisible(RegisterAccount_Text, driver, 30);
		return driver.findElement(RegisterAccount_Text);
	}
	
	public WebElement Paragraph_Text() {
		waitForElementToVisible(Paragraph_Text, driver, 30);
		return driver.findElement(Paragraph_Text);
	}
	
	public WebElement Continue_Button() {
		waitForElementToVisible(Continue_Button, driver, 30);
		return driver.findElement(Continue_Button);
		
	}
	
	public WebElement ParagraphText_ReturningCustomer() {
		waitForElementToVisible(ParagraphText_ReturningCustomer, driver, 30);
		return driver.findElement(ParagraphText_ReturningCustomer);
		
	}
	
	public WebElement EmailAddress_LabelName() {
		waitForElementToVisible(EmailAddress_LabelName, driver, 30);
		return driver.findElement(EmailAddress_LabelName);
	}
	
	public WebElement Password_LabelName() {
		waitForElementToVisible(Password_LabelName, driver, 30);
		return driver.findElement(Password_LabelName);
		
	}
	
	public WebElement ForgottenPassword_Link() {
		waitForElementToVisible(ForgottenPassword_Link, driver, 30);
		return driver.findElement(ForgottenPassword_Link);
		
	}
	
	public WebElement Login_Button() {
		waitForElementToVisible(Login_Button, driver, 30);
		return driver.findElement(Login_Button);
		
	}
	public WebElement EmailAddress_TextField() {
		waitForElementToVisible(EmailAddress_TextField, driver, 30);
		return driver.findElement(EmailAddress_TextField);
		
	}
	
	public WebElement Password_TextField() {
		waitForElementToVisible(Password_TextField, driver, 30);
		return driver.findElement(Password_TextField);
				
		
	}
	public WebElement ContinueButton_AssertionMessage() {
		waitForElementToVisible(ContinueButton_AssertionMessage, driver, 30);
		return driver.findElement(ContinueButton_AssertionMessage);
		
	}
	public WebElement ContinueButton_AssertionMessageForWrongEmail() {
		waitForElementToVisible(ContinueButton_AssertionMessageForWrongEmail, driver, 30);
		return driver.findElement(ContinueButton_AssertionMessageForWrongEmail);
	}
	
	public WebElement MyAccount_ForAssertion() {
		waitForElementToVisible(MyAccount_ForAssertion, driver, 30);
		return driver.findElement(MyAccount_ForAssertion);
		
	}
	
	public WebElement AssertionFor_LoginPage() {
		waitForElementToVisible(AssertionFor_LoginPage, driver, 30);
		return driver.findElement(AssertionFor_LoginPage);
		
	}
	
	public WebElement PhoneIcon() {
		waitForElementToVisible(PhoneIcon, driver, 30);
		return driver.findElement(PhoneIcon);
		
	}
	
	public WebElement PhoneNumber() {
		waitForElementToVisible(PhoneNumber, driver, 30);
		return driver.findElement(PhoneNumber);
		
	}
	
	public WebElement MyAccount_Icon() {
		waitForElementToVisible(MyAccount_Icon, driver, 30);
		return driver.findElement(MyAccount_Icon);
		
	}
	
	public WebElement MyAccount_Text() {
		waitForElementToVisible(MyAccount_Text, driver, 30);
		return driver.findElement(MyAccount_Text);
		
	}
	
	public WebElement WishList_Icon() {
		waitForElementToVisible(WishList_Icon, driver, 30);
		return driver.findElement(WishList_Icon);
		
	}
	
	public WebElement WishList_Text() {
		waitForElementToVisible(WishList_Text, driver, 30);
		return driver.findElement(WishList_Text);
		
	}
	
	public WebElement ShoppingCart_Icon() {
		waitForElementToVisible(ShoppingCart_Icon, driver, 30);
		return driver.findElement(ShoppingCart_Icon);
		
	}
	
	public WebElement ShoppingCart_Text() {
		waitForElementToVisible(ShoppingCart_Text, driver, 30);
		return driver.findElement(ShoppingCart_Text);
		
	}
	
	public WebElement Checkout_Icon() {
		waitForElementToVisible(Checkout_Icon, driver, 30);
		return driver.findElement(Checkout_Icon);
		
	}
	
	public WebElement Checkout_Text() {
		waitForElementToVisible(Checkout_Text, driver, 30);
		return driver.findElement(Checkout_Text);
		
	}
	
	public WebElement SearchBar() {
		waitForElementToVisible(SearchBar, driver, 30);
		return driver.findElement(SearchBar);
		
	}
	
	public WebElement SearchBar_Icon() {
		waitForElementToVisible(SearchBar_Icon, driver, 30);
		return driver.findElement(SearchBar_Icon);
		
	}
	
	public WebElement AddToCart_TextBox() {
		waitForElementToVisible(AddToCart_TextBox, driver, 30);
		return driver.findElement(AddToCart_TextBox);
		
	}
	
	public WebElement AddToCart_Icon() {
		waitForElementToVisible(AddToCart_Icon, driver, 30);
		return driver.findElement(AddToCart_Icon);
		
	}
	
	public WebElement AddToCart_Item() {
		waitForElementToVisible(AddToCart_Item, driver, 30);
		return driver.findElement(AddToCart_Item);
		
	}
	
	public WebElement NaveenAutomationLabs_Logo() {
		waitForElementToVisible(NaveenAutomationLabs_Logo, driver, 30);
		return driver.findElement(NaveenAutomationLabs_Logo);
		
	}
	
	public WebElement Desktops_Tab() {
		waitForElementToVisible(Desktops_Tab, driver, 30);
		return driver.findElement(Desktops_Tab);

	}
	
	public WebElement desktops_Tab_Show_AllDesktops() {
		waitForElementToVisible(desktops_Tab_Show_AllDesktops, driver, 30);
		return driver.findElement(desktops_Tab_Show_AllDesktops);
		
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
	
	public List<WebElement>BrokenLinks(){
		waitForElementToVisible(BrokenLinks, driver, 30);
		return driver.findElements(BrokenLinks);
		
	}

	
	
	
}
