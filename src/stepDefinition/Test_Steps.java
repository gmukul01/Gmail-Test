package stepDifinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import Pages.signup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
		}
	
	@When("^User Navigate to SignUp Page$")
	public void user_Navigate_to_SignUp_Page1() throws Throwable {
		HomePage homepg = new HomePage(driver);
		homepg.clickOnCreatAccount();
		}
	
	@And("^User enters correct details$")
	public void user_enters_UserName_and_Password() throws Throwable {
		signup su = new signup(driver);
		su.enterFirstName("Mukul");
		su.enterLastName("Bansal");
		su.enterUserName("mukul.bansal_1_cognizant@gmail.com");
		su.enterPassword("mukul_123");
		su.enterConfirmPassword("mukul_123");
		su.enterMonth("August");
		su.enterDay("10");
		su.enterYear("1991");
		su.enterGender("Male");
		su.enterPhoneNumber("7744012740");
		su.enterCurrentEmail("mukulbansal01@gmail.com");
		su.clickOnSkipCaptcha();
		su.clickOnTerms();
		
		}
	
	@Then("^Message displayed Welcome$")
	public void user_Navigate_to_SignUp_Page() throws Throwable {
		signup su = new signup(driver);
		su.clickOnSubmit();
		}
	

}
