package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import objectRepository.LoginPageLocators;
import utils.CommonFunctionLibrary;

public class LoginPage extends BasePage {
	
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		System.out.println(driver);
		if(isElementPresent(LoginPageLocators.userTextfield, 5))
		{
			System.out.println("Userbox is present");
		}else
		{
			System.out.println("userbox is not present");
		}
		//WebElement elem = driver.findElement(LoginPageLocators.userTextfield);
		WebElement elem = findElement(LoginPageLocators.userTextfield, 5);
		
		if(elem == null)
			{
				throw new IllegalStateException();
			}
		}

	public void enterUsername(String username)
	{
		driver.findElement(LoginPageLocators.userTextfield).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(LoginPageLocators.userPassword).sendKeys(password);
		
	}
	
	public HomePage clickLogin()
	{
		try {
			driver.findElement(LoginPageLocators.loginBtn).click();
			return new HomePage(driver);
		} catch (Exception e) {
			return null;
		}
		
	}
	


}
