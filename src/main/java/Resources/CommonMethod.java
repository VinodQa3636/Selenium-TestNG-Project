package Resources;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethod {

	public static void HandleSoftAssertion(String Actual, String Expected) {

		SoftAssert softAssert = new SoftAssert();

		String Actual_PageText = Actual;
		String Expected_PageText = Expected;

		softAssert.assertEquals(Actual_PageText, Expected_PageText);
		softAssert.assertAll();
	}

	public static void HandleDropDown(List<WebElement> list, String text) throws InterruptedException {

		List<WebElement> All_Material_List = list;
		for (WebElement Material : All_Material_List) {

			if (Material.getText().equalsIgnoreCase(text)) {
				Material.click();
				Thread.sleep(2000);
				break;
			}
		}

	}

	public static void HandleAssertionForVisibiltyOfElement(WebElement element) {

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertTrue(true);
		softAssert.assertAll();

	}

	public static void waitForElementToVisible(By Xpath, WebDriver driver, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.visibilityOfElementLocated(Xpath));

	}

	public static void setText(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void setTextForNumber(WebElement element, int number) {

		element.sendKeys();
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static boolean isElementDisplayed(WebElement element) {

		return element.isDisplayed();
	}

	public static String generateRandomEmail() {
		return generateRandomString(5) + "@test.com";
	}

	public static void moveToElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public static void navigateToBack(WebDriver driver) {

		// Actions actions = new Actions(driver);
		driver.navigate().back();

	}

	public static void scrollDownTillElementVisible(WebElement element, WebDriver driver) {

		// WebElement elementPaymentCalculator =
		// driver.findElement(By.xpath("//a[text()='Payment Calculator']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void HandledToolTip(WebElement element, String title) {

		String ActualToolTip = element.getAttribute("title");

		String ExpectedToolTip = "";

		if (ActualToolTip.equalsIgnoreCase(ExpectedToolTip)) {

			System.out.println(" Tool Tip is Matched ...");
		} else {

			System.out.println(" Tool Tip is not matched ...");
		}
	}

	public static String generateRandomString(int length) {
		RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
		return generator.generate(length);
	}

	public static String generateIpAddress() {
		Random random = new Random();
		return String.valueOf(random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256) + "."
				+ random.nextInt(256));
	}

	public static long generateRandomDigits(long n) {
		int m = (int) Math.pow(10, n - Double.valueOf(1));
		return m + (long) new Random().nextInt(9 * m);
	}

	public static String generateWebURL() {
		return "http://" + generateRandomString(7) + generateRandomDigits(4) + ".com";
	}

}
