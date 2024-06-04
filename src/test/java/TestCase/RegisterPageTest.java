package TestCase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.RegisterPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class RegisterPageTest extends BaseClass {

	@Test(priority = 0)
	public void verifyElementVisibilityForRegisterPage() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		Thread.sleep(5000);
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		System.out.println(rpo.ActualRegistext().getText());
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.isElementDisplayed(rpo.NaveenAutomationLabs_Logo());
		System.out.println(CommonMethod.isElementDisplayed(rpo.NaveenAutomationLabs_Logo()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.NaveenAutomationLabs_Logo());

		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.isElementDisplayed(rpo.PersonalDetails());
		System.out.println(CommonMethod.isElementDisplayed(rpo.PersonalDetails()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.PersonalDetails());

		CommonMethod.isElementDisplayed(rpo.FirstName_LabelName());
		System.out.println(CommonMethod.isElementDisplayed(rpo.FirstName_LabelName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.FirstName_LabelName());

		CommonMethod.isElementDisplayed(rpo.LastName_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.LastName_LabelName());

		CommonMethod.isElementDisplayed(rpo.Email_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Email_LabelName());

		CommonMethod.isElementDisplayed(rpo.Telephone_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Telephone_LabelName());

		CommonMethod.isElementDisplayed(rpo.YourPassword_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.YourPassword_Text()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.YourPassword_Text());

		CommonMethod.isElementDisplayed(rpo.Password_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Password_LabelName());

		CommonMethod.isElementDisplayed(rpo.ConfirmPassword_LabelName());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.ConfirmPassword_LabelName());

		CommonMethod.isElementDisplayed(rpo.Newsletter_HeadingText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Newsletter_HeadingText());

		CommonMethod.isElementDisplayed(rpo.Subscribe_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Subscribe_Text());

		System.out.println(" Count of Redio Button is ===> " + rpo.RedioButtons().size());

		CommonMethod.isElementDisplayed(rpo.BottomText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.BottomText());

		CommonMethod.isElementDisplayed(rpo.Checkbox());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Checkbox());

		CommonMethod.isElementDisplayed(rpo.ContinueButton());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.ContinueButton());

	}

	@Test(priority = 1)
	public void verifyAllTabsVisibility() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.isElementDisplayed(rpo.Desktops_Tab());
		// System.out.println(CommonMethod.isElementDisplayed(rpo.Desktops_Tab()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Desktops_Tab());
		CommonMethod.moveToElement(rpo.Desktops_Tab(), driver);

		CommonMethod.isElementDisplayed(rpo.LaptopsAndNotebooks_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.LaptopsAndNotebooks_Tab());
		CommonMethod.moveToElement(rpo.LaptopsAndNotebooks_Tab(), driver);

		CommonMethod.isElementDisplayed(rpo.Components_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Components_Tab());
		CommonMethod.moveToElement(rpo.Components_Tab(), driver);

		CommonMethod.isElementDisplayed(rpo.Tablets_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Tablets_Tab());

		CommonMethod.isElementDisplayed(rpo.Software_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Software_Tab());

		CommonMethod.isElementDisplayed(rpo.PhonesAndPDAs_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.PhonesAndPDAs_Tab());

		CommonMethod.isElementDisplayed(rpo.Cameras_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Cameras_Tab());

		CommonMethod.isElementDisplayed(rpo.MP3Players_Tab());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.MP3Players_Tab());
		CommonMethod.moveToElement(rpo.MP3Players_Tab(), driver);

	}

	@Test(priority = 2)
	public void verifyAllBottomLinks() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.scrollDownTillElementVisible(rpo.Information_Text(), driver);
		CommonMethod.isElementDisplayed(rpo.Information_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Information_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.AboutUs_Link(), driver);
		CommonMethod.clickOnElement(rpo.AboutUs_Link());
		// Thread.sleep(5000);
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_AboutUs_Link().getText(),
				Constants.ExpectedText_ForAssertion_AboutUs_Link);
		System.out.println(rpo.ActualText_ForAssertion_AboutUs_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		// CommonMethod.navigateToBack(rpo.AboutUs_Link(), driver);

		CommonMethod.scrollDownTillElementVisible(rpo.DeliveryInformation_Link(), driver);
		CommonMethod.clickOnElement(rpo.DeliveryInformation_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_DeliveryInformation_Link().getText(),
				Constants.ExpectedText_ForAssertion_DeliveryInformation_Link);
		System.out.println(rpo.ActualText_ForAssertion_DeliveryInformation_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.PrivacyPolicy_Link(), driver);
		CommonMethod.clickOnElement(rpo.PrivacyPolicy_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_PrivacyPolicy_Link().getText(),
				Constants.ExpectedText_ForAssertion_PrivacyPolicy_Link);
		System.out.println(rpo.ActualText_ForAssertion_PrivacyPolicy_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.TermsAndConditions_Link(), driver);
		CommonMethod.clickOnElement(rpo.TermsAndConditions_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_TermsAndConditions_Link().getText(),
				Constants.ExpectedText_ForAssertion_TermsAndConditions_Link);
		System.out.println(rpo.ActualText_ForAssertion_TermsAndConditions_Link().getText());
		CommonMethod.navigateToBack(driver);

		CommonMethod.scrollDownTillElementVisible(rpo.CustomerService_Text(), driver);
		CommonMethod.isElementDisplayed(rpo.CustomerService_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.CustomerService_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.ContactUs_Link(), driver);
		CommonMethod.clickOnElement(rpo.ContactUs_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_ContactUs_Link().getText(),
				Constants.ExpectedText_ForAssertion_ContactUs_Link);
		System.out.println(rpo.ActualText_ForAssertion_ContactUs_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.Returns_Link(), driver);
		CommonMethod.clickOnElement(rpo.Returns_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_Returns_Link().getText(),
				Constants.ExpectedText_ForAssertion_Returns_Link);
		System.out.println(rpo.ActualText_ForAssertion_Returns_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.SiteMap_Link(), driver);
		CommonMethod.clickOnElement(rpo.SiteMap_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_SiteMap_Link().getText(),
				Constants.ExpectedText_ForAssertion_SiteMap_Link);
		System.out.println(rpo.ActualText_ForAssertion_SiteMap_Link().getText());
		CommonMethod.navigateToBack(driver);

		CommonMethod.scrollDownTillElementVisible(rpo.Extras_Text(), driver);
		CommonMethod.isElementDisplayed(rpo.Extras_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Extras_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.Brands_Link(), driver);
		CommonMethod.clickOnElement(rpo.Brands_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_Brands_Link().getText(),
				Constants.ExpectedText_ForAssertion_Brands_Link);
		System.out.println(rpo.ActualText_ForAssertion_Brands_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.GiftCertificates_Link(), driver);
		CommonMethod.clickOnElement(rpo.GiftCertificates_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_GiftCertificates_Link().getText(),
				Constants.ExpectedText_ForAssertion_GiftCertificates_Link);
		System.out.println(rpo.ActualText_ForAssertion_GiftCertificates_Link().getText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.Affiliate_Link(), driver);
		CommonMethod.clickOnElement(rpo.Affiliate_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_Affiliate_Link().getText(),
				Constants.ExpectedText_ForAssertion_Affiliate_Link);
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.Specials_Link(), driver);
		CommonMethod.clickOnElement(rpo.Specials_Link());
		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForAssertion_Specials_Link().getText(),
				Constants.ExpectedText_ForAssertion_Specials_Link);
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.MyAccount_Text(), driver);
		CommonMethod.isElementDisplayed(rpo.MyAccount_Text());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.MyAccount_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.MyAccount_SubText(), driver);
		CommonMethod.clickOnElement(rpo.MyAccount_SubText());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.OrderHistory_Link(), driver);
		CommonMethod.clickOnElement(rpo.OrderHistory_Link());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.WishList_Link(), driver);
		CommonMethod.clickOnElement(rpo.WishList_Link());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

		CommonMethod.scrollDownTillElementVisible(rpo.Newsletter_Link(), driver);
		CommonMethod.clickOnElement(rpo.Newsletter_Link());
		CommonMethod.navigateToBack(driver);
		// Thread.sleep(5000);
		CommonMethod.isElementDisplayed(rpo.Para_Text());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Para_Text()));
		System.out.println(rpo.Para_Text().getText());
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Para_Text());

	}

	@Test(priority = 3)
	public void verifyErrorTextMessage() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.scrollDownTillElementVisible(rpo.Continue_Button(), driver);
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Continue_Button());
		CommonMethod.clickOnElement(rpo.Continue_Button());

		CommonMethod.isElementDisplayed(rpo.Warning_ErrorIcon());
		System.out.println(CommonMethod.isElementDisplayed(rpo.Warning_ErrorIcon()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(rpo.Warning_ErrorIcon());

		CommonMethod.HandleSoftAssertion(rpo.Warning_ErrorMessage().getText(), Constants.Expected_ErrorMessageText);
		System.out.println(rpo.Warning_ErrorMessage().getText());

		CommonMethod.HandleSoftAssertion(rpo.FirstName_ErrorMessage().getText(),
				Constants.FirstName_Expected_ErrorMessage);
		System.out.println(rpo.FirstName_ErrorMessage().getText());

		CommonMethod.HandleSoftAssertion(rpo.LastName_ErrorMessage().getText(),
				Constants.LastName_Expected_ErrorMessage);
		System.out.println(rpo.LastName_ErrorMessage().getText());

		CommonMethod.HandleSoftAssertion(rpo.Email_ErrorMessage().getText(), Constants.Email_Expected_ErrorMessage);
		System.out.println(rpo.Email_ErrorMessage().getText());

		CommonMethod.HandleSoftAssertion(rpo.Telophone_ErrorMessage().getText(),
				Constants.Telephone_Expected_ErrorMessage);
		System.out.println(rpo.Telophone_ErrorMessage().getText());

		CommonMethod.HandleSoftAssertion(rpo.Password_ErrorMessage().getText(),
				Constants.Password_Expected_ErrorMessage);
		System.out.println(rpo.Password_ErrorMessage().getText());

	}

	@Test(priority = 4)
	public void verifyConfirmPasswordErrorText() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.setText(rpo.FirstName_TextField(), CommonMethod.generateRandomString(5));
		Thread.sleep(2000);
		CommonMethod.setText(rpo.LastName_TextField(), CommonMethod.generateRandomString(5));
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.Email_TextField(), driver);
		CommonMethod.setText(rpo.Email_TextField(), CommonMethod.generateRandomEmail());
		Thread.sleep(2000);

		/*
		 * CommonMethod.scrollDownTillElementVisible(rpo.Telephone_TextField(), driver);
		 * CommonMethod.setTextForNumber(rpo.Telephone_TextField(),
		 * CommonMethod.generateRandomDigits(10)); Thread.sleep(2000);
		 */

		CommonMethod.scrollDownTillElementVisible(rpo.Telephone_TextField(), driver);
		CommonMethod.setText(rpo.Telephone_TextField(), Constants.Telephone_TextField);
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.Password_TextField(), driver);
		CommonMethod.setText(rpo.Password_TextField(), CommonMethod.generateRandomString(10));
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.ConfirmPassword_TextField(), driver);
		CommonMethod.setText(rpo.ConfirmPassword_TextField(), CommonMethod.generateRandomString(10));
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.yes_RedioButton(), driver);
		CommonMethod.clickOnElement(rpo.yes_RedioButton());
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.PrivacyPolicy_CheckBox(), driver);
		CommonMethod.clickOnElement(rpo.PrivacyPolicy_CheckBox());
		Thread.sleep(2000);

		CommonMethod.scrollDownTillElementVisible(rpo.Continue_ButtonForRegister(), driver);
		CommonMethod.clickOnElement(rpo.Continue_ButtonForRegister());
		Thread.sleep(5000);
		CommonMethod.HandleSoftAssertion(rpo.PasswordConfirm_ErrorMessage().getText(),
				Constants.PasswordConfirm_ErrorMessage);
		System.out.println(rpo.PasswordConfirm_ErrorMessage().getText());

	}

