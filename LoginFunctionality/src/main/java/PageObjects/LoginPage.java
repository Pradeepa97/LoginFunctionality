package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities_PageObjects.Utility;

public class LoginPage extends Utility {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="user-name") WebElement username;
@FindBy(id="password") WebElement password;
@FindBy(css="#login-button") WebElement Loginbtn;
@FindBy(xpath="//div/h3") WebElement errorMsg;

public void enterUsername(String userid)
{
	username.sendKeys(userid);
}
public void enterPassword(String pass)
{
	password.sendKeys(pass);
}

public HomePage ClickSubmit()
{
	Loginbtn.click();
	HomePage home = new HomePage(driver);
	return home;
}
public String validateInvalidLoginErrorMsg()
{
	String error = errorMsg.getText();
	return error;
}
public void gotoApplication()
{
	
	driver.get("https://www.saucedemo.com/");
}
}
