package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyGSearch extends TestCore 
{
	@Test
	public void verifyGSearchApp() throws IOException, InterruptedException
	{
		app_logs.debug("Executing Search App Launching Test");
		
		try 
		{
			// Verify Grid icon
			WebElement Grid=driver.findElement(By.xpath(object.getProperty("Gridicon")));
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
        Thread.sleep(2500);
		try 
		{   
			Thread.sleep(2000);
			// Verify Search
			Thread.sleep(2000);
			WebElement SearchApp= driver.findElement(By.xpath(object.getProperty("Search")));
			Assert.assertEquals(true, SearchApp.isDisplayed());
			SearchApp.click();
			System.out.println("Search is visible and clickable.");
			app_logs.debug("Search is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Search is not visible or clickable.");
		}
		
	
		try 
		{  
			Thread.sleep(2000);
			// Verify SearchBar
			WebElement Searchbar=driver.findElement((By.xpath(object.getProperty("SearchBar"))));
			Assert.assertEquals(true, Searchbar.isDisplayed());
			System.out.println("SearchBar is visible and clickable.");
			app_logs.debug("SearchBar is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("SearchBar is not visible or clickable.");
		}
		try 
		{
			// Verify Google Search button
			WebElement SearchButton = driver.findElement(By.xpath(object.getProperty("GoogleSearchButton")));
			Assert.assertEquals(true, SearchButton.isDisplayed());
			System.out.println("GoogleSeachButton is displayed – Assert passed");
			app_logs.debug("GoogleSeachButton is visible and clickable.");
		} 
		catch (Exception e) 
		{
			app_logs.debug("GoogleSeachButton is not visible or clickable.");
		}
		try 
		{
			Thread.sleep(2000);
			// Verify Feeling Lucky button
			WebElement FeelingLucky =driver.findElement(By.xpath(object.getProperty("FeelingLuckyButton")));
			Assert.assertEquals(true, FeelingLucky.isDisplayed());
            System.out.println("FeelingLuckyButton is displayed – Assert passed");
			app_logs.debug("FeelingLuckyButton is visible and clickable.");
			System.out.println("------TC_3.2 Executed--------");
			Thread.sleep(1500);
		} 
		catch (Exception e) 
		{
			app_logs.debug("FeelingLuckyButton is not visible or clickable.");
		}
	}
}
