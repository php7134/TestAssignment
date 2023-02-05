package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyNews extends TestCore
{
	@Test
	public void verifyNewsApp() throws IOException, InterruptedException
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
			// Verify News
			WebElement NewsApp = driver.findElement(By.xpath(object.getProperty("News")));
			Assert.assertEquals(true, NewsApp.isDisplayed());
			System.out.println("News is visible and clickable.");
			app_logs.debug("News is visible and clickable.");
			NewsApp.click();
		}
		catch (Exception e)
		{
			app_logs.debug("News is not visible or clickable.");
		}

		try
		{
			Thread.sleep(1500);
			// Verify NewsLogo
			WebElement NewsLogo = driver.findElement(By.xpath(object.getProperty("NewsLogo")));
			Assert.assertEquals(true, NewsLogo.isDisplayed());
			System.out.println("NewsLogo is visible and clickable.");
			app_logs.debug("NewsLogo is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("NewsLogo is not visible or clickable.");
		}

		try
		{
			// Verify TopStories
			Thread.sleep(2000);
			WebElement TopStories = driver.findElement(By.xpath(object.getProperty("TopStories")));
			Assert.assertEquals(true, TopStories.isDisplayed());
			System.out.println("TopStories is visible and clickable.");
			app_logs.debug("TopStories is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.6 Executed--------");
			
		}
		catch (Exception e) 
		{
			app_logs.debug("TopStories is not visible or clickable.");
		}
		
	}
}
