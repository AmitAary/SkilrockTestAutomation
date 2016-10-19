package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objectRepository.HomePageLocator;
import utils.CommonFunctionLibrary;

public class HomePage extends BasePage {
	
	CommonFunctionLibrary functionLibrary;

	public HomePage(WebDriver driver) {
		super(driver);
		functionLibrary = new CommonFunctionLibrary();
		functionLibrary.switchFrame("topFrame");
		if(driver.findElement(HomePageLocator.currentLoggedUser).getText().equalsIgnoreCase("bomaster"))
		{
			System.out.println("Home page is opened");
		}else
		{
			throw new IllegalStateException();
		}
		
		
	}

	
}
