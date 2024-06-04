package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;

	Properties properties;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Batch Java Project\\NaveenAutomationLabs\\src\\main\\java\\Resources\\data");
		properties = new Properties();
		properties.load(fis);
		String browserName = properties.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {

			System.out.println(" Please choose correct browser ...");
		}

	}
	
	@BeforeTest
	public void ExtentReport() {
		ExtentManager.setup();
	}

	@AfterTest
	public void endReport() {
		ExtentManager.endReport();
	}

	// To take a screenshot and store in one folder

	public static String screenShot(WebDriver driver, String fileName) {

		String dateName = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + fileName + "_" + dateName + ".png";

		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}

	@BeforeMethod
	public void LaunchURL() throws IOException {

		initializeDriver();
		driver.get(properties.getProperty("url"));

	}

	@AfterMethod
	public void QuiteBrowser() {
		driver.quit();
	}

}
