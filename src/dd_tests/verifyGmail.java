package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyGmail extends TestCore 
{
	@Test
	public void verifyGmailApp() throws IOException, InterruptedException
	{
		try 
		{
			// Verify Grid icon
		WebElement Grid= driver.findElement(By.xpath(object.getProperty("Gridicon")));
		Assert.assertEquals(true, Grid.isDisplayed());
		System.out.println("Grid Icon is visible and clickable.");
    	app_logs.debug("Grid Icon is visible and clickable.");
		Grid.click();
		System.out.println("Clicked on grid.");
		} 
		catch (Exception e)
		{
			app_logs.debug("Grid Icon is not visible or clickable.");
		}
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		try 
		{
			// Verify Gmail
			WebElement GmailApp = driver.findElement(By.xpath(object.getProperty("Gmail")));
			Assert.assertEquals(true, GmailApp.isDisplayed());
			System.out.println("Gmail is visible and clickable.");
			app_logs.debug("Gmail is visible and clickable.");
			GmailApp.click();
			
		}
		catch (Exception e)
		{
			System.out.println("Gmail is visible and clickable.");
		}

		try
		{
			Thread.sleep(1500);
			// Verify GmailLogo
			WebElement GmailLogo = driver.findElement(By.xpath(object.getProperty("GmailLogo")));
			Assert.assertEquals(true, GmailLogo.isDisplayed());
			System.out.println("GmailLogo is visible and clickable.");
			app_logs.debug("GmailLogo is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("GmailLogo is not visible or clickable.");
		}

		try
		{
			// Verify SignIn
			Thread.sleep(1500);
			WebElement SignIn = driver.findElement(By.xpath(object.getProperty("SignIn")));
			Assert.assertEquals(true, SignIn.isDisplayed());
			System.out.println("SignIn is visible and clickable.");
			app_logs.debug("SignIn is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("SignIn is not visible or clickable.");
		}
		try 
		{
			// Verify CreateAccount
			Thread.sleep(1500);
			WebElement CreateAccount = driver.findElement(By.xpath(object.getProperty("CreateAccount")));
			Assert.assertEquals(true, CreateAccount.isDisplayed());
			System.out.println("CreateAccount is visible and clickable.");
			app_logs.debug("CreateAccount is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.7 Executed--------");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("CreateAccount is not visible or clickable.");
		}
	}
}
