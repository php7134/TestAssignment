package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_core.TestCore;
import dd_util.testUtil;

public class LoginTest extends TestCore 
{
	
	@BeforeTest
	public void isSkip() 
	{
		if (!testUtil.isExecutable("LoginTest"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
	}
	
	@Test(dataProvider = "getData")
	public void doLogin(String email, String password) throws IOException
	{
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.xpath(object.getProperty("SignInButton"))).click();
		
		app_logs.debug("Executing Gmail Logged In Page Launching Test");
		
		try 
		{
			Thread.sleep(3000);
			app_logs.debug("Executing Login Test");
			System.out.println("Executing Login Test");
			app_logs.debug("Entering username");
			System.out.println("Entering username");
			driver.findElement(By.xpath(object.getProperty("Username"))).sendKeys(email);
			driver.findElement(By.xpath(object.getProperty("NextButton"))).click();
			
			Thread.sleep(3000);
			
			app_logs.debug("Entering password");
			System.out.println("Entering password");
			driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(password);
			driver.findElement(By.xpath(object.getProperty("NextButton"))).click();
			
			app_logs.debug("Login Test Executed.");
			Thread.sleep(3000);
			} 
		catch (Throwable e)
		{
			
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("LoginTest");
	}
}
