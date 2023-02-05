package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyPhotos extends TestCore 
{
	@Test
	public void verifyPhotosApp() throws IOException, InterruptedException
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
			// Verify Photos
			WebElement Photos = driver.findElement(By.xpath(object.getProperty("Photos")));
			Assert.assertEquals(true, Photos.isDisplayed());
			System.out.println("Photos is visible and clickable.");
			app_logs.debug("Photos is visible and clickable.");
			Photos.click();
		} 
		catch (Exception e)
		{
			app_logs.debug("Photos is not visible or clickable.");
		}
        //Thread.sleep(4000);
		try
		{
			// Verify GooglePhotosLogo
			WebElement GooglePhotosLogo = driver.findElement(By.xpath(object.getProperty("GooglePhotosLogo")));
			Assert.assertEquals(true, GooglePhotosLogo.isDisplayed());
			System.out.println("GooglePhotosLogo is visible and clickable.");
		} 
		catch (Exception e)
		{
			app_logs.debug("GooglePhotosLogo is not visible or clickable.");
		}

		try
		{
			// Verify GetGooglePhotos
			WebElement GetGooglePhotos = driver.findElement(By.xpath(object.getProperty("GetGooglePhotos")));
			Assert.assertEquals(true, GetGooglePhotos.isDisplayed());
			System.out.println("GetGooglePhotos is visible and clickable.");
			app_logs.debug("GetGooglePhotos is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GetGooglePhotos is not visible or clickable.");
		}
		

		try
		{
			// Verify GotoGooglePhotos
			WebElement GotoGooglePhotos = driver.findElement(By.xpath(object.getProperty("GotoGooglePhotos")));
			Assert.assertEquals(true, GotoGooglePhotos.isDisplayed());
			System.out.println("GotoGooglePhotos is visible and clickable.");
			app_logs.debug("GotoGooglePhotos is visible and clickable.");
			System.out.println("------TC_3.10 Executed--------");
			driver.navigate().back();
			Thread.sleep(1500);
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GotoGooglePhotos is not visible or clickable.");
		}
		
	}
}
