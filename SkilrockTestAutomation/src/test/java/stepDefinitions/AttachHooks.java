package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class AttachHooks {
	
	public static WebDriver driver;
	BasePage basePage;
	
	
	@Before
	public void setUp()
	{
		System.out.println("Our browser will be invoked here");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vipuljain\\Desktop\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://192.168.124.201:8180/LMSLagos");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}
	
	@After
	public void tearDown()
	{
		
		driver.quit();
	}

}
