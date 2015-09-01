package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage 
{
	public static WebDriver driver;
	
	By createaccount = By.xpath("//span[@id='link-signup']/a");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnCreatAccount()
	{
		driver.findElement(createaccount).click();
		Assert.assertEquals(driver.getTitle(), "Create your Google Account");
	}
	
}
