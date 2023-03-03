package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef 
{
	
	WebDriver driver;
	LoginPage loginPg;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() 
	{
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 
		 loginPg = new LoginPage(driver);
		
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) 
	{
	    driver.get(url);
		
	}

	@When("User enter Email as {string} and enter Password {string}")
	public void user_enter_email_as_and_enter_password(String emailadd, String password) 
	{
	    
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password);
		
	}

	@When("Click on Login button")
	public void click_on_login_button() 
	{
		loginPg.clickOnLoginBtn();
		
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) 
	{
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail
		}
	
	}

	@When("User Clicks on Logout button")
	public void user_clicks_on_logout_button() 
	{
	    
		loginPg.clickOnLogout();
	}

	@Then("Close the browser")
	public void close_the_browser() 
	{
	    
		driver.close();
		driver.quit();
		
	}
	
	

}
