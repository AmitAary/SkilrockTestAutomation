package utils;

import org.openqa.selenium.WebDriver;

import stepDefinitions.AttachHooks;

public class CommonFunctionLibrary {
	
	WebDriver driver ;
	
	public CommonFunctionLibrary()
	{
		this.driver = AttachHooks.driver;
	}
	
	
	public void switchFrame(String frameId)

	{
		driver.switchTo().frame(frameId);
		System.out.println(driver.getWindowHandle());
	}

}
