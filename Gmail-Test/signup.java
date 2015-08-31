package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signup 
{

	static WebDriver driver;
	
	
	
	
	WebElement firstname;
	WebElement lastname;
	WebElement username;
	WebElement password ;
	WebElement confirmpassword;
	WebElement month;
	//WebElement month = driver.findElement(By.xpath(""));	
	WebElement day;
	WebElement year;
	WebElement gender;
	WebElement mobile ;
	WebElement currentemail ;
	
	
	
	
	
	public signup(WebDriver driver1)
	{
		this.driver = driver1;
		firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		username = driver.findElement(By.xpath("//input[@id='GmailAddress']"));
		password = driver.findElement(By.xpath("//input[@id='Passwd']"));
		confirmpassword = driver.findElement(By.xpath("//input[@id='GmailAddress']"));
		month = driver.findElement(By.xpath("//span[@id='BirthMonth']/div"));
		day = driver.findElement(By.xpath("//input[@id='BirthDay']"));
		year = driver.findElement(By.xpath("//input[@id='BirthYear']"));
		gender = driver.findElement(By.xpath("//div[@id='Gender']/div"));
		mobile = driver.findElement(By.xpath("//input[@id='RecoveryPhoneNumber']"));
		currentemail = driver.findElement(By.xpath("//input[@id='RecoveryEmailAddress']"));
		
	}
	
	
	
	public void enterFirstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ennterConfirmPassword(String cpass)
	{
		confirmpassword.sendKeys(cpass);
	}
	
	public void enterMonth(String mon)
	{
		try 
		{
			month.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[@id='BirthMonth']//div[contains(text(),'"+mon+"')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	public void enterDay(String date)
	{
		day.sendKeys(date);
	}
	
	public void enterYear(String yr)
	{
		year.sendKeys(yr);
	}
	
	public void enterGender(String gen)
	{
		try 
		{
			gender.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='Gender']//div[contains(text(),'"+gen+"')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	public void enterPhoneNumber(String numb)
	{
		mobile.sendKeys(numb);
	}
	
	public void enterCurrentEmail(String cemail)
	{
		currentemail.sendKeys(cemail);
	}
	
	
}
