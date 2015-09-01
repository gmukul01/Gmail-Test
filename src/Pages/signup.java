package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signup 
{

	public static WebDriver driver;
	
	By firstname = By.xpath("//input[@id='FirstName']");
	By lastname = By.xpath("//input[@id='LastName']");
	By username = By.xpath("//input[@id='GmailAddress']");
	By password = By.xpath("//input[@id='Passwd']");
	By confirmpassword = By.xpath("//input[@id='PasswdAgain']");
	By month = By.xpath("//span[@id='BirthMonth']/div");
	By day = By.xpath("//input[@id='BirthDay']");
	By year = By.xpath("//input[@id='BirthYear']");
	By gender = By.xpath("//div[@id='Gender']/div");
	By mobile = By.xpath("//input[@id='RecoveryPhoneNumber']");
	By currentemail = By.xpath("//input[@id='RecoveryEmailAddress']");
	By skipcaptcha = By.xpath("//input[@id='SkipCaptcha']");
	By terms = By.xpath("//input[@id='TermsOfService']");
	By submitbtn = By.xpath("//input[@id='submitbutton']");
	
	
	public signup(WebDriver driver1)
	{
		this.driver = driver1;	
	}
	
	
	public void enterFirstName(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void enterUserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cpass)
	{
		driver.findElement(confirmpassword).sendKeys(cpass);
	}
	
	public void enterMonth(String mon)
	{
		try 
		{
			driver.findElement(month).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@id='BirthMonth']//div[contains(text(),'"+mon+"')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	public void enterDay(String date)
	{
		driver.findElement(day).sendKeys(date);
	}
	
	public void enterYear(String yr)
	{
		driver.findElement(year).sendKeys(yr);
	}
	
	public void enterGender(String gen)
	{
		try 
		{
			driver.findElement(gender).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='Gender']//div[contains(text(),'"+gen+"')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	public void enterPhoneNumber(String numb)
	{
		driver.findElement(mobile).sendKeys(numb);
	}
	
	public void enterCurrentEmail(String cemail)
	{
		driver.findElement(currentemail).sendKeys(cemail);
	}
	
	public void clickOnSkipCaptcha()
	{
		driver.findElement(skipcaptcha).click();
	}
	
	public void clickOnTerms()
	{
		driver.findElement(terms).click();
	}
	
	public void clickOnSubmit()
	{
		driver.findElement(submitbtn).click();
		
	}
	
	
}
