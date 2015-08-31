package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest 
{

	
	
	
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//span[@id='link-signup']/a")).click();
		Assert.assertEquals(driver.getTitle(), "Create your Google Account");
		
		signup su = new signup(driver);
		
		
		su.enterMonth("May");
		su.enterGender("Male");
		
		driver.quit();
		
	}
	
	
}
