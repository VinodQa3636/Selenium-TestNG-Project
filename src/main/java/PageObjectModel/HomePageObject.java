package PageObjectModel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class HomePageObject extends CommonMethod {

	WebDriver driver;

	public HomePageObject(WebDriver driver) {

		this.driver = driver;
	}

	// verifyHomePage_ElementVisibility()

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
	private By LaptopsAndNotebooks_Tab = By.xpath("//a[text()='Laptops & Notebooks']");
	private By Components_Tab = By.xpath("//a[text()='Components']");
	private By Tablets_Tab = By.xpath("//a[text()='Tablets']");
	private By Software_Tab = By.xpath("//a[text()='Software']");
	private By PhonesAndPDAs_Tab = By.xpath("//a[text()='Phones & PDAs']");
	private By Cameras_Tab = By.xpath("//a[text()='Cameras']");
	private By MP3Players_Tab = By.xpath("//a[text()='MP3 Players']");
	
	// Identify Webelement for verifyElementVisibilityFor_HorizontalScroll()
	
	private By MacBookAir = By.xpath("//img[@alt='MacBookAir']");
	
	// Identify Webelement for verifyProductList_FeaturedSection()
	
	private By ActualText_FeaturedAssrtion = By.xpath("//h3[text()='Featured']");
	private By ProductList_FeaturedSection = By.xpath("//div[@class='image']");
	
	// Identify Webelement for verifyMacBook_FeaturedSection()
	
	private By MacBookImage_FeaturedSection = By.xpath("//img[@title='MacBook']");
	private By MacBookText_FeaturedSection = By.xpath("//a[text()='MacBook']");
	private By MackBookParaText = By.xpath("//p[contains(text(),'Intel Core 2 Duo processor')]");
	private By MackBook_Price = By.xpath("(//p[@class='price'])[1]");
	private By MackBook_ExTax = By.xpath("//p[@class='price']/span[text()='Ex Tax: $500.00']");
	private By AddToCartIcon_MackBook = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By AddToCartText_MackBook = By.xpath("(//span[text()='Add to Cart'])[1]");
	private By AddToWishList_ToolTip_MackBook = By.xpath("(//button[@data-original-title='Add to Wish List'])[1]");
	private By CompareThisProductToolTip_MackBook = By.xpath("(//button[@data-original-title='Compare this Product'])[1]");
	
	//	Identify Webelement for verifyIPhone_FeaturedSection()
	
	private By iPhoneImage = By.xpath("//img[@title='iPhone']");
	private By IphoneText = By.xpath("//a[text()='iPhone']");
	private By IphoneParaText = By.xpath("//p[contains(text(),'iPhone is a revolutionary')]");
	private By Iphone_Price = By.xpath("(//p[@class='price'])[2]");
	private By Iphone_ExTax = By.xpath("//span[text()='Ex Tax: $101.00']");
	private By AddToCartIcon = By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
	private By AddToCartText = By.xpath("(//span[text()='Add to Cart'])[2]");
	private By AddToWishList_ToolTip_Iphone = By.xpath("(//button[@data-original-title='Add to Wish List'])[2]");
	private By CompareThisProductToolTip_Iphone = By.xpath("(//button[@data-original-title='Compare this Product'])[2]");
	
	
//	Identify Webelement for verifyAppleCinema30Product()
	
	private By AppleCinema30Image = By.xpath("(//div[@class='image'])[3]");
	private By AppleCinema30_Text = By.xpath("//a[text()='Apple Cinema 30\"']");
	private By AppleCinema30_ParaText = By.xpath("");
	private By AppleCinema30_Price = By.xpath("//span[text()='$110.00']");
	private By AppleCinema30_OldPrice = By.xpath("(//span[text()='$122.00'])[1]");
	private By AppleCinema30_ExTaxPrice = By.xpath("//span[text()='Ex Tax: $90.00']");
	private By AppleCinema30_AddToCart_Icon = By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By AppleCinema30_AddToCartText = By.xpath("(//span[text()='Add to Cart'])[3]");
	private By AppleCinema30_AddToWishListIcon = By.xpath("(//i[@class='fa fa-heart'])[4]");
	private By AppleCinema30_CmpareThisProductIcon = By.xpath("(//i[@class='fa fa-exchange'])[3]");
	
	
//	Identify Webelement for verifyAppleCinema30Product()
	
	
	
	
	

//	Create Method For verifyHomePage_ElementVisibility() 

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

	// Create a method for Visibility Element and Move to element Action Perform

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
	
	// Create Method For verifyElementVisibilityFor_HorizontalScroll()
	
	public WebElement MacBookAir() {
		waitForElementToVisible(MacBookAir, driver, 30);
		return driver.findElement(MacBookAir);
		
	}
	
	// Create Method For verifyProductList_FeaturedSection()
	
	public WebElement ActualText_FeaturedAssrtion() {
		waitForElementToVisible(ActualText_FeaturedAssrtion, driver, 30);
		return driver.findElement(ActualText_FeaturedAssrtion);
		
	}
	
	public List<WebElement>ProductList_FeaturedSection(){
		waitForElementToVisible(ProductList_FeaturedSection, driver, 30);
		return driver.findElements(ProductList_FeaturedSection);
		
	}
	
	// Create Method For verifyMacBook_FeaturedSection()
	
	public WebElement MacBookImage_FeaturedSection() {
		waitForElementToVisible(MacBookImage_FeaturedSection, driver, 30);
		return driver.findElement(MacBookImage_FeaturedSection);
		
	}
	
	public WebElement MacBookText_FeaturedSection() {
		waitForElementToVisible(MacBookText_FeaturedSection, driver, 30);
		return driver.findElement(MacBookText_FeaturedSection);
		
	}
	
	public WebElement MackBookParaText() {
		waitForElementToVisible(MackBookParaText, driver, 30);
		return driver.findElement(MackBookParaText);
		
	}
	
	public WebElement MackBook_Price() {
		waitForElementToVisible(MackBook_Price, driver, 30);
		return driver.findElement(MackBook_Price);
		
	}
	
	public WebElement MackBook_ExTax() {
		waitForElementToVisible(MackBook_ExTax, driver, 30);
		return driver.findElement(MackBook_ExTax);
		
	}

	public WebElement AddToCartIcon_MackBook() {
		waitForElementToVisible(AddToCartIcon_MackBook, driver, 30);
		return driver.findElement(AddToCartIcon_MackBook);
		
	}
	
	public WebElement AddToCartText_MackBook() {
		waitForElementToVisible(AddToCartText_MackBook, driver, 30);
		return driver.findElement(AddToCartText_MackBook);
		
	}
	
	public WebElement AddToWishList_ToolTip_MackBook() {
		waitForElementToVisible(AddToWishList_ToolTip_MackBook, driver, 30);
		return driver.findElement(AddToWishList_ToolTip_MackBook);
		
	}
	
	public WebElement CompareThisProductToolTip_MackBook() {
		waitForElementToVisible(CompareThisProductToolTip_MackBook, driver, 30);
		return driver.findElement(CompareThisProductToolTip_MackBook);
		
	}
	
	// Create Method For verifyIPhone_FeaturedSection()
	
	public WebElement iPhoneImage() {
		waitForElementToVisible(iPhoneImage, driver, 30);
		return driver.findElement(iPhoneImage);
		
	}
	
	public WebElement IphoneText() {
		waitForElementToVisible(IphoneText, driver, 30);
		return driver.findElement(IphoneText);
		
	}
	
	public WebElement IphoneParaText() {
		waitForElementToVisible(IphoneParaText, driver, 30);
		return driver.findElement(IphoneParaText);
		
	}
	
	public WebElement Iphone_Price() {
		waitForElementToVisible(Iphone_Price, driver, 30);
		return driver.findElement(Iphone_Price);
		
	}
	public WebElement Iphone_ExTax() {
		waitForElementToVisible(Iphone_ExTax, driver, 30);
		return driver.findElement(Iphone_ExTax);
		
	}
	
	public WebElement AddToCartIcon() {
		waitForElementToVisible(AddToCartIcon, driver, 30);
		return driver.findElement(AddToCartIcon);
		
	}
	
	public WebElement AddToCartText() {
		waitForElementToVisible(AddToCartText, driver, 30);
		return driver.findElement(AddToCartText);
		
	}
	
	public WebElement AddToWishList_ToolTip_Iphone() {
		waitForElementToVisible(AddToWishList_ToolTip_Iphone, driver, 30);
		return driver.findElement(AddToWishList_ToolTip_Iphone);
		
	}
	
	public WebElement CompareThisProductToolTip_Iphone() {
		waitForElementToVisible(CompareThisProductToolTip_Iphone, driver, 30);
		return driver.findElement(CompareThisProductToolTip_Iphone);
		
	}
	
	public WebElement AppleCinema30Image() {
		waitForElementToVisible(AppleCinema30Image, driver, 30);
		return driver.findElement(AppleCinema30Image);
		
	}
	
	public WebElement AppleCinema30_Text() {
		waitForElementToVisible(AppleCinema30_Text, driver, 30);
		return driver.findElement(AppleCinema30_Text);
		
		
	}


}
