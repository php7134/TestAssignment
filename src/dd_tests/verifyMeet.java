package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyMeet extends TestCore 
{
	@Test
	public void verifyMeetApp() throws IOException, InterruptedException
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
			// Verify Meet
			WebElement MeetApp = driver.findElement(By.xpath(object.getProperty("Meet")));
			Assert.assertEquals(true, MeetApp.isDisplayed());
			System.out.println("Meet is visible and clickable.");
			app_logs.debug("Meet is visible and clickable.");
			MeetApp.click();
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Meet is not visible or clickable.");
		}

		try
		{
			Thread.sleep(1500);
			// Verify MeetLogo
			WebElement MeetLogo = driver.findElement(By.xpath(object.getProperty("MeetLogo")));
			Assert.assertEquals(true, MeetLogo.isDisplayed());
			System.out.println("MeetLogo is visible and clickable.");
			app_logs.debug("MeetLogo is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("MeetLogo is not visible or clickable.");
		}

		try
		{
			// Verify JoinMeeting
			Thread.sleep(1500);
			WebElement JoinMeeting = driver.findElement(By.xpath(object.getProperty("JoinMeeting")));
			Assert.assertEquals(true, JoinMeeting.isDisplayed());
			System.out.println("JoinMeeting is visible and clickable.");
			app_logs.debug("JoinMeeting is visible and clickable.");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("JoinMeeting is not visible or clickable.");
		}
		try 
		{
			// Verify StartMeeting
			Thread.sleep(1500);
			WebElement StartMeeting = driver.findElement(By.xpath(object.getProperty("StartMeeting")));
			Assert.assertEquals(true, StartMeeting.isDisplayed());
			System.out.println("StartMeeting is visible and clickable.");
			app_logs.debug("StartMeeting is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.8 Executed--------");

			
		} 
		catch (Exception e)
		{
			app_logs.debug("StartMeeting is not visible or clickable.");
		}
	}
}
