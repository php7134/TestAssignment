package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyPlay extends TestCore 
{
	@Test
	public void verifyPlayApp() throws IOException, InterruptedException
	{
		try
		{
			// Verify Grid icon
			WebElement Grid = driver.findElement(By.xpath(object.getProperty("Gridicon")));
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
			// Verify Play
			WebElement PlayApp = driver.findElement(By.xpath(object.getProperty("Play")));
			Assert.assertEquals(true, PlayApp.isDisplayed());
			System.out.println("Play is visible and clickable.");
			app_logs.debug("Play is visible and clickable.");
			PlayApp.click();
		}
		catch (Exception e)
		{
			app_logs.debug("Play is not visible or clickable.");
		}
		try
		{
			Thread.sleep(1500);
			// Verify GooglePlayLogo
			WebElement GooglePlayLogo = driver.findElement(By.xpath(object.getProperty("GooglePlayLogo")));
			Assert.assertEquals(true, GooglePlayLogo.isDisplayed());
			System.out.println("GooglePlayLogo is visible and clickable.");
			app_logs.debug("GooglePlayLogo is visible and clickable.");

		}
		catch (Exception e)
		{
			app_logs.debug("GooglePlayLogo is not visible or clickable.");
		}

		try
		{
			// Verify Searchbar
			WebElement Searchbar = driver.findElement(By.xpath(object.getProperty("Searchbar")));
			Assert.assertEquals(true, Searchbar.isDisplayed());
			System.out.println("Searchbar is visible and clickable.");
			app_logs.debug("Searchbar is visible and clickable.");

		}
		catch (Exception e)
		{
			app_logs.debug("Searchbar is not visible or clickable.");
		}
		try 
		{
			// Verify Entertainment
			Thread.sleep(1500);
			WebElement Entertainment = driver.findElement(By.xpath(object.getProperty("Entertainment")));
			Assert.assertEquals(true, Entertainment.isDisplayed());
			System.out.println("Entertainment is visible and clickable.");
			app_logs.debug("Entertainment is visible and clickable.");

		} 
		catch (Exception e)
		{
			app_logs.debug("Entertainment is not visible or clickable.");
		}
		try
		{
			// Verify Apps
			WebElement Apps = driver.findElement(By.xpath(object.getProperty("Apps")));
			Assert.assertEquals(true, Apps.isDisplayed());
			System.out.println("Apps is visible and clickable.");
			app_logs.debug("Apps is visible and clickable.");

		} 
		catch (Exception e)
		{
			app_logs.debug("Apps is not visible or clickable.");
		}
		try
		{
			// Verify Movies
			Thread.sleep(1500);
			WebElement Movies = driver.findElement(By.xpath(object.getProperty("Movies")));
			Assert.assertEquals(true, Movies.isDisplayed());
			System.out.println("Movies is visible and clickable.");
			app_logs.debug("Movies is visible and clickable.");

		}
		catch (Exception e)
		{
			app_logs.debug("Movies is not visible or clickable.");
		}
		try {
			// Verify Books
			Thread.sleep(1500);
			WebElement Books =driver.findElement(By.xpath(object.getProperty("Books")));
			Assert.assertEquals(true, Books.isDisplayed());
			System.out.println("Books is visible and clickable.");
			app_logs.debug("Books is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Books is not visible or clickable.");
		}
		try {
			// Verify Devices
			Thread.sleep(1500);
			WebElement Devices = driver.findElement(By.xpath(object.getProperty("Devices")));
			Assert.assertEquals(true, Devices.isDisplayed());
			System.out.println("Devices is visible and clickable.");
			app_logs.debug("Devices is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.5 Executed--------");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Devices is not visible or clickable.");
		}
	}
}
