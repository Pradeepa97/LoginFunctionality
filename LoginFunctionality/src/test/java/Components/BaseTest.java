package Components;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import PageObjects.LoginPage;

public class BaseTest {
	
	
	WebDriver driver;
	public WebDriver  initializeDriver() throws IOException
	{
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\LoginFunctionality\\src\\main\\java\\Resources\\GlobalProperty.properties");
		p.load(f);
		String browser = p.getProperty("browser");
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public LoginPage UserEntersApplication() throws IOException
	{
		driver = initializeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.gotoApplication();
		return lp;
	}
	
	public void UserClosesApplciation()
	{
		driver.quit();
	}

}
