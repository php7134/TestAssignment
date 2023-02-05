package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyDrive extends TestCore 
{
	@Test
	public void verifyDriveApp() throws IOException, InterruptedException
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
			// Verify Drive
			WebElement DriveApp = driver.findElement(By.xpath(object.getProperty("Drive")));
			Assert.assertEquals(true, DriveApp.isDisplayed());
			System.out.println("Drive is visible and clickable.");
			app_logs.debug("Drive is visible and clickable.");
			DriveApp.click();
		} 
		catch (Exception e)
		{
			app_logs.debug("Drive is not visible or clickable.");
		}

		try
		{
			Thread.sleep(1500);
			// Verify DriveLogo
			WebElement DriveLogo = driver.findElement(By.xpath(object.getProperty("DriveLogo")));
			Assert.assertEquals(true, DriveLogo.isDisplayed());
			System.out.println("DriveLogo is visible and clickable.");
			app_logs.debug("DriveLogo is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("DriveLogo is not visible or clickable.");
		}

		try
		{
			// Verify GotoDrive
			Thread.sleep(1500);
			WebElement GotoDrive = driver.findElement(By.xpath(object.getProperty("GotoDrive")));
			Assert.assertEquals(true, GotoDrive.isDisplayed());
			System.out.println("GotoDrive is visible and clickable.");
			app_logs.debug("GotoDrive is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("GotoDrive is not visible or clickable.");
		}
		try 
		{
			// Verify TryDriveForYourTeam
			Thread.sleep(1500);
			WebElement TryDriveForYourTeam = driver.findElement(By.xpath(object.getProperty("TryDriveForYourTeam")));
			Assert.assertEquals(true, TryDriveForYourTeam.isDisplayed());
			System.out.println("TryDriveForYourTeam is visible and clickable.");
			app_logs.debug("TryDriveForYourTeam is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.9 Executed--------");

		} 
		catch (Exception e)
		{
			app_logs.debug("TryDriveForYourTeam is not visible or clickable.");
		}
	}
}
