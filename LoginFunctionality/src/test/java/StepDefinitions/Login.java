package StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Components.BaseTest;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseTest{
	
	public LoginPage login;
	public HomePage home;
	@Given("^the user enters the URL of the application$")
	public void UserEntertheURL() throws IOException
	{
		login = UserEntersApplication();
	}
	
	@And("^gives the (.+) and (.+)$")
	public void UserEntersUsernamePassword(String username,String password)
	{
		
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@When("^the user click on the submit button$")
	public void UserClicksOnSubmit()
	{
		home = login.ClickSubmit();
	}
	
	@Then("^the user should see the HomePage of the application.$")
	public void UserLandsOnHomePage()
	{
		
		Assert.assertEquals(home.HomePageDisplay(),"Swag Labs");
	}
	
	
	@Then ("^the user should be shown a error message.$")
	public void UserVerifiesErrorMsg()
	{
		Assert.assertEquals(login.validateInvalidLoginErrorMsg(),"Epic sadface: Username and password do not match any user in this service");
	}
	
	@And("^the user close the application.$")
	public void UserClosesApplication()
	{
		UserClosesApplciation();
	}
	
	@And ("^user Verifies  (.+) in the HomePage$")
	public void VerifyProduct(String product)
	{
	
		Assert.assertTrue(home.VerifyProductName(product));
	}
	
	@And("^user clicks on Dropdown$")
	public void ClickDropdown()
	{
		home.ClickOnDropdown();
	}
	
	@And("^user selectes the option (.+)$")
	public void UserSelectsOption(String option)
	{
		home.selectOption(option);
	}

}
