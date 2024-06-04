package TestCase;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.RegisterPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class LoginPageTestCase extends BaseClass {
	
	

	@Test(priority = 0)
	public void verifyElementVisibility() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPageObject lpo = new LoginPageObject(driver);

		CommonMethod.clickOnElement(lpo.MyAccount());
		CommonMethod.HandleDropDown(lpo.MyAccount_Dropdown(), Constants.Choose_MyAccountDropdown);
		CommonMethod.HandleSoftAssertion(lpo.ActualText_ForAssertionLogin().getText(),Constants.ExpectedText_ForAssertionLogin);
		System.out.println(lpo.ActualText_ForAssertionLogin().getText());

		CommonMethod.isElementDisplayed(lpo.NewCustomer_Text());
		System.out.println(CommonMethod.isElementDisplayed(lpo.NewCustomer_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.NewCustomer_Text());

		CommonMethod.isElementDisplayed(lpo.RegisterAccount_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.RegisterAccount_Text());

		CommonMethod.isElementDisplayed(lpo.Paragraph_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Paragraph_Text());

		CommonMethod.isElementDisplayed(lpo.Continue_Button());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Continue_Button());

		CommonMethod.isElementDisplayed(lpo.ParagraphText_ReturningCustomer());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.ParagraphText_ReturningCustomer());

		CommonMethod.isElementDisplayed(lpo.EmailAddress_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.EmailAddress_LabelName());

		CommonMethod.isElementDisplayed(lpo.Password_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Password_LabelName());

		CommonMethod.isElementDisplayed(lpo.ForgottenPassword_Link());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.ForgottenPassword_Link());

		CommonMethod.isElementDisplayed(lpo.Login_Button());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Login_Button());

	}

	@Test(priority = 1)
	public void verifyErrorMessage() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPageObject lpo = new LoginPageObject(driver);

		CommonMethod.clickOnElement(lpo.MyAccount());
		CommonMethod.HandleDropDown(lpo.MyAccount_Dropdown(), Constants.Choose_MyAccountDropdown);
		CommonMethod.HandleSoftAssertion(lpo.ActualText_ForAssertionLogin().getText(),
				Constants.ExpectedText_ForAssertionLogin);
		System.out.println(lpo.ActualText_ForAssertionLogin().getText());

		// When user randomly click on Login Button.

		CommonMethod.clickOnElement(lpo.Login_Button());
		CommonMethod.HandleSoftAssertion(lpo.ContinueButton_AssertionMessage().getText(),
				Constants.ExpectedText_ContinueButton_AssertionMessage);
		System.out.println(lpo.ContinueButton_AssertionMessage().getText());

		// When user entered wrong Email Id

		CommonMethod.setText(lpo.EmailAddress_TextField(), CommonMethod.generateRandomEmail());
		CommonMethod.setText(lpo.Password_TextField(), CommonMethod.generateRandomString(5));
		CommonMethod.clickOnElement(lpo.Login_Button());
		CommonMethod.HandleSoftAssertion(lpo.ContinueButton_AssertionMessageForWrongEmail().getText(),
				Constants.ExpectedText_ContinueButton_AssertionMessageForWrongEmail);
		System.out.println(lpo.ContinueButton_AssertionMessageForWrongEmail().getText());
	}

	@Test (priority = 2)
	public void verifyLoginFunality() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPageObject lpo = new LoginPageObject(driver);

		CommonMethod.clickOnElement(lpo.MyAccount());
		CommonMethod.HandleDropDown(lpo.MyAccount_Dropdown(), Constants.Choose_MyAccountDropdown);
		CommonMethod.HandleSoftAssertion(lpo.ActualText_ForAssertionLogin().getText(),Constants.ExpectedText_ForAssertionLogin);
		System.out.println(lpo.ActualText_ForAssertionLogin().getText());

			// Login with valid Credentials 
		
		CommonMethod.setText(lpo.EmailAddress_TextField(), Constants.Email_Address);
		CommonMethod.setText(lpo.Password_TextField(), Constants.Password_TextField);
		CommonMethod.clickOnElement(lpo.Login_Button());
		CommonMethod.HandleSoftAssertion(lpo.AssertionFor_LoginPage().getText(),Constants.ExpectedText_AssertionFor_LoginPage);
		System.out.println(lpo.AssertionFor_LoginPage().getText());
		
		}
	
	@Test(priority = 3)
	public void verifyLoginPage_ElementVisibility() throws InterruptedException {
		
		driver.manage().window().maximize();

		LoginPageObject lpo = new LoginPageObject(driver);

		CommonMethod.clickOnElement(lpo.MyAccount());
		CommonMethod.HandleDropDown(lpo.MyAccount_Dropdown(), Constants.Choose_MyAccountDropdown);
		CommonMethod.HandleSoftAssertion(lpo.ActualText_ForAssertionLogin().getText(),Constants.ExpectedText_ForAssertionLogin);
		System.out.println(lpo.ActualText_ForAssertionLogin().getText());

			// Login with valid Credentials 
		
		CommonMethod.setText(lpo.EmailAddress_TextField(), Constants.Email_Address);
		CommonMethod.setText(lpo.Password_TextField(), Constants.Password_TextField);
		CommonMethod.clickOnElement(lpo.Login_Button());
		CommonMethod.HandleSoftAssertion(lpo.AssertionFor_LoginPage().getText(),Constants.ExpectedText_AssertionFor_LoginPage);
		System.out.println(lpo.AssertionFor_LoginPage().getText());
		
		CommonMethod.isElementDisplayed(lpo.PhoneIcon());
		System.out.println(CommonMethod.isElementDisplayed(lpo.PhoneIcon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.PhoneIcon());
		
		CommonMethod.isElementDisplayed(lpo.PhoneNumber());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.PhoneNumber());
		
		CommonMethod.isElementDisplayed(lpo.MyAccount_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.MyAccount_Icon());
		
		CommonMethod.isElementDisplayed(lpo.MyAccount_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.MyAccount_Text());
		
		CommonMethod.isElementDisplayed(lpo.WishList_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.WishList_Icon());
		
		CommonMethod.isElementDisplayed(lpo.WishList_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.WishList_Text());
		
		CommonMethod.isElementDisplayed(lpo.ShoppingCart_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.ShoppingCart_Icon());
		
		CommonMethod.isElementDisplayed(lpo.ShoppingCart_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.ShoppingCart_Text());
		
		CommonMethod.isElementDisplayed(lpo.Checkout_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Checkout_Icon());
		
		CommonMethod.isElementDisplayed(lpo.Checkout_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Checkout_Text());
		
		CommonMethod.isElementDisplayed(lpo.SearchBar());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.SearchBar());
		
		CommonMethod.isElementDisplayed(lpo.SearchBar_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.SearchBar_Icon());
		
		CommonMethod.isElementDisplayed(lpo.AddToCart_TextBox());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.AddToCart_TextBox());
		
		CommonMethod.isElementDisplayed(lpo.AddToCart_Icon());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.AddToCart_Icon());
		
		CommonMethod.isElementDisplayed(lpo.AddToCart_Item());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.AddToCart_Item());
		
		CommonMethod.isElementDisplayed(lpo.NaveenAutomationLabs_Logo());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.NaveenAutomationLabs_Logo());
		
			//	All Tabs Element Visibility
		
		CommonMethod.isElementDisplayed(lpo.Desktops_Tab());
		System.out.println(CommonMethod.isElementDisplayed(lpo.Desktops_Tab()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Desktops_Tab());
		CommonMethod.moveToElement(lpo.Desktops_Tab(), driver);
	
		CommonMethod.isElementDisplayed(lpo.LaptopsAndNotebooks_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.LaptopsAndNotebooks_Tab());
		CommonMethod.moveToElement(lpo.LaptopsAndNotebooks_Tab(), driver);

		CommonMethod.isElementDisplayed(lpo.Components_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Components_Tab());
		CommonMethod.moveToElement(lpo.Components_Tab(), driver);

		CommonMethod.isElementDisplayed(lpo.Tablets_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Tablets_Tab());

		CommonMethod.isElementDisplayed(lpo.Software_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Software_Tab());

		CommonMethod.isElementDisplayed(lpo.PhonesAndPDAs_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.PhonesAndPDAs_Tab());

		CommonMethod.isElementDisplayed(lpo.Cameras_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.Cameras_Tab());

		CommonMethod.isElementDisplayed(lpo.MP3Players_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.MP3Players_Tab());
		CommonMethod.moveToElement(lpo.MP3Players_Tab(), driver);

	}
	
	@Test
	public void verifyTotalLinks() throws InterruptedException {
		
		driver.manage().window().maximize();

		LoginPageObject lpo = new LoginPageObject(driver);

		CommonMethod.clickOnElement(lpo.MyAccount());
		CommonMethod.HandleDropDown(lpo.MyAccount_Dropdown(), Constants.Choose_MyAccountDropdown);
		CommonMethod.HandleSoftAssertion(lpo.ActualText_ForAssertionLogin().getText(),Constants.ExpectedText_ForAssertionLogin);
		System.out.println(lpo.ActualText_ForAssertionLogin().getText());
		
		

		
		
	}

}
