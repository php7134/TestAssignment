package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dd_core.TestCore;

public class verifyTranslate extends TestCore 
{
	@Test
	public void verifyTranslateApp() throws IOException, InterruptedException
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
			// Verify Translate
			WebElement Translate = driver.findElement(By.xpath(object.getProperty("Translate")));
			Assert.assertEquals(true, Translate.isDisplayed());
			System.out.println("Translate is visible and clickable.");
			app_logs.debug("Translate is visible and clickable.");
			Translate.click();		
		} 
		catch (Exception e)
		{
			app_logs.debug("Translate is not visible or clickable.");
		}


		try
		{
			// Verify GoogleTranslateLogo
			WebElement GoogleTranslateLogo = driver.findElement(By.xpath(object.getProperty("GoogleTranslateLogo")));
			Assert.assertEquals(true, GoogleTranslateLogo.isDisplayed());
			System.out.println("GoogleTranslateLogo is visible and clickable.");
			app_logs.debug("GoogleTranslateLogo is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("GoogleTranslateLogo is not visible or clickable.");
		}

		try
		{
			// Verify Text
			WebElement Text = driver.findElement(By.xpath(object.getProperty("Text")));
			Assert.assertEquals(true, Text.isDisplayed());
			System.out.println("Text is visible and clickable.");
			app_logs.debug("Text is visible and clickable.");
			
		} 
		catch (Exception e)
		{
			app_logs.debug("Text is not visible or clickable.");
		}

		try
		{
			// Verify Documents
			WebElement Documents = driver.findElement(By.xpath(object.getProperty("Documents")));
			Assert.assertEquals(true, Documents.isDisplayed());
			System.out.println("Documents is visible and clickable.");
			app_logs.debug("Documents is visible and clickable.");
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println("------TC_3.10 Executed--------");
			
		} 
		catch (Exception e) 
		{
			app_logs.debug("Documents is not visible or clickable.");
		}
		
	}
}
