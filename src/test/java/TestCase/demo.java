package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement Phone_Icon = driver.findElement(By.xpath("//i[@class='fa fa-phone']"));
		System.out.println(Phone_Icon.isDisplayed());
		
		driver.close();
		
	}
	
	

}
