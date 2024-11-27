package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	@Before
	public void BeforeScenario()
	{
		System.out.println("Before Scenario");
		
		
	}
	
	@After
	public void AfterScenario()
	{
		System.out.println("After Scenario");
	}
	

}
