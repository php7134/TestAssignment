package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyMyAccount extends TestCore 
{
	@Test
	public void verifyMyAccountApp() throws IOException, InterruptedException 
	{
		app_logs.debug("Executing My Account app Launching Test");
		try 
		{
			Thread.sleep(2000);
			// Verify Account
			WebElement AccountApp = driver.findElement(By.xpath(object.getProperty("Account")));
			Assert.assertEquals(true, AccountApp.isDisplayed());
			System.out.println("Account is visible and clickable - Assert passed.");
			app_logs.debug("Account is visible and clickable.");
			AccountApp.click();
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Account is not visible or clickable.");
		}

		try 
		{
			
			Thread.sleep(2000);
			// Verify accountLogo
			WebElement accountlogo = driver.findElement(By.xpath(object.getProperty("accountLogo")));
			Assert.assertEquals(true, accountlogo.isDisplayed());
			System.out.println("account logo is visible and clickable.");
			app_logs.debug("account logo is visible and clickable.");
			
		}
		catch (Exception e) 
		{
			app_logs.debug("account is not visible or clickable.");
		}
		try 
		{
			// Verify CreateanAccount
			WebElement CreateanAccountOption = driver.findElement(By.xpath(object.getProperty("CreateanAccount")));
			Assert.assertEquals(true, CreateanAccountOption.isDisplayed());
			System.out.println("CreateanAccount is visible and clickable.");
			app_logs.debug("CreateanAccount is visible and clickable.");	
		}
		catch (Exception e)
		{
			app_logs.debug("CreateanAccount is not visible or clickable.");
		}
		try {
			// Verify GotoGoogleAccount
			WebElement GotoGoogleAccountOption = driver.findElement(By.xpath(object.getProperty("GotoGoogleAccount")));
			Assert.assertEquals(true, GotoGoogleAccountOption.isDisplayed());
			System.out.println("GotoGoogleAccount is visible and clickable.");
			app_logs.debug("GotoGoogleAccount is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("------TC_3.1 Executed--------");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("GotoGoogleAccount is not visible or clickable.");
		}

	}
}
