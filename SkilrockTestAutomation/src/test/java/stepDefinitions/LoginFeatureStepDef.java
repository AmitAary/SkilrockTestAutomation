package stepDefinitions;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.HookBody;
import pages.HomePage;
import pages.LoginPage;

public class LoginFeatureStepDef {
	
	
	
	LoginPage loginPage;
	WebDriver Driver;
	HomePage homePage;
	
	
	@Given("^Login page is opened$")
	public void login_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //validate if login page is opened
		try {
			loginPage = new LoginPage(AttachHooks.driver);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^valid credentials are entered$")
	public void valid_credentials_are_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//enter valid credentials
		loginPage.enterUsername("bomaster");
		loginPage.enterPassword("12345678");
	    }
	@Then("^HomePage should be visible$")
	public void homepage_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage = loginPage.clickLogin();
		if(homePage == null)
		{
			Assert.fail();
		}
	}


	
	@Given("^Login page is appeared$")
	public void login_page_is_appeared() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage = loginPage.clickLogin();
	}

	
	
	@When("^invalid username (\\w+) is entered$")
	public void invalid_vipul_is_entered(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUsername(username);
	    
	}
	
	@When("^invalid password (\\w+) is entered$")
	public void invalid_password_is_entered(String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterPassword(pwd);
	    
	}
	
	
	@Then("^HomePage should not be visible$")
	public void homepage_should_not_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage = loginPage.clickLogin();
		if(homePage == null)
		{
			System.out.println("HomePage is not Visible Because invalid credintials are entered");
		}
	}

}