//	public static String emailID = CommonMethod.generateRandomEmail();

	@Test(priority = 5)
	public void verifyRegisterFunctionality() throws InterruptedException {

		driver.manage().window().maximize();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		CommonMethod.setText(rpo.FirstName_TextField(), CommonMethod.generateRandomString(5));
		CommonMethod.setText(rpo.LastName_TextField(), CommonMethod.generateRandomString(5));

		CommonMethod.scrollDownTillElementVisible(rpo.Email_TextField(), driver);
		CommonMethod.setText(rpo.Email_TextField(), CommonMethod.generateRandomEmail());

		/*
		 * CommonMethod.scrollDownTillElementVisible(rpo.Telephone_TextField(), driver);
		 * CommonMethod.setTextForNumber(rpo.Telephone_TextField(),
		 * CommonMethod.generateRandomDigits(10)); Thread.sleep(2000);
		 */

		CommonMethod.scrollDownTillElementVisible(rpo.Telephone_TextField(), driver);
		CommonMethod.setText(rpo.Telephone_TextField(), Constants.Telephone_TextField);

		CommonMethod.scrollDownTillElementVisible(rpo.Password_TextField(), driver);
		CommonMethod.setText(rpo.Password_TextField(), Constants.Password_TextField);

		CommonMethod.scrollDownTillElementVisible(rpo.ConfirmPassword_TextField(), driver);
		CommonMethod.setText(rpo.ConfirmPassword_TextField(), Constants.ConfirmPassword_TextField);

		CommonMethod.scrollDownTillElementVisible(rpo.yes_RedioButton(), driver);
		CommonMethod.clickOnElement(rpo.yes_RedioButton());

		CommonMethod.scrollDownTillElementVisible(rpo.PrivacyPolicy_CheckBox(), driver);
		CommonMethod.clickOnElement(rpo.PrivacyPolicy_CheckBox());

		CommonMethod.scrollDownTillElementVisible(rpo.Continue_ButtonForRegister(), driver);
		CommonMethod.clickOnElement(rpo.Continue_ButtonForRegister());

		CommonMethod.HandleSoftAssertion(rpo.ActualText_ForRegisterPageAssertion().getText(),
				Constants.ExpectedText_ForRegisterPageAssertion);
		System.out.println(rpo.ActualText_ForRegisterPageAssertion().getText());

		CommonMethod.clickOnElement(rpo.ContinueButton_AfterRegistration());
		CommonMethod.HandleSoftAssertion(rpo.MyAccount_ForAssertion().getText(),
				Constants.ExpectedText_ForAssertionMyaccount);
		System.out.println(rpo.MyAccount_ForAssertion().getText());

	}

	@Test
	public void verifyCountOfHyperlink() throws InterruptedException {

		driver.manage().window().maximize();
		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());

		System.out.println(" Total Links on the Web Page === > " + rpo.HyperLinks().size());

		// To print HyperLink Text

		for (WebElement HyperLink_Text : rpo.HyperLinks()) {

			System.out.println(HyperLink_Text.getText());
		}

	}
	
	@Test
	public void verifyBrokenLinks() throws InterruptedException, MalformedURLException, IOException {
		
		driver.manage().window().maximize();
		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());
		
		System.out.println(" Total Links on the Web Page === > " + rpo.HyperLinks().size());
		
		// To Find Brokan Links
		
		for(WebElement AllLinks : rpo.HyperLinks()) {
			
			String BrokenLinks = AllLinks.getAttribute("href"); 
			
			   HttpURLConnection conn = (HttpURLConnection) new URL(BrokenLinks).openConnection();

			   conn.setRequestMethod("HEAD"); // This will give the status code and not the response body
			   conn.connect(); // connect

			   int respCode = conn.getResponseCode();

			   System.out.println(respCode);
			   
			   SoftAssert softAssert = new SoftAssert();
			   softAssert.assertTrue(respCode < 404, "The link with Text" + AllLinks.getText() + " is broken with code" + respCode);
			   softAssert.assertAll();
		}
		
	}
	
	@Test
	public void verifyAllPlaceHolderText() throws InterruptedException {
		
		driver.manage().window().maximize();
		RegisterPageObject rpo = new RegisterPageObject(driver);

		CommonMethod.clickOnElement(rpo.MyAccount());
		CommonMethod.HandleDropDown(rpo.RegisterDropdown(), Constants.Choose_RegisterDropdown);
		CommonMethod.HandleSoftAssertion(rpo.ActualRegistext().getText(), Constants.Expected_RegisterText);
		// System.out.println(rpo.ActualRegistext().getText());
		
		String Password_PlaceHolder = rpo.Password_TextField().getAttribute("value placeholder");
		
		
		
	}
	

}
