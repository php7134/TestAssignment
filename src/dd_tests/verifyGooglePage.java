package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import dd_core.TestCore;

public class verifyGooglePage extends TestCore 
{
	@Test(priority = 1)
	public void verifyGooglePageLaunching() throws IOException
	{
		app_logs.debug("Executing Google Page Launching Test");
		try
		{
			// Google Page Launching
			String Expectedsite=(config.getProperty("testsite"));
			Assert.assertEquals(Expectedsite,driver.getCurrentUrl());
			
			{
				System.out.println("Navigated to correct Web page – Assert passed");
				app_logs.debug("Navigated to correct Web page.");
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Didn't navigate to correct Web page.");
			app_logs.debug("Didn't navigate to correct webpage");
		}
		try 
		{
			// Verify SignIn button
			//Use assertations
			WebDriverWait wait = new WebDriverWait(driver, 10L);
			WebElement signIn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath(config.getProperty("Button2"))));
			Assert.assertEquals(true, signIn.isDisplayed());
			System.out.println("Sign In button is displayed – Assert passed");
			app_logs.debug("SignIn button is visible and clickable.");
		} 
		catch (Exception e)
		{
			app_logs.debug("SignIn button is not visible or clickable.");
		}
		
		try 
		{
			// Verify Searchbar
			//WebDriverWait wait = new WebDriverWait(driver, 10L);
			WebElement Searchbar =driver.findElement(By.xpath(object.getProperty("SearchBar1")));
			Assert.assertEquals(true, Searchbar.isDisplayed());
			System.out.println("Search bar is displayed – Assert passed");
			app_logs.debug("Search bar is visible and clickable.");
		} 
		catch (Exception e)
		{
			app_logs.debug("Search bar is not visible or clickable.");
		}
		try 
		{
			// Verify Google Search button
			WebElement SearchButton = driver.findElement(By.xpath(object.getProperty("GoogleSearchButton")));
			Assert.assertEquals(true, SearchButton.isDisplayed());
			System.out.println("GoogleSearchButton is displayed – Assert passed");
			app_logs.debug("GoogleSearchButton is visible and clickable.");
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleSeachButton is not visible or clickable.");
		}
		try 
		{
		
			// Verify Feeling Lucky button
			WebElement FeelingLucky =driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
			Assert.assertEquals(true, FeelingLucky.isDisplayed());
            System.out.println("FeelingLuckyButton is displayed – Assert passed");
			app_logs.debug("FeelingLuckyButton is visible and clickable.");
			System.out.println("------TC_01 Executed--------");
		} 
		catch (Exception e) 
		{
			app_logs.debug("FeelingLuckyButton is not visible or clickable.");
		}
	}
}
