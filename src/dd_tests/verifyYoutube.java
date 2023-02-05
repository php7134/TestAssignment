package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyYoutube extends TestCore 
{
	@Test
	public void verifyYoutubeApp() throws IOException, InterruptedException
	{
		try 
		{
			// Verify Grid icon
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
			// Verify Grid Youtube
			WebElement YoutubeApp = driver.findElement(By.xpath(object.getProperty("Youtube")));
			Assert.assertEquals(true, YoutubeApp.isDisplayed());
			System.out.println("Youtube is visible and clickable.");
			app_logs.debug("Youtube is visible and clickable.");
			YoutubeApp.click();
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Youtube is not visible or clickable.");
		}

		try
		{
			Thread.sleep(1500);
			// Verify YoutubeLogo
			WebElement YoutubeLogo =driver.findElement(By.xpath(object.getProperty("YoutubeLogo")));
			Assert.assertEquals(true, YoutubeLogo.isDisplayed());
			System.out.println("YoutubeLogo is visible and clickable.");
			app_logs.debug("YoutubeLogo is visible and clickable.");
			
		}
		catch (Exception e)
		{
			app_logs.debug("YoutubeLogo is not visible or clickable.");
		}

		try
		{
			// Verify YoutubeSearchbar
			Thread.sleep(1500);
			WebElement YoutubeSearchbar = driver.findElement(By.xpath(object.getProperty("YoutubeSearchbar")));
			Assert.assertEquals(true, YoutubeSearchbar.isDisplayed());
			System.out.println("YoutubeSearchbar is visible and clickable.");
			app_logs.debug("YoutubeSearchbar is visible and clickable.");
			
		}
		catch (Exception e) 
		{
			app_logs.debug("YoutubeSearchbar is not visible or clickable.");
		}
		try
		{
			// Verify SigInButton
			Thread.sleep(1500);
			WebElement SigInButton = driver.findElement(By.xpath(object.getProperty("SigInButton")));
			Assert.assertEquals(true, SigInButton.isDisplayed());
			System.out.println("SigInButton is visible and clickable.");
			app_logs.debug("SigInButton is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("------TC_3.4 Executed--------");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("SigInButton is not visible or clickable.");
		}
	}
}
