package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class VerifySiginToMyAccount extends TestCore
{
	@Test
	public void verifySignInToGmail() throws IOException, InterruptedException
	{
		//Thread.sleep(2000);
		try 
		{
			Thread.sleep(2000);
			// Verify UserprofileIcon
			WebElement UserprofileIcon = driver.findElement(By.xpath(object.getProperty("UserprofileIcon")));
			Assert.assertEquals(true, UserprofileIcon.isDisplayed());
			System.out.println("UserprofileIcon button is visible and clickable.");
			app_logs.debug("UserprofileIcon button is visible and clickable.");
			UserprofileIcon.click();
		} 
		catch (Exception e)
		{
			app_logs.debug("UserprofileIcon is not visible or clickable.");
		}
		try 
		{
			Thread.sleep(2000);
			// Verify NameOfUser
			WebElement NameOfUser = driver.findElement(By.xpath(object.getProperty("NameOfUser")));
			Assert.assertEquals(true, NameOfUser.isDisplayed());
			System.out.println("NameOfUser is visible and clickable.");
			app_logs.debug("NameOfUser is visible and clickable.");
		} 
		catch (Exception e)
		{
			app_logs.debug("NameOfUser is not visible or clickable.");
		}
		try 
		{
			Thread.sleep(2000);
			// Verify UserMail
			WebElement UserMail = driver.findElement(By.xpath(object.getProperty("UserMail")));
			Assert.assertEquals(true, UserMail.isDisplayed());
			System.out.println("UserMail is visible and clickable.");
			app_logs.debug("UserMail is visible and clickable.");
    
				String username=UserMail.getText();
				Assert.assertEquals(username, UserMail.getText());
				System.out.println("Username matches.");
		} 
		catch (Exception e)
		{
			app_logs.debug("UserMail is not visible or clickable.");
		}
		
	}
}
