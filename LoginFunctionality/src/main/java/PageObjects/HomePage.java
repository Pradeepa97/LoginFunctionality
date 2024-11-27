package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import Utilities_PageObjects.Utility;

public class HomePage extends Utility {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(css=".header_label") WebElement HomePageHeader;
	@FindBy(css=".inventory_item_name")List<WebElement> productsName;
	@FindBy(xpath="//select[@class='product_sort_container']") WebElement dropdown;
	
	public String HomePageDisplay()
	{
		WaitUntilVisible(HomePageHeader);
		String homePageText = HomePageHeader.getText();
		return homePageText;
	}
	
	public  boolean VerifyProductName(String product)
	{
		for(int i =0;i<productsName.size();i++)
		{
			WaitUntilVisible(productsName.get(i));
			if(productsName.get(i).getText().contains(product))
			{
				return true;
			}
		}
		return false;
	}
	
	public void ClickOnDropdown()
	{
		dropdown.click();
	}
	
	public void selectOption(String option)
	{
		WaitUntilVisible(dropdown);
		Select options = new Select(dropdown);
		options.selectByVisibleText(option);
		
	}
	
}
