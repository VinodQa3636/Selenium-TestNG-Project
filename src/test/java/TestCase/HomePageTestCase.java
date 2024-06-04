package TestCase;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class HomePageTestCase extends BaseClass {

	@Test(priority = 0)
	public void verifyHomePage_ElementVisibility() {

		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);

		CommonMethod.isElementDisplayed(hpo.PhoneIcon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.PhoneIcon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.PhoneIcon());

		CommonMethod.isElementDisplayed(hpo.PhoneNumber());
		System.out.println(CommonMethod.isElementDisplayed(hpo.PhoneNumber()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.PhoneNumber());

		CommonMethod.isElementDisplayed(hpo.MyAccount_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MyAccount_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MyAccount_Icon());

		CommonMethod.isElementDisplayed(hpo.MyAccount_Text());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MyAccount_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MyAccount_Text());

		CommonMethod.isElementDisplayed(hpo.WishList_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.WishList_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.WishList_Icon());

		CommonMethod.isElementDisplayed(hpo.WishList_Text());
		System.out.println(CommonMethod.isElementDisplayed(hpo.WishList_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.WishList_Text());

		CommonMethod.isElementDisplayed(hpo.ShoppingCart_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.ShoppingCart_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.ShoppingCart_Icon());

		CommonMethod.isElementDisplayed(hpo.ShoppingCart_Text());
		System.out.println(CommonMethod.isElementDisplayed(hpo.ShoppingCart_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.ShoppingCart_Text());

		CommonMethod.isElementDisplayed(hpo.Checkout_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.Checkout_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Checkout_Icon());

		CommonMethod.isElementDisplayed(hpo.Checkout_Text());
		System.out.println(CommonMethod.isElementDisplayed(hpo.Checkout_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Checkout_Text());

		CommonMethod.isElementDisplayed(hpo.SearchBar());
		System.out.println(CommonMethod.isElementDisplayed(hpo.SearchBar()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.SearchBar());

		CommonMethod.isElementDisplayed(hpo.SearchBar_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.SearchBar_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.SearchBar_Icon());

		CommonMethod.isElementDisplayed(hpo.AddToCart_TextBox());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCart_TextBox()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCart_TextBox());

		CommonMethod.isElementDisplayed(hpo.AddToCart_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCart_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCart_Icon());

		CommonMethod.isElementDisplayed(hpo.AddToCart_Item());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCart_Item()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCart_Item());

		CommonMethod.isElementDisplayed(hpo.NaveenAutomationLabs_Logo());
		System.out.println(CommonMethod.isElementDisplayed(hpo.NaveenAutomationLabs_Logo()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.NaveenAutomationLabs_Logo());

		// All Element Visibility with move to element action perform

		CommonMethod.isElementDisplayed(hpo.Desktops_Tab());
		System.out.println(CommonMethod.isElementDisplayed(hpo.Desktops_Tab()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Desktops_Tab());
		CommonMethod.moveToElement(hpo.Desktops_Tab(), driver);

		CommonMethod.isElementDisplayed(hpo.LaptopsAndNotebooks_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.LaptopsAndNotebooks_Tab());
		CommonMethod.moveToElement(hpo.LaptopsAndNotebooks_Tab(), driver);

		CommonMethod.isElementDisplayed(hpo.Components_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Components_Tab());
		CommonMethod.moveToElement(hpo.Components_Tab(), driver);

		CommonMethod.isElementDisplayed(hpo.Tablets_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Tablets_Tab());

		CommonMethod.isElementDisplayed(hpo.Software_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Software_Tab());

		CommonMethod.isElementDisplayed(hpo.PhonesAndPDAs_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.PhonesAndPDAs_Tab());

		CommonMethod.isElementDisplayed(hpo.Cameras_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Cameras_Tab());

		CommonMethod.isElementDisplayed(hpo.MP3Players_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MP3Players_Tab());
		CommonMethod.moveToElement(hpo.MP3Players_Tab(), driver);

	}

	/*
	 * @Test public void verifyElementVisibilityFor_HorizontalScroll() {
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * HomePageObject hpo = new HomePageObject(driver);
	 * 
	 * CommonMethod.moveToElement(hpo.MacBookAir(), driver);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void verifyProductList_FeaturedSection() throws InterruptedException {

		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);

		CommonMethod.scrollDownTillElementVisible(hpo.ActualText_FeaturedAssrtion(), driver);
		Thread.sleep(2000);
		CommonMethod.isElementDisplayed(hpo.ActualText_FeaturedAssrtion());
		System.out.println(CommonMethod.isElementDisplayed(hpo.ActualText_FeaturedAssrtion()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.ActualText_FeaturedAssrtion());
		CommonMethod.HandleSoftAssertion(hpo.ActualText_FeaturedAssrtion().getText(),Constants.ExpectedText_FeaturedAssrtion);
		System.out.println(hpo.ActualText_FeaturedAssrtion().getText());

		System.out.println(" The size of ProductList_FeaturedSection ===>  " + hpo.ProductList_FeaturedSection().size());

	}

	@Test(priority = 2)
	public void verifyMacBook_FeaturedSection() {

		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);

		CommonMethod.scrollDownTillElementVisible(hpo.ActualText_FeaturedAssrtion(), driver);
		CommonMethod.isElementDisplayed(hpo.MacBookImage_FeaturedSection());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MacBookImage_FeaturedSection()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MacBookImage_FeaturedSection());

		CommonMethod.isElementDisplayed(hpo.MacBookText_FeaturedSection());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MacBookText_FeaturedSection()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MacBookText_FeaturedSection());

		CommonMethod.isElementDisplayed(hpo.MackBookParaText());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MackBookParaText()));
		System.out.println(" Para Text for MacBook Product ===> " + hpo.MackBookParaText().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MackBookParaText());

		CommonMethod.isElementDisplayed(hpo.MackBook_Price());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MackBook_Price()));
		System.out.println(" Price For MacBook Product ===> " + hpo.MackBook_Price().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MackBook_Price());

		CommonMethod.isElementDisplayed(hpo.MackBook_ExTax());
		System.out.println(CommonMethod.isElementDisplayed(hpo.MackBook_ExTax()));
		System.out.println(" Ex Tax For MacBook Product ===> " + hpo.MackBook_ExTax().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.MackBook_ExTax());

		CommonMethod.isElementDisplayed(hpo.AddToCartIcon_MackBook());
		System.out.println(" Add To Cart Icon is displayed ===> " + CommonMethod.isElementDisplayed(hpo.AddToCartIcon_MackBook()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCartIcon_MackBook());

		CommonMethod.isElementDisplayed(hpo.AddToCartText_MackBook());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCartText_MackBook()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCartText_MackBook());

		String ActualToolTip = hpo.AddToWishList_ToolTip_MackBook().getAttribute("data-original-title");

		String ExpectedToolTip = "Add to Wish List";

		if (ActualToolTip.equalsIgnoreCase(ExpectedToolTip)) {

			System.out.println(" Tool Tip is Matched Add to Wish List ...");
		} else {

			System.out.println(" Tool Tip is not matched Add to Wish List ...");
		}

		String ActualToolTipFor_CompareThisProduct = hpo.CompareThisProductToolTip_MackBook()
				.getAttribute("data-original-title");

		String ExpectedToolTipFor_CompareThisProduct = "Compare this Product";

		if (ActualToolTipFor_CompareThisProduct.equalsIgnoreCase(ExpectedToolTipFor_CompareThisProduct)) {

			System.out.println(" Tooltip is Matched For Compare This Product  ...");
		} else {

			System.out.println(" Tooltip is not matched For Compare This Product... ");
		}

	}
	
	@Test(priority = 3)
	public void verifyIPhone_FeaturedSection() {
		
		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);
		
		CommonMethod.isElementDisplayed(hpo.iPhoneImage());
		System.out.println(CommonMethod.isElementDisplayed(hpo.iPhoneImage()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.iPhoneImage());
		
		CommonMethod.isElementDisplayed(hpo.IphoneText());
		System.out.println(CommonMethod.isElementDisplayed(hpo.IphoneText()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.IphoneText());
		
		CommonMethod.isElementDisplayed(hpo.IphoneParaText());
		System.out.println(CommonMethod.isElementDisplayed(hpo.IphoneParaText()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.IphoneParaText());
		
		CommonMethod.isElementDisplayed(hpo.Iphone_Price());
		System.out.println(CommonMethod.isElementDisplayed(hpo.Iphone_Price()));
		System.out.println(hpo.Iphone_Price().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Iphone_Price());
		
		CommonMethod.isElementDisplayed(hpo.Iphone_ExTax());
		System.out.println(CommonMethod.isElementDisplayed(hpo.Iphone_ExTax()));
		System.out.println(hpo.Iphone_ExTax().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.Iphone_ExTax());
		
		CommonMethod.isElementDisplayed(hpo.AddToCart_Icon());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCart_Icon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCart_Icon());
		
		CommonMethod.isElementDisplayed(hpo.AddToCart_TextBox());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AddToCart_TextBox()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AddToCart_TextBox());
		
		
		String ActualToolTip = hpo.AddToWishList_ToolTip_Iphone().getAttribute("data-original-title");

		String ExpectedToolTip = "Add to Wish List";

		if (ActualToolTip.equalsIgnoreCase(ExpectedToolTip)) {

			System.out.println(" Tool Tip is Matched Add to Wish List ...");
		} else {

			System.out.println(" Tool Tip is not matched Add to Wish List ...");
		}
		
		
		String ActualToolTipFor_CompareThisProduct = hpo.CompareThisProductToolTip_Iphone().getAttribute("data-original-title");

		String ExpectedToolTipFor_CompareThisProduct = "Compare this Product";

		if (ActualToolTipFor_CompareThisProduct.equalsIgnoreCase(ExpectedToolTipFor_CompareThisProduct)) {

			System.out.println(" Tooltip is Matched For Compare This Product  ...");
		} else {

			System.out.println(" Tooltip is not matched For Compare This Product... ");
		}
		
	}
	
	@Test(priority = 4)
	public void verifyAppleCinema30Product() {
		
		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);
		
		CommonMethod.isElementDisplayed(hpo.AppleCinema30Image());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AppleCinema30Image()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AppleCinema30Image());
		
		CommonMethod.isElementDisplayed(hpo.AppleCinema30_Text());
		System.out.println(CommonMethod.isElementDisplayed(hpo.AppleCinema30_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(hpo.AppleCinema30_Text());
		
		
				
	}
	
	@Test(priority = 5)
	public void verify_CanonEOS5D_Product() {
		
		driver.manage().window().maximize();
		HomePageObject hpo = new HomePageObject(driver);
		
		
		
	}

}
