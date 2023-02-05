package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyMaps extends TestCore {
	@Test
	public void verifyMapsApp() throws IOException, InterruptedException {
		try 
		{
			app_logs.debug("Executing Search App Launching Test");
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
		try 
		{
			// Verify Maps
			WebElement MapsApp = driver.findElement(By.xpath(object.getProperty("Maps")));
			Assert.assertEquals(true, MapsApp.isDisplayed());
			MapsApp.click();
			System.out.println("Maps is visible and clickable - Assert passed.");
			app_logs.debug("Maps is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("Maps is not visible or clickable.");
		}
		
		try 
		{
			Thread.sleep(2000);
			// Verify MapsSearchBar
			WebElement MapsSearchBar = driver.findElement(By.xpath(object.getProperty("MapsSearchBar")));
			Assert.assertEquals(true, MapsSearchBar.isDisplayed());
			System.out.println("SearchBar is visible and clickable.");
			app_logs.debug("SearchBar is visible and clickable.");
			driver.navigate().back();
			System.out.println("------TC_3.3 Executed--------");
			Thread.sleep(1500);
		
			
		}
		catch (Exception e) 
		{
			app_logs.debug("SearchBar is not visible or clickable.");
		}
	}
}
